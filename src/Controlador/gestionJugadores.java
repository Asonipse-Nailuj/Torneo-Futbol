/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import Modelo.Jugador;
import Modelo.Partido;
import Modelo.RenderTable;
import Vista.GestionarJugadores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gustavo
 */
public class gestionJugadores implements ActionListener {

    GestionarJugadores gestionarjugadores;
    ArrayList<Jugador> listajugadores;

    public gestionJugadores(GestionarJugadores gestionarjugadores, ArrayList<Jugador> listajugadores) {
        this.gestionarjugadores = gestionarjugadores;
        this.listajugadores = listajugadores;

        this.gestionarjugadores.btnConsultarJugador.addActionListener(this);
        this.gestionarjugadores.btnSalirGestionJugadores.addActionListener(this);
        this.gestionarjugadores.txtIdentificacionJugadorGestion.addActionListener(this);

        AccionCampos();
        cargarDatos();
    }

    public void inicio() {
        gestionarjugadores.setTitle("Login Jugador");
        gestionarjugadores.setLocationRelativeTo(null);
        gestionarjugadores.setVisible(true);
    }

    public void cargarDatos() {
        // Se trae la lista de jugadores registrada en la base de datos

        listajugadores = Conexion.getJugadores();
        System.out.println("Iniciando lista");

        // Limpiar el modelo antes de agregar nuevos datos
        DefaultTableModel modelo = (DefaultTableModel) gestionarjugadores.tableJugadores.getModel();

        modelo.setRowCount(0);

        for (Jugador jugador : listajugadores) {

            // Agregar los datos del jugador al modelo de la tabla
            Object[] rowData = new Object[8];
            rowData[0] = jugador.getNombre();
            rowData[1] = jugador.getApellido();
            rowData[2] = String.valueOf(jugador.getDocumento());
            rowData[3] = String.valueOf(jugador.getTelefono());
            rowData[4] = jugador.getEmail();

            JButton verDetalle = new JButton();
            ImageIcon iconoDetalle = new ImageIcon("src/imagenes/verDetalle.png");
            verDetalle.setIcon(iconoDetalle);
            rowData[5] = verDetalle;

            JButton modificar = new JButton();
            ImageIcon iconoModificar = new ImageIcon("src/imagenes/modificar.png");
            verDetalle.setIcon(iconoModificar);
            rowData[6] = modificar;
            
            JButton eliminar = new JButton();
            ImageIcon iconoEliminar = new ImageIcon("src/imagenes/eliminar.png");
            verDetalle.setIcon(iconoEliminar);
            rowData[7] = eliminar;

            modelo.addRow(rowData);
        }

        gestionarjugadores.tableJugadores.setDefaultRenderer(Object.class, new RenderTable());
        gestionarjugadores.tableJugadores.setModel(modelo);
    }

    public void listar(Jugador jugador) { // Funcion para mostrar los datos en Jtable
        DefaultTableModel modelo = (DefaultTableModel) gestionarjugadores.tableJugadores.getModel();

        // Limpiar el modelo antes de agregar nuevos datos
        modelo.setRowCount(0);

        // Agregar los datos del jugador al modelo de la tabla
        String[] rowData = new String[5];
        rowData[0] = jugador.getNombre();
        rowData[1] = jugador.getApellido();
        rowData[2] = String.valueOf(jugador.getDocumento());
        rowData[3] = String.valueOf(jugador.getTelefono());
        rowData[4] = jugador.getEmail();

        modelo.addRow(rowData);
        gestionarjugadores.tableJugadores.setModel(modelo);

    }

    public void AccionCampos() {
        // Agregar un FocusListener al JTextField
        gestionarjugadores.txtIdentificacionJugadorGestion.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Acción a realizar cuando el JTextField obtiene el foco

                gestionarjugadores.txtIdentificacionJugadorGestion.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Acción a realizar cuando el JTextField pierde el foco
                if (gestionarjugadores.txtIdentificacionJugadorGestion.getText().isEmpty()) {
                    gestionarjugadores.txtIdentificacionJugadorGestion.setText("Identificacion");
                }
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == gestionarjugadores.btnConsultarJugador) {
            //La lista ya debe estar llena, se debe llenar cuando se inicie el programa con la base de datos
            int documento = Integer.parseInt(gestionarjugadores.txtIdentificacionJugadorGestion.getText());
            Jugador jugador = Conexion.getDatosJugador(documento); // Tomo los datos del jugador

            if (jugador != null) {//Revisa si el jugador esta en la lista
                listar(jugador); //Llamo la funcion para mostrar en la tabla
            } else {
                System.out.println("Jugador no encontrado");
            }

        } else {
            if (e.getSource() == gestionarjugadores.btnSalirGestionJugadores) {
                gestionarjugadores.dispose();
            }
        }
    }

}

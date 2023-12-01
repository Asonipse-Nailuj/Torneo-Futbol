/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import Modelo.Jugador;
import Modelo.RenderTable;
import Vista.GestionarJugadores;
import Vista.InformacionJugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gustavo
 */
public class gestionJugadores implements ActionListener, MouseListener {

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
            verDetalle.setText("Ver Detalle");
            rowData[5] = verDetalle;
            JButton modificar = new JButton();
            modificar.setText("Modificar");
            rowData[6] = modificar;
            JButton eliminar = new JButton();
            eliminar.setText("Eliminar");
            rowData[7] = eliminar;

            modelo.addRow(rowData);
        }

        gestionarjugadores.tableJugadores.setDefaultRenderer(Object.class, new RenderTable());
        gestionarjugadores.tableJugadores.setModel(modelo);
        gestionarjugadores.tableJugadores.addMouseListener(this);
    }

    public void listar(Jugador jugador) { // Funcion para mostrar los datos en Jtable
        DefaultTableModel modelo = (DefaultTableModel) gestionarjugadores.tableJugadores.getModel();

        // Limpiar el modelo antes de agregar nuevos datos
        modelo.setRowCount(0);

        // Agregar los datos del jugador al modelo de la tabla
        Object[] rowData = new Object[5];
        rowData[0] = jugador.getNombre();
        rowData[1] = jugador.getApellido();
        rowData[2] = String.valueOf(jugador.getDocumento());
        rowData[3] = String.valueOf(jugador.getTelefono());
        rowData[4] = jugador.getEmail();
        JButton verDetalle = new JButton();
        verDetalle.setText("Ver Detalle");
        rowData[5] = verDetalle;
        JButton modificar = new JButton();
        modificar.setText("Modificar");
        rowData[6] = modificar;
        JButton eliminar = new JButton();
        eliminar.setText("Eliminar");
        rowData[7] = eliminar;

        modelo.addRow(rowData);

        gestionarjugadores.tableJugadores.setDefaultRenderer(Object.class, new RenderTable());
        gestionarjugadores.tableJugadores.setModel(modelo);
        gestionarjugadores.tableJugadores.addMouseListener(this);
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

    @Override
    public void mouseClicked(MouseEvent e) {
        if (gestionarjugadores.tableJugadores.columnAtPoint(e.getPoint()) == 5) {
            int documento = Integer.parseInt((String) gestionarjugadores.tableJugadores.getValueAt(gestionarjugadores.tableJugadores.rowAtPoint(e.getPoint()), 2));

            Jugador jugador = Conexion.getDatosJugador(documento);

            InformacionJugador detalle = new InformacionJugador();
            informacionJugador controlador = new informacionJugador(detalle, jugador);
            controlador.inicio();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}

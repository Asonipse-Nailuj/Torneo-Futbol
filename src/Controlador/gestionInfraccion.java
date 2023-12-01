/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Conexion;
import Modelo.Jugador;
import Modelo.Partido;
import Vista.GestionarInfraccion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gustavo
 */
public class gestionInfraccion implements ActionListener{
    
    GestionarInfraccion gestionarinfraccion;
    Partido partido;
    ArrayList<Jugador> listajugadores;

    public gestionInfraccion(GestionarInfraccion gestionarinfraccion, ArrayList<Jugador> listajugadores) {
        this.gestionarinfraccion = gestionarinfraccion;
        this.listajugadores = listajugadores;
        
        this.gestionarinfraccion.btnConsultarInfraccion.addActionListener(this);
        this.gestionarinfraccion.btnSalirGestionInfracciones.addActionListener(this);
        this.gestionarinfraccion.txtIdentificacionJugadorInfraccion.addActionListener(this);
        
        AccionCampos();
        cargarDatos();
    }
    
    public void listar(JTable tabla, Jugador jugador) { // Funcion para mostrar los datos en Jtable
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();

        // Limpiar el modelo antes de agregar nuevos datos
        modelo.setRowCount(0);

        // Agregar los datos del jugador al modelo de la tabla
        String[] rowData = new String[2];
        rowData[0] = jugador.getNombre();
        rowData[1] = jugador.getApellido();
        rowData[2] = String.valueOf(jugador.getDocumento());
        rowData[3] = String.valueOf(jugador.getTelefono());
        rowData[4] = jugador.getEmail();

        modelo.addRow(rowData);
        gestionarinfraccion.tableInfraccion.setModel(modelo);

    }
    
    public void cargarDatos() {
        // Se trae la lista de jugadores registrada en la base de datos
        //ArrayList<Jugador> listado_jugadores = Conexion.getJugadores();
        
        listajugadores = new ArrayList(20); // Inicializa un ArrayList con una capacidad inicial de 50
        listajugadores = Conexion.getJugadores();
        System.out.println("Iniciando lista");

        // ....
    }
    
    public void inicio() {
        gestionarinfraccion.setTitle("Login Jugador");
        gestionarinfraccion.setLocationRelativeTo(null);
        gestionarinfraccion.setVisible(true);
    }
    
    public void AccionCampos(){
        // Agregar un FocusListener al JTextField
        gestionarinfraccion.txtIdentificacionJugadorInfraccion.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Acción a realizar cuando el JTextField obtiene el foco
                
                gestionarinfraccion.txtIdentificacionJugadorInfraccion.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Acción a realizar cuando el JTextField pierde el foco
                if(gestionarinfraccion.txtIdentificacionJugadorInfraccion.getText().isEmpty()){
                gestionarinfraccion.txtIdentificacionJugadorInfraccion.setText("Identificacion");
                }
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == gestionarinfraccion.btnConsultarInfraccion) {
            //La lista ya debe estar llena, se debe llenar cuando se inicie el programa con la base de datos
            if (partido.buscarJugador(Integer.parseInt(gestionarinfraccion.txtIdentificacionJugadorInfraccion.getText()), listajugadores)) {//Revisa si el jugador esta en la lista
                Jugador jugador = new Jugador();
                jugador = partido.BuscarJugador2(Integer.parseInt(gestionarinfraccion.txtIdentificacionJugadorInfraccion.getText()), listajugadores); // Tomo los datos del jugador
                listar(gestionarinfraccion.tableInfraccion, jugador); //Llamo la funcion para mostrar en la tabla
            }
            else{
                System.out.println("Jugador no encontrado");
            }
        }
        else{
            if (e.getSource() == gestionarinfraccion.btnSalirGestionInfracciones) {
                gestionarinfraccion.dispose();
            }
        }
    }
    
}

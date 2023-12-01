/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Conexion;
import Modelo.Jugador;
import Modelo.Partido;
import Vista.GestionarCalificaciones;
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
public class gestionCalificaciones implements ActionListener{
    
    GestionarCalificaciones gestionarcalificaciones;
    Partido partido;
    ArrayList<Jugador> listajugadores;

    public gestionCalificaciones(GestionarCalificaciones gestionarcalificaciones, ArrayList<Jugador> listajugadores) {
        this.gestionarcalificaciones = gestionarcalificaciones;
        this.listajugadores = listajugadores;
        
        this.gestionarcalificaciones.btnConsultarCalificacion.addActionListener(this);
        this.gestionarcalificaciones.btnSalirGestionCalificaciones.addActionListener(this);
        this.gestionarcalificaciones.txtIdentificacionJugadorCalificacion.addActionListener(this);
        
        AccionCampos();
        cargarDatos();
    }
    
    public void cargarDatos() {
        // Se trae la lista de jugadores registrada en la base de datos
        //ArrayList<Jugador> listado_jugadores = Conexion.getJugadores();
        
        listajugadores = new ArrayList(20); // Inicializa un ArrayList con una capacidad inicial de 50
        listajugadores = Conexion.getJugadores();
        System.out.println("Iniciando lista");

        // ....
    }
    
    public void listar(JTable tabla, Jugador jugador) { // Funcion para mostrar los datos en Jtable
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();

        // Limpiar el modelo antes de agregar nuevos datos
        modelo.setRowCount(0);

        // Agregar los datos del jugador al modelo de la tabla
        String[] rowData = new String[5];
        rowData[2] = String.valueOf(jugador.getDocumento());
        rowData[3] = String.valueOf(jugador.getTelefono());
        rowData[4] = jugador.getEmail();

        modelo.addRow(rowData);
        gestionarcalificaciones.tableCalificacion.setModel(modelo);

    }
    
    public void inicio() {
        gestionarcalificaciones.setTitle("Login Jugador");
        gestionarcalificaciones.setLocationRelativeTo(null);
        gestionarcalificaciones.setVisible(true);
    }
    
    public void AccionCampos(){
        // Agregar un FocusListener al JTextField
        gestionarcalificaciones.txtIdentificacionJugadorCalificacion.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Acción a realizar cuando el JTextField obtiene el foco
                
                gestionarcalificaciones.txtIdentificacionJugadorCalificacion.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Acción a realizar cuando el JTextField pierde el foco
                if(gestionarcalificaciones.txtIdentificacionJugadorCalificacion.getText().isEmpty()){
                gestionarcalificaciones.txtIdentificacionJugadorCalificacion.setText("Identificacion");
                }
            }
        });
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == gestionarcalificaciones.btnConsultarCalificacion) {
            //La lista ya debe estar llena, se debe llenar cuando se inicie el programa con la base de datos
            if (partido.buscarJugador(Integer.parseInt(gestionarcalificaciones.txtIdentificacionJugadorCalificacion.getText()), listajugadores)) {//Revisa si el jugador esta en la lista
                Jugador jugador = new Jugador();
                jugador = partido.BuscarJugador2(Integer.parseInt(gestionarcalificaciones.txtIdentificacionJugadorCalificacion.getText()), listajugadores); // Tomo los datos del jugador
                listar(gestionarcalificaciones.tableCalificacion, jugador); //Llamo la funcion para mostrar en la tabla
            }
            else{
                System.out.println("Jugador no encontrado");
            }
        }
        else{
            if (e.getSource() == gestionarcalificaciones.btnSalirGestionCalificaciones) {
                gestionarcalificaciones.dispose();
            }
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Jugador;
import Modelo.Partido;
import Vista.GestionarJugadores;
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
public class gestionJugadores implements ActionListener{
    
    GestionarJugadores gestionarjugadores;
    Partido partido;
    Jugador jugador;
    ArrayList<Jugador> listajugadores;
    DefaultTableModel modelo = new DefaultTableModel();

    public gestionJugadores(GestionarJugadores gestionarjugadores, Partido partido, ArrayList<Jugador> listajugadores) {
        this.gestionarjugadores = gestionarjugadores;
        this.partido = partido;
        this.listajugadores = listajugadores;
        
        this.gestionarjugadores.btnConsultarJugador.addActionListener(this);
        this.gestionarjugadores.btnSalirGestionJugadores.addActionListener(this);
        this.gestionarjugadores.txtIdentificacionJugadorGestion.addActionListener(this);
        
        AccionCampos();
    }
    
    public void inicio() {
        gestionarjugadores.setTitle("Login Jugador");
        gestionarjugadores.setLocationRelativeTo(null);
        gestionarjugadores.setVisible(true);
    }
    
    public void listar(JTable tabla, Jugador jugador){ // Funcion para mostrar los datos en Jtable
     DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();

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
    
    public void AccionCampos(){
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
                if(gestionarjugadores.txtIdentificacionJugadorGestion.getText().isEmpty()){
                gestionarjugadores.txtIdentificacionJugadorGestion.setText("Identificacion");
                }
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == gestionarjugadores.btnConsultarJugador) {
            //La lista ya debe estar llena, se debe llenar cuando se inicie el programa con la base de datos
            if(partido.buscarJugador(Integer.parseInt(gestionarjugadores.txtIdentificacionJugadorGestion.getText()), listajugadores)){//Revisa si el jugador esta en la lista
                Jugador jugador= new Jugador();
                jugador = partido.BuscarJugador2(Integer.parseInt(gestionarjugadores.txtIdentificacionJugadorGestion.getText()), listajugadores); // Tomo los datos del jugador
                listar(gestionarjugadores.tableJugadores, jugador); //Llamo la funcion para mostrar en la tabla
            }
            
        }
        else{
            if (e.getSource() == gestionarjugadores.btnSalirGestionJugadores) {
                gestionarjugadores.dispose();
            }
        }
    }
    
}

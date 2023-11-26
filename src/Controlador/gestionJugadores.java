/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Vista.GestionarJugadores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 *
 * @author Gustavo
 */
public class gestionJugadores implements ActionListener{
    
    GestionarJugadores gestionarjugadores;

    public gestionJugadores(GestionarJugadores gestionarjugadores) {
        this.gestionarjugadores = gestionarjugadores;
        
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
            
        }
        else{
            if (e.getSource() == gestionarjugadores.btnSalirGestionJugadores) {
                gestionarjugadores.dispose();
            }
        }
    }
    
}

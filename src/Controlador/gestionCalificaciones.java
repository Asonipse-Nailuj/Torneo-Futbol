/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Vista.GestionarCalificaciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 *
 * @author Gustavo
 */
public class gestionCalificaciones implements ActionListener{
    
    GestionarCalificaciones gestionarcalificaciones;

    public gestionCalificaciones(GestionarCalificaciones gestionarcalificaciones) {
        this.gestionarcalificaciones = gestionarcalificaciones;
        
        this.gestionarcalificaciones.btnConsultarCalificacion.addActionListener(this);
        this.gestionarcalificaciones.btnSalirGestionCalificaciones.addActionListener(this);
        this.gestionarcalificaciones.txtIdentificacionJugadorCalificacion.addActionListener(this);
        
        AccionCampos();
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
            
        }
        else{
            if (e.getSource() == gestionarcalificaciones.btnSalirGestionCalificaciones) {
                gestionarcalificaciones.dispose();
            }
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Vista.GestionarInfraccion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 *
 * @author Gustavo
 */
public class gestionInfraccion implements ActionListener{
    
    GestionarInfraccion gestionarinfraccion;

    public gestionInfraccion(GestionarInfraccion gestionarinfraccion) {
        this.gestionarinfraccion = gestionarinfraccion;
        
        this.gestionarinfraccion.btnConsultarInfraccion.addActionListener(this);
        this.gestionarinfraccion.btnSalirGestionInfracciones.addActionListener(this);
        this.gestionarinfraccion.txtIdentificacionJugadorInfraccion.addActionListener(this);
        
        AccionCampos();
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
            
        }
        else{
            if (e.getSource() == gestionarinfraccion.btnSalirGestionInfracciones) {
                gestionarinfraccion.dispose();
            }
        }
    }
    
}

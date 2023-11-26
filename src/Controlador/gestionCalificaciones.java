/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Vista.GestionarCalificaciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    }
    
    public void inicio() {
        gestionarcalificaciones.setTitle("Login Jugador");
        gestionarcalificaciones.setLocationRelativeTo(null);
        gestionarcalificaciones.setVisible(true);
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

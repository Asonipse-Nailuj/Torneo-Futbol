/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Vista.GestionarInfraccion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    }
    
    public void inicio() {
        gestionarinfraccion.setTitle("Login Jugador");
        gestionarinfraccion.setLocationRelativeTo(null);
        gestionarinfraccion.setVisible(true);
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

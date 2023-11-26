/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Vista.GestionarJugadores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    }
    
    public void inicio() {
        gestionarjugadores.setTitle("Login Jugador");
        gestionarjugadores.setLocationRelativeTo(null);
        gestionarjugadores.setVisible(true);
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

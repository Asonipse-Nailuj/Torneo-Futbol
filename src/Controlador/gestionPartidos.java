/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Vista.GestionarPartidos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Gustavo
 */
public class gestionPartidos implements ActionListener{
    
    GestionarPartidos gestionarpartidos;

    public gestionPartidos(GestionarPartidos gestionarpartidos) {
        this.gestionarpartidos = gestionarpartidos;
        
        this.gestionarpartidos.btnCrearPartido.addActionListener(this);
        this.gestionarpartidos.btnSalirGestionPartidos.addActionListener(this);
    }
    
    public void inicio() {
        gestionarpartidos.setTitle("Login Jugador");
        gestionarpartidos.setLocationRelativeTo(null);
        gestionarpartidos.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == gestionarpartidos.btnCrearPartido) {
            //Ver Detalle de la tabla lleva a DetalleEquipos
        }
        else{
            gestionarpartidos.dispose();
        }
    }
    
}

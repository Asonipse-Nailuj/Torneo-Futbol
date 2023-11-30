/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.GestionarInfraccionJugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Gustavo
 */
public class gestioninfraccionJugador implements ActionListener{
    GestionarInfraccionJugador gestionarinfraccionjugador;

    public gestioninfraccionJugador(GestionarInfraccionJugador gestionarinfraccionjugador) {
        this.gestionarinfraccionjugador = gestionarinfraccionjugador;
        
        this.gestionarinfraccionjugador.btnSalirGestionInfraccionJugador.addActionListener(this);
    }
    
    public void inicio() {
        gestionarinfraccionjugador.setTitle("Gestionar Infracciones");
        gestionarinfraccionjugador.setLocationRelativeTo(null);
        gestionarinfraccionjugador.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == gestionarinfraccionjugador.btnSalirGestionInfraccionJugador) {
            gestionarinfraccionjugador.dispose();
        }
    }
    
}

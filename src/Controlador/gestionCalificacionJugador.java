/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.DetalleCalificacionesJugador;
import Vista.GestionarCalificaciones;
import Vista.GestionarCalificacionesJugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Gustavo
 */
public class gestionCalificacionJugador implements ActionListener{
    GestionarCalificacionesJugador gestionarcalificaciones;
    DetalleCalificacionesJugador detallecalificacionesJugador;

    public gestionCalificacionJugador(GestionarCalificacionesJugador gestionarcalificaciones) {
        this.gestionarcalificaciones = gestionarcalificaciones;
        
        this.gestionarcalificaciones.btnAgregarCalificacionJugador.addActionListener(this);
        this.gestionarcalificaciones.btnSalirGestionCalificacionJugador.addActionListener(this);
    }
    
    public void inicio() {
        gestionarcalificaciones.setTitle("Gestionar Calificaciones");
        gestionarcalificaciones.setLocationRelativeTo(null);
        gestionarcalificaciones.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == gestionarcalificaciones.btnAgregarCalificacionJugador) {
            detallecalificacionJugador calificacion;
            calificacion = new detallecalificacionJugador(new DetalleCalificacionesJugador());
            calificacion.inicio();
        }
        else{
            if (e.getSource() == gestionarcalificaciones.btnSalirGestionCalificacionJugador) {
                gestionarcalificaciones.dispose();
            }
        }
    }
    
}

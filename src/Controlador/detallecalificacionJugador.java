/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.DetalleCalificacionesJugador;
import Vista.GestionarCalificaciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Gustavo
 */
public class detallecalificacionJugador implements ActionListener{
    DetalleCalificacionesJugador detallecalificaciones;

    public detallecalificacionJugador(DetalleCalificacionesJugador detallecalificaciones) {
        this.detallecalificaciones = detallecalificaciones;
        
        this.detallecalificaciones.btnAceptarCalificacionJugador.addActionListener(this);
        this.detallecalificaciones.btnCancelarCalificacionJugador.addActionListener(this);
        this.detallecalificaciones.btnSalirDetalleCalificacionJugador.addActionListener(this);
    }
    
    public void inicio() {
        detallecalificaciones.setTitle("Detalle Calificaciones");
        detallecalificaciones.setLocationRelativeTo(null);
        detallecalificaciones.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == detallecalificaciones.btnAceptarCalificacionJugador) {
            
        }else{
            if (e.getSource() == detallecalificaciones.btnCancelarCalificacionJugador) {
                
            }
            else{
                detallecalificaciones.dispose();
            }
        }
    }
}

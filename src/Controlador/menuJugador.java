/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Jugador;
import Vista.DetalleCalificacionesJugador;
import Vista.GestionarCalificacionesJugador;
import Vista.GestionarInfraccionJugador;
import Vista.MenuJugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class menuJugador implements ActionListener {

    MenuJugador menujugador;
    GestionarInfraccionJugador gestionarinfraccionjugador;
    GestionarCalificacionesJugador gestionarcalificaciones;
    DetalleCalificacionesJugador detallecalificaciones;

    Jugador jugador;

    public menuJugador(MenuJugador menujugador, Jugador jugador) {
        this.menujugador = menujugador;
        this.jugador = jugador;

        this.menujugador.btnBajaJugador.addActionListener(this);
        this.menujugador.btnCalificacionesJugador.addActionListener(this);
        this.menujugador.btnInfraccionJugador.addActionListener(this);
        this.menujugador.btnSalirMenuJugador.addActionListener(this);
        this.menujugador.btnSalirMenuJugadorr.addActionListener(this);
    }

    public void inicio() {
        menujugador.setTitle("Bienvenido Jugador");
        menujugador.setLocationRelativeTo(null);
        menujugador.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menujugador.btnBajaJugador) {

        } else {
            if (e.getSource() == menujugador.btnCalificacionesJugador) {
                gestionCalificacionJugador calificacion;
                calificacion = new gestionCalificacionJugador(new GestionarCalificacionesJugador());
                calificacion.inicio();
            } else {
                if (e.getSource() == menujugador.btnInfraccionJugador) {
                    gestioninfraccionJugador infraccion;
                    infraccion = new gestioninfraccionJugador(new GestionarInfraccionJugador());
                    infraccion.inicio();
                } else {
                    if (e.getSource() == menujugador.btnSalirMenuJugador) {
                        menujugador.dispose();
                    } else {
                        if (e.getSource() == menujugador.btnSalirMenuJugadorr) {
                            menujugador.dispose();
                        }
                    }
                }
            }
        }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Jugador;
import Vista.GestionarCalificaciones;
import Vista.GestionarEquipos;
import Vista.GestionarInfraccion;
import Vista.GestionarJugadores;
import Vista.GestionarPartidos;
import Vista.InformacionJugador;
import Vista.MenuAdmin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class menuAdmon implements ActionListener {

    MenuAdmin menuadmin;
    GestionarPartidos gestionarpartidos;
    InformacionJugador informacionjugador;
    GestionarEquipos gestionarequipos;
    GestionarCalificaciones gestionarcalificaciones;
    GestionarInfraccion gestionarinfraccion;
    GestionarJugadores gestionarjugadores;
    ArrayList<Jugador> listajugadores;

    public menuAdmon(MenuAdmin menuadmin) {
        this.menuadmin = menuadmin;

        this.menuadmin.btnCalificacion.addActionListener(this);
        this.menuadmin.btnEquipos.addActionListener(this);
        this.menuadmin.btnInfraccion.addActionListener(this);
        this.menuadmin.btnJugadores.addActionListener(this);
        this.menuadmin.btnNotificacion.addActionListener(this);
        this.menuadmin.btnPartidos.addActionListener(this);
        this.menuadmin.btnSalirLoginJugador.addActionListener(this);
        this.menuadmin.btnSalirMenuAdmin.addActionListener(this);
    }

    public void inicio() {
        menuadmin.setTitle("Bienvenido Administrador");
        menuadmin.setLocationRelativeTo(null);
        menuadmin.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == menuadmin.btnCalificacion) {

            gestionCalificaciones calificacion;
            calificacion = new gestionCalificaciones(new GestionarCalificaciones(), listajugadores);
            calificacion.inicio();
        } else {
            if (e.getSource() == menuadmin.btnEquipos) {
                gestionEquipos equipos;
                equipos = new gestionEquipos(new GestionarEquipos());
                equipos.inicio();
            } else {
                if (e.getSource() == menuadmin.btnInfraccion) {
                    gestionInfraccion infraccion;
                    infraccion = new gestionInfraccion(new GestionarInfraccion(), listajugadores);
                    infraccion.inicio();
                } else {
                    if (e.getSource() == menuadmin.btnJugadores) {
                        gestionJugadores jugadores;
                        jugadores = new gestionJugadores(new GestionarJugadores(), listajugadores);
                        jugadores.inicio();
                    } else {
                        if (e.getSource() == menuadmin.btnPartidos) {
                            gestionPartidos partidos;
                            partidos = new gestionPartidos(new GestionarPartidos());
                            partidos.inicio();
                        } else {
                            if (e.getSource() == menuadmin.btnNotificacion) {
                                //PENDIENTE cuando se cree FRAME
                            } else {
                                if (e.getSource() == menuadmin.btnSalirLoginJugador) {

                                } else {
                                    menuadmin.dispose();
                                }
                            }
                        }
                    }
                }
            }
        }
        /*
        JButton boton = (JButton) e.getSource(); //Captura la informacion de boton
        String op=boton.getText();
        
        switch(op){
            case "Partidos": {gestionPartidos partidos;
                    partidos = new gestionPartidos(new GestionarPartidos());
                    partidos.inicio();}
            
            case "Equipos": {gestionEquipos equipos;
                    equipos = new gestionEquipos(new GestionarEquipos());
                    equipos.inicio();}
            
            case "Jugadores": {gestionJugadores jugadores;
                    jugadores = new gestionJugadores(new GestionarJugadores());
                    jugadores.inicio();}
            
            case "Infraccion": {gestionInfraccion infraccion;
                    infraccion = new gestionInfraccion(new GestionarInfraccion());
                    infraccion.inicio();}
            
            case "Calificacion": {gestionCalificaciones calificacion;
                    calificacion = new gestionCalificaciones(new GestionarCalificaciones());
                    calificacion.inicio();}
            
            case "Notificacion": {} //PENDIENTE cuando se cree FRAME
            
            case "Cerrar Sesión": {menuadmin.dispose();}
            
            case "Salir": {}
        }*/
    }

}

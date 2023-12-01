/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Conexion;
import Modelo.Jugador;
import Modelo.Partido;
import Vista.GestionarJugadores;
import Vista.InformacionJugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class informacionJugador implements ActionListener{
    
    InformacionJugador informacionjugador;
    Partido partido;
    ArrayList<Jugador> listajugadores;
    int cedula;

    public informacionJugador(InformacionJugador informacionjugador, Partido partido, ArrayList<Jugador> listajugadores, int cedula) {
        this.informacionjugador = informacionjugador;
        this.partido = partido;
        this.cedula = cedula;
        this.listajugadores = listajugadores;
        
        this.informacionjugador.btnSalirPerfilJugador.addActionListener(this);
        this.informacionjugador.txtApellidoPerfilJugador.addActionListener(this);
        this.informacionjugador.txtDocumentoPerfilJugador.addActionListener(this);
        this.informacionjugador.txtMailPerfilJugador.addActionListener(this);
        this.informacionjugador.txtNombrePerfilJugador.addActionListener(this);
        this.informacionjugador.txtPosicionJugador.addActionListener(this);
        this.informacionjugador.txtPosicionPerfilJugador.addActionListener(this);
        this.informacionjugador.txtSuscripcionJugador.addActionListener(this);
        this.informacionjugador.txtTelefonoPerfilJugador.addActionListener(this);
       
        cargarDatos();
        listar(cedula);
    }
    
    public void inicio() {
        informacionjugador.setTitle("Login Jugador");
        informacionjugador.setLocationRelativeTo(null);
        informacionjugador.setVisible(true);
    }

    public void cargarDatos() {
        // Se trae la lista de jugadores registrada en la base de datos
        //ArrayList<Jugador> listado_jugadores = Conexion.getJugadores();
        
        listajugadores = new ArrayList(20); // Inicializa un ArrayList con una capacidad inicial de 50
        listajugadores = Conexion.getJugadores();
        System.out.println("Iniciando lista");

        // ....
    }
    
    public void listar(int cedula) {
        Jugador jugador = new Jugador();
        jugador = partido.BuscarJugador2(cedula, listajugadores); // Tomo los datos del jugador
        informacionjugador.txtNombrePerfilJugador.setText(String.valueOf(jugador.getNombre()));
        informacionjugador.txtApellidoPerfilJugador.setText(String.valueOf(jugador.getApellido()));
        informacionjugador.txtDocumentoPerfilJugador.setText(String.valueOf(jugador.getDocumento()));
        informacionjugador.txtTelefonoPerfilJugador.setText(String.valueOf(jugador.getTelefono()));  
        informacionjugador.txtMailPerfilJugador.setText(String.valueOf(jugador.getEmail()));
        informacionjugador.txtPosicionPerfilJugador.setText(String.valueOf(jugador.getPosicion()));
        informacionjugador.txtPosicionJugador.setText(String.valueOf(jugador.getModo()));
        informacionjugador.txtSuscripcionJugador.setText(String.valueOf(jugador.getSuscripcion()));
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == informacionjugador.btnSalirPerfilJugador) {
            informacionjugador.dispose();
        }
    }
    
}

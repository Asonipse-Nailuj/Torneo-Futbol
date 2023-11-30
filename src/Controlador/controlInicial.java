/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Jugador;
import Modelo.MySQL;
import Modelo.Partido;
import Vista.Login;
import Vista.LoginAdmin;
import Vista.LoginJugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class controlInicial implements ActionListener{
    ArrayList<Jugador> listajugadores; //Lista de jugadores dese este frame para que todos los frame puedan acceder a la informacion
    Login login;
    LoginJugador loginjugador;
    LoginAdmin loginadmin;
    Jugador jugador; //
    Partido partido;
    MySQL mysql;

    public controlInicial(Login login, Jugador jugador, Partido partido, MySQL mysql) {
        this.login = login;
        this.jugador = jugador;
        this.listajugadores = listajugadores;
        this.partido = partido;
        this.mysql = mysql;
        
        this.login.btnAdminLogin.addActionListener(this);
        this.login.btnJugadorLogin.addActionListener(this);
        this.login.btnSalirLogin.addActionListener(this);
        
        this.iniciarList();
    }
    
    public void inicio(){ //Mostrar en frame principal que es login
        login.setTitle("Inicio");
        login.setLocationRelativeTo(null);
        login.setVisible(true); //Mostrar las vistas
        
    }
    public void iniciarList(){
        listajugadores = new ArrayList(20); // Inicializa un ArrayList con una capacidad inicial de 20
        System.out.println("Iniciando lista de jugadores");
        partido.Llenarlista(listajugadores); // Para llenar lista desde el Modelo
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login.btnJugadorLogin) {
            logJugador logjugador;
            logjugador = new logJugador(new LoginJugador(), listajugadores);
            logjugador.inicio();
        }
        else{
            if (e.getSource() == login.btnAdminLogin) {
                logAdmin logadmin;
                logadmin = new logAdmin(new LoginAdmin(), listajugadores);
                logadmin.inicio();
            }
            else{
                login.dispose();
            }
        }
    }
      
}

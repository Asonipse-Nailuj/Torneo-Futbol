/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Jugador;
import Vista.LoginAdmin;
import Vista.MenuAdmin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class logAdmin implements ActionListener{
    LoginAdmin loginadmin;
    ArrayList<Jugador> listajugadores; //Lista de jugadores

    public logAdmin(LoginAdmin loginadmin, ArrayList<Jugador> listajugadores) {
        this.loginadmin = loginadmin;
        this.listajugadores = listajugadores;
        
        this.loginadmin.btnIngresarAdmin.addActionListener(this);
        this.loginadmin.btnSalirLoginAdmin.addActionListener(this);
        this.loginadmin.btnVolverAdmin.addActionListener(this);
        this.loginadmin.txtContraseña.addActionListener(this);
        this.loginadmin.txtUsuario.addActionListener(this);
    }
    
    public void inicio(){ //Mostrar en frame de login para el admin
        loginadmin.setTitle("Login Administrador");
        loginadmin.setLocationRelativeTo(null);
        loginadmin.setVisible(true); //Mostrar las vistas
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginadmin.txtUsuario) {
            // Se borra el contenido del JTextField
            loginadmin.txtUsuario.setText("");
        }
        else{
            if (e.getSource() == loginadmin.txtContraseña) {
            // Se borra el contenido del JTextField
            loginadmin.txtContraseña.setText("");
            }
            else{
                if (e.getSource() == loginadmin.btnIngresarAdmin) {
                    //LOGICA CON BASE DE DATOS PARA VALIDAR SI ES EL ADMIN
                    menuAdmon menuadmon;
                    menuadmon = new menuAdmon(new MenuAdmin(), listajugadores);
                    menuadmon.inicio();
                }
                else{
                    if (e.getSource() == loginadmin.btnVolverAdmin) {
                        loginadmin.dispose();
                    }
                    else{
                        //CERRAR LAS VENTANAS
                    }
                }
            }
        }
    }
    
}

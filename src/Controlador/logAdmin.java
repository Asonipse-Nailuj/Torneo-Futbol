/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.LoginAdmin;
import Vista.MenuAdmin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 *
 * @author Gustavo
 */
public class logAdmin implements ActionListener {

    LoginAdmin loginadmin;

    // Credenciales para acceso del admin
    String usuario = "admin";
    int contraseña = 1234;

    public logAdmin(LoginAdmin loginadmin) {
        this.loginadmin = loginadmin;

        this.loginadmin.btnIngresarAdmin.addActionListener(this);
        this.loginadmin.btnSalirLoginAdmin.addActionListener(this);
        this.loginadmin.btnVolverAdmin.addActionListener(this);
        this.loginadmin.txtContraseña.addActionListener(this);
        this.loginadmin.txtUsuario.addActionListener(this);

        AccionCampos();
    }

    public void inicio() { //Mostrar en frame de login para el admin
        loginadmin.setTitle("Login Administrador");
        loginadmin.setLocationRelativeTo(null);
        loginadmin.setVisible(true); //Mostrar las vistas
    }

    public void AccionCampos() {
        // Agregar un FocusListener al JTextField
        loginadmin.txtUsuario.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Acción a realizar cuando el JTextField obtiene el foco

                loginadmin.txtUsuario.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Acción a realizar cuando el JTextField pierde el foco
                if (loginadmin.txtUsuario.getText().isEmpty()) {
                    loginadmin.txtUsuario.setText("Usuario");
                }
            }
        });

        loginadmin.txtContraseña.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Acción a realizar cuando el JTextField obtiene el foco

                loginadmin.txtContraseña.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Acción a realizar cuando el JTextField pierde el foco
                if (loginadmin.txtContraseña.getText().isEmpty()) {
                    loginadmin.txtContraseña.setText("Contraseña");
                }
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == loginadmin.btnIngresarAdmin) {
            //LOGICA CON BASE DE DATOS PARA VALIDAR SI ES EL ADMIN
            if (Integer.parseInt(loginadmin.txtContraseña.getText()) == contraseña && loginadmin.txtUsuario.getText().equals(usuario)) {
                menuAdmon menuadmon;
                menuadmon = new menuAdmon(new MenuAdmin());
                menuadmon.inicio();
            }
        } else {
            if (e.getSource() == loginadmin.btnVolverAdmin) {
                loginadmin.dispose();
            } else {
                //CERRAR LAS VENTANAS
            }
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Vista.LoginJugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Gustavo
 */
public class logJugador implements ActionListener {
    LoginJugador loginjugador;

    public logJugador(LoginJugador loginjugador) {
        this.loginjugador = loginjugador;

        this.loginjugador.btnIngresarJugador.addActionListener(this);
        this.loginjugador.btnSalirLoginJugador.addActionListener(this);
        this.loginjugador.btnVolverJugador.addActionListener(this);

        // Asegúrate de agregar ActionListener solo al JTextField y no al botón
        this.loginjugador.txtIdentificacionJugador.addActionListener(this);
        
        AccionCampos();
    }

    public void inicio() {
        loginjugador.setTitle("Login Jugador");
        loginjugador.setLocationRelativeTo(null);
        loginjugador.setVisible(true);
    }
    
    public void AccionCampos(){
        // Agregar un FocusListener al JTextField
        loginjugador.txtIdentificacionJugador.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Acción a realizar cuando el JTextField obtiene el foco
                
                loginjugador.txtIdentificacionJugador.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Acción a realizar cuando el JTextField pierde el foco
                if(loginjugador.txtIdentificacionJugador.getText().isEmpty()){
                loginjugador.txtIdentificacionJugador.setText("Identificacion");
                }
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginjugador.txtIdentificacionJugador) {
            // Se borra el contenido del JTextField
            loginjugador.txtIdentificacionJugador.setText("");
        }
        else{
            if (e.getSource() == loginjugador.btnIngresarJugador) {
                //ESPACIO PARA AGREGAR LA VALIDACION EN BASE DE DATOS
                //abrir menu de jugadores
                
            }
        }
    }

}

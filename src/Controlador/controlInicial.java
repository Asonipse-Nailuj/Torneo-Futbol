/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Vista.Login;
import Vista.LoginAdmin;
import Vista.LoginJugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Gustavo
 */
public class controlInicial implements ActionListener{
    Login login;

    public controlInicial(Login login) {
        this.login = login;
        
        this.login.btnAdminLogin.addActionListener(this);
        this.login.btnJugadorLogin.addActionListener(this);
        this.login.btnSalirLogin.addActionListener(this);
        
    }
    
    public void inicio(){ //Mostrar en frame principal que es login
        login.setTitle("Inicio");
        login.setLocationRelativeTo(null);
        login.setVisible(true); //Mostrar las vistas
        
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login.btnJugadorLogin) {
            logJugador logjugador;
            logjugador = new logJugador(new LoginJugador());
            logjugador.inicio();
        }
        else{
            if (e.getSource() == login.btnAdminLogin) {
                logAdmin logadmin;
                logadmin = new logAdmin(new LoginAdmin());
                logadmin.inicio();
            }
            else{
                login.dispose();
            }
        }
    }
      
}

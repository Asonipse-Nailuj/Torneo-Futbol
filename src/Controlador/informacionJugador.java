/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Jugador;
import Vista.InformacionJugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

/**
 *
 * @author Gustavo
 */
public class informacionJugador implements ActionListener {

    InformacionJugador informacionjugador;

    public informacionJugador(InformacionJugador informacionjugador, Jugador jugador) {
        this.informacionjugador = informacionjugador;

        this.informacionjugador.btnSalirPerfilJugador.addActionListener(this);

        listar(jugador);
    }

    public void inicio() {
        informacionjugador.setTitle("Datos Jugador");
        informacionjugador.setLocationRelativeTo(null);
        informacionjugador.setVisible(true);
    }

    public void listar(Jugador jugador) {
        informacionjugador.txtNombrePerfilJugador.setText(String.valueOf(jugador.getNombre()));
        informacionjugador.txtApellidoPerfilJugador.setText(String.valueOf(jugador.getApellido()));
        informacionjugador.txtDocumentoPerfilJugador.setText(String.valueOf(jugador.getDocumento()));
        informacionjugador.txtTelefonoPerfilJugador.setText(String.valueOf(jugador.getTelefono()));
        informacionjugador.txtMailPerfilJugador.setText(String.valueOf(jugador.getEmail()));
        informacionjugador.txtPosicionPerfilJugador.setText(String.valueOf(jugador.getPosicion()));
        informacionjugador.txtPosicionJugador.setText(String.valueOf(jugador.getModo()));
        informacionjugador.txtSuscripcionJugador.setText(String.valueOf(jugador.getSuscripcion()));
        
        ImageIcon perfil = new ImageIcon("src/imagenes/" + jugador.getDocumento()+ ".jpg");
        informacionjugador.lblImagenPerfilJugador.setIcon(perfil);
        
        informacionjugador.lblNombreBienvenidoPerfilJugador.setText(jugador.getNombre());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == informacionjugador.btnSalirPerfilJugador) {
            informacionjugador.dispose();
        }
    }

}

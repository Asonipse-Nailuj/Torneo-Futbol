

package Controlador;

import Modelo.Jugador;
import Modelo.Partido;
import Vista.GestionarEquipos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class gestionEquipos implements ActionListener{
    
    GestionarEquipos gestionarequipos;
    Jugador jugador;
    Partido partido;

    public gestionEquipos(GestionarEquipos gestionarequipos) {
        this.gestionarequipos = gestionarequipos;
        
        this.gestionarequipos.btnGenerarEquipos.addActionListener(this);
        this.gestionarequipos.btnGenerarEquipos1.addActionListener(this);
        this.gestionarequipos.btnSalirGestionEquipos.addActionListener(this);
    }
    
    public void inicio() {
        gestionarequipos.setTitle("Login Jugador");
        gestionarequipos.setLocationRelativeTo(null);
        gestionarequipos.setVisible(true);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == gestionarequipos.btnGenerarEquipos) {
            //LOGICA PARA CREAR EQUIPOS
            
        }
        else{
            if (e.getSource() == gestionarequipos.btnGenerarEquipos) {
                //LOGICA PARA AGREGAR JUGADORES
            }
            else{
                gestionarequipos.dispose();
            }
        }
    }
    
}

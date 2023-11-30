/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package torneofutbol;

import Controlador.controlInicial;
import Modelo.Jugador;
import Modelo.Partido;
import Vista.Login;
import java.util.ArrayList;
import Modelo.MySQL;
/**
 *
 * @author hp
 */
public class TorneoFutbol {
    ArrayList<Jugador> listajugadores = new ArrayList<>(50);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        controlInicial ctrl;
        ctrl=new controlInicial(new Login(), new Jugador(), new Partido(), new MySQL());
        ctrl.inicio();
    }
    
}

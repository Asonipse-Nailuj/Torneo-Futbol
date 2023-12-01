/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneofutbol;

import Controlador.controlInicial;
import Vista.Login;

/**
 *
 * @author hp
 */
public class TorneoFutbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        controlInicial ctrl;
        ctrl = new controlInicial(new Login());
        ctrl.inicio();
    }

}

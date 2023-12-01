/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class Partido {
    ArrayList<Jugador> listajugadores;
    private static final String URL = "jdbc:mysql://localhost:3306/tu_basedatos";
    private static final String USUARIO = "tu_usuario";
    private static final String CONTRASENA = "tu_contraseña";
    
    public Partido(){}
    
       
    public void Llenarlista(ArrayList<Jugador> listajugadores){
        System.out.println("Llenando lista de jugadores");
    }
    
    public static boolean buscarJugador(int cedula, ArrayList<Jugador> listaJugadores) {//Funcion booleana que dice si esta o no jugador en la lista
        for (Jugador jugador : listaJugadores) {
            if (jugador.getDocumento() == cedula) {
                return true;  // Se encontró la cédula en la lista
            }
        }
        return false;  // No se encontró la cédula en la lista
    }
    
    public Jugador BuscarJugador2(int cedula, ArrayList<Jugador> listaJugadores) { //Funcion que devuelve un objeto jugador si encuentra la cedula en la lista
        System.out.println("Abriendo la ventana buscar");
        int cedu;
        for(int i=0; i<50; i++){
            cedu= listaJugadores.get(i).getDocumento();
            /*if(cedula == cedu){
                Jugador jugadorEncontrado = new Jugador();
                jugadorEncontrado= listaJugadores.get(i);
                System.out.println("Información del Jugador:");
                System.out.println("Nombre: " + listaJugadores.get(i).getNombre());
                
                return jugadorEncontrado; // Sale del bucle cuando se encuentra el jugador
            }*/
        }
        return null;
    }
    
}

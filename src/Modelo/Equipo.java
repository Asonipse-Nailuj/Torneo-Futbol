/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author atorres
 */
public class Equipo {

    private int num_equipo;
    private int[] jugadores;
    private int partido;

    public Equipo() {
    }

    public Equipo(int num_equipo, int partido) {
        this.num_equipo = num_equipo;
        this.partido = partido;
        this.jugadores = new int[5];
    }

    public int getNum_equipo() {
        return num_equipo;
    }

    public void setNum_equipo(int num_equipo) {
        this.num_equipo = num_equipo;
    }

    public int[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(int[] jugadores) {
        this.jugadores = jugadores;
    }

    public int getPartido() {
        return partido;
    }

    public void setPartido(int partido) {
        this.partido = partido;
    }

}

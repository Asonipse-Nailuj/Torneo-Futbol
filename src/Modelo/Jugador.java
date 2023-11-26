/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author Gustavo
 */
public class Jugador {
    private int Documento;
    private String Nombre;
    private String Posicion;
    private String Modo;
    private String Suscripcion;

    public int getDocumento() {
        return Documento;
    }

    public void setDocumento(int Documento) {
        this.Documento = Documento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

    public String getModo() {
        return Modo;
    }

    public void setModo(String Modo) {
        this.Modo = Modo;
    }

    public String getSuscripcion() {
        return Suscripcion;
    }

    public void setSuscripcion(String Suscripcion) {
        this.Suscripcion = Suscripcion;
    }
    
    
}

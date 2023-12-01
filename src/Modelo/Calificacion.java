
package Modelo;

/**
 *
 * @author Moreno Alvarez
 */
public class Calificacion {
    private int Id;
    private int Documento_Jugador;
    private double Promedio;

    public Calificacion() {

    }

    public Calificacion(int Id, int Documento_Jugador, double Promedio ) {
        this.Id = Id;
        this.Documento_Jugador = Documento_Jugador;
        this.Promedio = Promedio;
    }

    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getDocumento_Jugador() {
        return Documento_Jugador;
    }

    public void setDocumento_Jugador(int Documento_Jugador) {
        this.Documento_Jugador = Documento_Jugador;
    }

    public double getPromedio() {
        return Promedio;
    }

    public void setPromedio(double Promedio) {
        this.Promedio = Promedio;
    }
}

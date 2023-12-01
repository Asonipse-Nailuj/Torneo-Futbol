package Modelo;

/**
 *
 * @author Moreno Alvarez
 */
public class Detalle_Calificacion {

    private int Documento_Calificacion;
    private int Puntaje;
    private String Relato;
    private int Id_Calificacion;

    public Detalle_Calificacion() {

    }

    public Detalle_Calificacion(int Documento_Calificacion, int Puntaje, String Relato, int Id_Calificacion) {
        this.Documento_Calificacion = Documento_Calificacion;
        this.Puntaje = Puntaje;
        this.Relato = Relato;
        this.Id_Calificacion = Id_Calificacion;
    }

    public int getDocumento_Calificacion() {
        return Documento_Calificacion;
    }

    public void setDocumento_Calificacion(int Documento_Calificacion) {
        this.Documento_Calificacion = Documento_Calificacion;
    }

    public int getPuntaje() {
        return Puntaje;
    }

    public void setPuntaje(int Puntaje) {
        this.Puntaje = Puntaje;
    }

    public String getRelato() {
        return Relato;
    }

    public void setRelato(String Relato) {
        this.Relato = Relato;
    }

    public int getId_Calificacion() {
        return Id_Calificacion;
    }

    public void setId_Calificacion(int Id_Calificacion) {
        this.Id_Calificacion = Id_Calificacion;
    }

}

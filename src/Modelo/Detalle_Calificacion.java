

package Modelo;

/**
 *
 * @author Moreno Alvarez
 */
public class Detalle_Calificacion {
    private int Id;
    private int Documento_Calificacion;
    private int Puntaje;
    private String Relato;
    private int Id_Calificacion;
    private int Fecha;

    public Detalle_Calificacion() {

    }

    public Detalle_Calificacion(int Id, int Documento_Calificacion, int Puntaje, String Relato, int Id_Calificacion, int fecha) {
        this.Id = Id;
        this.Documento_Calificacion = Documento_Calificacion;
        this.Puntaje = Puntaje;
        this.Relato = Relato;
        this.Id_Calificacion = Id_Calificacion;
        this.Fecha = Fecha;
    }

    
    public int getId() {
        return Id;
    }

    public void setTelefono(int Id) {
        this.Id = Id;
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

    public int getFecha() {
        return Fecha;
    }

    public void setFecha(int Fecha) {
        this.Fecha = Fecha;
    }

}

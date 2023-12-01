

package Modelo;

/**
 *
 * @author Moreno Alvarez
 */
public class Infraccion {
    private int Id;
    private String Motivo;
    private String Relato;
    private int Documento_Infraccion;
    private int Fecha;
    

    public Infraccion() {

    }

    public Infraccion(int Id, String Motivo, String Relato, int Documento_Infraccion, int Fecha) {
        this.Id = Id;
        this.Motivo = Motivo;
        this.Relato = Relato;
        this.Documento_Infraccion = Documento_Infraccion;
        this.Fecha = Fecha;
        
    }

  
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getMotivo() {
        return Motivo;
    }

    public void setMotivo(String Motivo) {
        this.Motivo = Motivo;
    }

    public String getRelato() {
        return Relato;
    }

    public void setRelato(String Relato) {
        this.Relato = Relato;
    }

    public int getDocumento_Infraccion() {
        return Documento_Infraccion;
    }

    public void setDocumento_Infraccion(int Documento_Infraccion) {
        this.Documento_Infraccion = Documento_Infraccion;
    }

    public int getFecha() {
        return Fecha;
    }

    public void setFecha(int Fecha) {
        this.Fecha = Fecha;
    }

    
}

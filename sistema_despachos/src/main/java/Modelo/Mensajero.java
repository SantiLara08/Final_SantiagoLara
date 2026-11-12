package Modelo;

public class Mensajero {
    private String nombre;
    private String documento;

    public Mensajero(String nombre, String documento){
        this.nombre = nombre;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }
}

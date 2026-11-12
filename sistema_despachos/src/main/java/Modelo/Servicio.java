package Modelo;

public abstract class Servicio{
    private Paquete paquete;
    private double costo_total_envio;
    private String nombre;

    public Servicio(Paquete paquete,String nombre){
        this.paquete = paquete;
        this.nombre = nombre;
    }

    public abstract double calcular_costos();

    public double getCosto_total_envio() {
        return costo_total_envio;
    }

    public Paquete getPaquete() {
        return paquete;
    }

}

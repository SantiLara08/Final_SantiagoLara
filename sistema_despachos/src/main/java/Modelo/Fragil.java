package Modelo;

import ClaseUtilitaria.Calculos;
import Exceptions.FragilSinContenido;
import Interfaces.Notificable;

public class Fragil extends Servicio implements Notificable {
    private String contenido;
    private String nombre;

    public Fragil(Paquete paquete,String contenido,String nombre) throws FragilSinContenido {
        super(paquete,nombre);
        if (contenido.isBlank()){
            throw new FragilSinContenido("Este envio fragil no tiene contenido, no se acepta.");
        }else{
            this.contenido = contenido;
        }
    }

    @Override
    public double calcular_costos() {
        return (Calculos.calcular_envio_base(getPaquete()) + 5000);
    }

    @Override
    public void notificar() {
        System.out.println("Este paquete requiere manejo especial, guia: " + getPaquete().getGuia());
    }
}

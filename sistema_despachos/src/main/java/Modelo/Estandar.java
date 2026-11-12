package Modelo;

import ClaseUtilitaria.Calculos;

public class Estandar extends Servicio{
    public Estandar(Paquete paquete, String nombre){
        super(paquete,nombre);
    }

    @Override
    public double calcular_costos() {
        return Calculos.calcular_envio_base(getPaquete());
    }
}

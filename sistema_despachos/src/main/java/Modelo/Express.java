package Modelo;

import ClaseUtilitaria.Calculos;

public class Express extends Servicio{
    public Express(Paquete paquete,String nombre){
        super(paquete,nombre);
    }

    @Override
    public double calcular_costos() {
        return (Calculos.calcular_envio_base(getPaquete()) * 1.5);
    }
}

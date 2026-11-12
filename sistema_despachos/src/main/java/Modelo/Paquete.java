package Modelo;

import Enums.Zona;
import Exceptions.DespachoException;
import Exceptions.NumeroDeGuiaInvalidoException;
import Exceptions.PesoFueraDeRangoException;

import java.util.Objects;

public class Paquete {
    private final double peso;
    private final String guia;
    private final Zona zona;
    private double costo_envio;

    public Paquete(double peso,String digitos,Zona zona) throws DespachoException {
        if(peso > 0 && peso < 20){
            this.peso = peso;

        }else{
            throw new PesoFueraDeRangoException("El paquete debe pesar entre 0 y 20kg");
        }

        if(digitos.length() == 4){
            this.guia = "EY"+digitos;
        }else{
            throw new NumeroDeGuiaInvalidoException("La guia del producto debe tener exactamente 4 digitos");
        }
        this.zona = zona;
    }

    public String getGuia() {
        return guia;
    }

    public double getPeso() {
        return peso;
    }

    public Zona getZona() {
        return zona;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Paquete paquete)) return false;
        return Objects.equals(guia, paquete.guia);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(guia);
    }
}

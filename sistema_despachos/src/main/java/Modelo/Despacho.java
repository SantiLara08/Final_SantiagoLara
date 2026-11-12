package Modelo;

import Exceptions.DespachoException;
import Exceptions.PaqueteRepetidoException;
import Exceptions.PesoPorMotoSuperadoException;

import java.util.ArrayList;
import java.util.List;

public class Despacho {
    private String codigo;
    private Mensajero mensajero;
    private List<Paquete> paquetes = new ArrayList<>();
    private double peso_total = 0;
    private static int contador_despachos;

    public Despacho(Mensajero mensajero){
        contador_despachos++;
        this.mensajero = mensajero;
        this.codigo = "D-" + contador_despachos;
    }

    public String getCodigo() {
        return codigo;
    }

    public List<Paquete> getPaquetes() {
        return paquetes;
    }

    public void subir_paquete(Paquete paquete) throws DespachoException {
        for (Paquete p:paquetes){
            if (p.equals(paquete)){
                throw new PaqueteRepetidoException("El paquete con guia " + paquete.getGuia() + " ya esta en el despacho");
            }
        }

        if((peso_total+paquete.getPeso())<=30){
            paquetes.add(paquete);
            peso_total+= paquete.getPeso();
        }else{
            throw new PesoPorMotoSuperadoException("Se paso de los 30kg, no se puede subir el paquete con guia " + paquete.getGuia());
        }
    }

    public Mensajero getMensajero() {
        return mensajero;
    }
}

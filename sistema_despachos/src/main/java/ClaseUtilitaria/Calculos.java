package ClaseUtilitaria;
import Enums.Zona;
import Modelo.Paquete;

import java.util.List;

public final class Calculos {
    private Calculos(){}

    public static double calcular_envio_base(Paquete p){
        double total = 0;
        if(p.getZona() == Zona.CENTRO){
            total += 6000 + (1000*p.getPeso());
        }
        else if(p.getZona()==Zona.NORTE){
            total += 8000 + (1000*p.getPeso());
        }
        else if(p.getZona()== Zona.SUR){
            total += 8000 + (1000*p.getPeso());
        }
        else if(p.getZona() == Zona.ORIENTE){
            total += 15000 + (1000*p.getPeso());
        }

        return total;
    }
}

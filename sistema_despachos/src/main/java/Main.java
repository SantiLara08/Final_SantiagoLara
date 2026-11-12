import Enums.Zona;
import Exceptions.DespachoException;
import Modelo.*;

import java.security.spec.RSAOtherPrimeInfo;

public class Main {
    public static void main(String[] args) {
        //CASO 1 ===================================================================================================:
        System.out.println("Caso 1: ------------------------------------");

        Mensajero mensajero1 = new Mensajero("Andres","1034234321");
        Despacho despacho1 = new Despacho(mensajero1);

        try{
            Paquete p1 = new Paquete(5,"2001", Zona.ORIENTE);
            Servicio s1 = new Estandar(p1,"Estandar");

            Paquete p2 = new Paquete(1.5,"2002", Zona.NORTE);
            Servicio s2 = new Express(p1,"Express");

            Paquete p3 = new Paquete(2,"2003", Zona.CENTRO);
            Servicio s3 = new Fragil(p1,"vajilla","Fragil");

            Paquete p4 = new Paquete(8,"2004", Zona.CENTRO);
            Servicio s4 = new Estandar(p1,"Estandar");

            Paquete p5 = new Paquete(6,"2005", Zona.ORIENTE);
            Servicio s5 = new Express(p1,"Express");

            Paquete p6 = new Paquete(3.5,"2006", Zona.SUR);
            Servicio s6 = new Fragil(p1,"Televisor","Fragil");

            despacho1.subir_paquete(p1);
            despacho1.subir_paquete(p2);
            despacho1.subir_paquete(p3);
            despacho1.subir_paquete(p4);
            despacho1.subir_paquete(p5);
            despacho1.subir_paquete(p6);


            System.out.println("Despacho: " + despacho1.getCodigo() + '-' + despacho1.getMensajero().getNombre());
            System.out.println(p1.getGuia());



        } catch (DespachoException e){
            System.out.println("Error: " + e.getMessage());
        }





        //CASO 2 ===================================================================================================:
        System.out.println("Caso 2: ------------------------------------");

        //CASO 3 ===================================================================================================:
        System.out.println("Caso 3: ------------------------------------");

        //CASO 4 ===================================================================================================:
        System.out.println("Caso 4: ------------------------------------");
    }
}

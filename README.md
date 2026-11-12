# Final_SantiagoLara

Para resolver el problema, primero creo una clase mensajero y otra despacho, con sus respectivos atributos. Despues cree una clase paquete que tiene los atributos del paquete. Todas las clases tienen throws de las excepciones personalizadas que cree segun las reglas de negocio. El despacho tiene una lista de paquetes. Para manejar las zonas de un paquete utilice un ENUM. Para manejar los servicios, cree una clase abstracta servicios que era la padre de Express, Estandar y Fragil, y para cada una de esas maneje el costo total del envio con una clase utlitaria, y Fragil usaba una interfaz para que obligara a notificar.

Principios SOLID:

- Cree una excepcion padre de la cual heredan las demas(DespachoException), para poder manejerlas sin tener que usar ifs y saber especificamente que excepcion es.
- La clase abstracta servicio permite cumplir lo que pide la regla de negocio de poner mas servicios en el futuro sin tener que cambiar el codigo que ya existe.
- La interfaz notificar permite que solo las clases que requieran notificar lo hagan.

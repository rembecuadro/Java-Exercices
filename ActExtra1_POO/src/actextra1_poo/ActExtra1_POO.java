package actextra1_poo;

import Servicio.ServicioVehiculo;

public class ActExtra1_POO {

    public static void main(String[] args) {
      
        ServicioVehiculo vehiculo = new ServicioVehiculo();
        
        int nuevo = vehiculo.crearVehiculo();
        
       vehiculo.moverse(nuevo, nuevo);
                
    }
}

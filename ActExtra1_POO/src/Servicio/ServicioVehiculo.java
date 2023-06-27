package Servicio;

//@author rembe

import Entidades.Vehiculo;
import java.util.Scanner;


 
public class ServicioVehiculo  {
    int opcion;
    Scanner leer = new Scanner(System.in);
    
    public int crearVehiculo() {
        System.out.print("Ingrese el tipo de vehiculo.\n1. Automovil\n2. Motocicleta\n3. Bicicleta\n-> ");
        opcion = leer.nextInt();
        Vehiculo vehiculo = new Vehiculo();
        switch (opcion) {
            case 1:
                vehiculo.setTipo("automovil");
                break;
            case 2:
                vehiculo.setTipo("motocicleta");
                break;
            case 3:
                vehiculo.setTipo("motocicleta");
                break;
            }
        return opcion; 
        
    }
    
    public int moverse(int opcion, int tiempo) {
        
        System.out.print("Cuanto tiempo se movió el vehiculo (en segundos)? ");
        tiempo = leer.nextInt();
        
        int distancia;
        
         switch (opcion) {
            case 1:
                distancia = 3*tiempo;
                System.out.print("El automovil recorrió "+distancia+" metros\n");
                break;
            case 2:
                distancia = 2*tiempo;
                System.out.print("La motocicleta recorrió "+distancia+" metros\n");
                break;
            case 3:
                distancia = tiempo;
                System.out.print("La bicicleta recorrió "+distancia+" metros\n");
                break;
            default:
                throw new AssertionError();
        }
        
         return distancia;
    }
    
}
    


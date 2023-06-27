package Servicios;

import Entidades.Array;
import java.util.Scanner;


public class ServicioArray {
    

    public Array crearArray() {
        
        Scanner leer = new Scanner(System.in);
       
        Array arreglo = new Array();
        
        System.out.print("Digite el tamaño del arreglo: ");
        arreglo.setTamano(leer.nextInt());
        System.out.print("Digite nombre del arreglo: ");
        arreglo.setNombreArreglo(leer.next());
        
        return arreglo;
        
    }
    
    public void rellenar(Array arreglo) {
        
        for (int i = 0; i < arreglo.getTamano(); i++) {
            arreglo[i] = Array (Math.random()) + 1;
            }
        }
        
        
    }
    
}

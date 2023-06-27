
package ej9_poo;

import Entidades.Matematica;
import Servicios.ServicioMatematica;

public class Ej9_POO {

    public static void main(String[] args) {
        
        ServicioMatematica matematica = new ServicioMatematica();
        
        Matematica m = matematica.crear();
        
       matematica.devolverMayor(m);
        System.out.println("--------------------");
       matematica.calcularPotencia(m);
        System.out.println("--------------------");
       matematica.calcularRaiz(m);
       
    }
    
}

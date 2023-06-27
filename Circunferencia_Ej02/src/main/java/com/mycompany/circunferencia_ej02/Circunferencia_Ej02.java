

package com.mycompany.circunferencia_ej02;

import Entidades.Circunferencia;
import Servicios.ServicioCircunferencia;



public class Circunferencia_Ej02 {
    
    

    public static void main(String[] args, double radio) {
       
        ServicioCircunferencia s1 = new ServicioCircunferencia();
        
        Circunferencia c1 = s1.crearCircunferencia(radio);

        s1.area(c1);
        s1.perimetro(c1);
        
    }
}

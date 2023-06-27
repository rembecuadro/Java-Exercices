package Servicios;

import Entidades.Circunferencia;
import java.util.Scanner;

public class ServicioCircunferencia {
     
    public Circunferencia crearCircunferencia(Double radio) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Se va a generar una circunferencia\nPara ello debe esribir a continuación el tamaño del radio\n-> ");
        radio = leer.nextDouble();
        Circunferencia c = new Circunferencia(radio);
    return c;    
    } 

    public void area(Circunferencia c) {
        double area = Math.PI * Math.pow(c.getRadio(),2);
        System.out.println("el area de la circunferencia es: "+area);
}

    public void perimetro (Circunferencia c) {
        double perimetro = 2*Math.PI*c.getRadio();
        System.out.println("el perimetro de la circunferencia es: "+perimetro);
    }  
}

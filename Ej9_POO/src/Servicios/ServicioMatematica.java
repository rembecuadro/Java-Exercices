package Servicios;

import Entidades.Matematica;
import java.util.Scanner;

 
public class ServicioMatematica {
    
    public Matematica crear() {
    
        Matematica m = new Matematica();

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el primer valor: ");
        m.setNum1((int) (Math.random()*100 + 1));
        System.out.println(m.getNum1());
        System.out.print("Ingrese el segundo valor: ");
        m.setNum2((int) (Math.random() * 100 + 1));
        System.out.println(m.getNum2());
        
        
        return m;
    }
    
    public void devolverMayor(Matematica m) {
       System.out.println("El número mayor entre "+m.getNum1()+" y "+m.getNum2()+" es "+ Math.max(m.getNum1(),m.getNum2()));
    }
    public void calcularPotencia(Matematica m) {
       System.out.println(+m.getNum1()+" elevado a la "+m.getNum2()+" es "+(int) Math.pow(m.getNum1(),m.getNum2()));
    }
    public void calcularRaiz(Matematica m) {
        System.out.println("La raiz cuadrada de "+Math.min(m.getNum1(),m.getNum2())+ " es "+ Math.sqrt(Math.abs(Math.min(m.getNum1(),m.getNum2()))));
   
    }
    
}

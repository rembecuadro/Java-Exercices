
package Servicios;
 
import Entidades.Persona;
import java.util.Scanner;

public class ServPersona {
    
    public Persona crearPersona(){
        
        Persona p = new Persona();
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //System.out.println("Introduzca los siguientes datos.");
        System.out.print("Nombre: ");
        p.setNombre(leer.next());
        
        System.out.print("Edad: ");
        p.setEdad(leer.nextInt());
        
        
        System.out.print("Sexo: \nH. Hombre\nM. Mujer\nO. Otros\n-> ");
        p.setSexo(leer.next());
        
        while (!p.getSexo().equalsIgnoreCase("H") && !p.getSexo().equalsIgnoreCase("M") && !p.getSexo().equalsIgnoreCase("O")) {
            System.out.print("Favor, ingrese el dato correctamente.\nIngrese el sexo (H, M u O) ");
            p.setSexo(leer.next());
        }
        
        System.out.print("Peso(kg): ");
        p.setPeso(leer.nextDouble());
        
        System.out.print("Altura(cms): ");
        p.setAltura(leer.nextDouble());
        
        return p;   
    }
    
    public int calcularIMC(Persona p) {
        
        int i=0;
        
        double imc = (p.getPeso()/(Math.pow(p.getAltura()/100, 2)));
        
        if (imc < 20.0) {
            i = -1;
        } else if (imc >= 20.0 && imc <= 25.0){
            i = 0;
        } else if (imc > 25.0)
            i = 1;
            
       return i;
   }
    
     public boolean esMayorDeEdad(Persona p) {
         
         boolean m = false;
                 
         if (p.getEdad() >= 18) {
             m = true;
         }
         
        return m;
    }

}

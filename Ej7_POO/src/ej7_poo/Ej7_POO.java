package ej7_poo;

import Entidades.Persona;
import Servicios.ServPersona;
import java.util.Scanner;

public class Ej7_POO {

    public static void main(String[] args) {

        ServPersona p = new ServPersona();

        Scanner leer = new Scanner(System.in);
        System.out.print("Cuantas personas desea promediar? ");
        int n = leer.nextInt();

        Persona persona[] = new Persona[n]; //Para crear las personas
        // Bucle for para crear las "n" personas
        for (int i = 0; i < n; i++) {
            System.out.println("Introduzca los datos de la persona " + (i + 1));
            persona[i] = p.crearPersona();
        }

        //Persona persona1 = p.crearPersona();
        //Persona persona2 = p.crearPersona();
        //Persona persona3 = p.crearPersona();
        //Persona persona4 = p.crearPersona();
        System.out.println("***********************************");
        int[] imc = new int[n]; //Para almacenar los imc en un vector
        for (int i = 0; i < n; i++) {
            System.out.print(persona[i].getNombre() + " tiene un IMC clase ");
            System.out.println(imc[i] = p.calcularIMC(persona[i])); //imc[n] = p.calcularIMC(persona[i]);

        }
        //int imc1 = p.calcularIMC(persona1);
        //int imc2 = p.calcularIMC(persona2);
        //int imc3 = p.calcularIMC(persona3);
        //int imc4 = p.calcularIMC(persona4);
        System.out.println("***********************************");
        boolean[] mayor = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (persona[i].getEdad() >= 18) {
                System.out.print(persona[i].getNombre() + " es mayor de edad\t"+persona[i].getEdad()+" ");
                System.out.println(mayor[i] = p.esMayorDeEdad(persona[i])); //imc[n] = p.calcularIMC(persona[i]);
            } else if (persona[i].getEdad() < 18) {
                System.out.print(persona[i].getNombre() + " es menor de edad\t"+persona[i].getEdad()+" ");
                System.out.println(mayor[i] = p.esMayorDeEdad(persona[i])); //imc[n] = p.calcularIMC(persona[i]);
            }
                
        }
        //boolean mayor1 = p.esMayorDeEdad(persona1);
        //boolean mayor2 = p.esMayorDeEdad(persona2);
        //boolean mayor3 = p.esMayorDeEdad(persona3);
        //boolean mayor4 = p.esMayorDeEdad(persona4);
        System.out.println("***********************************");
        // Calculo de porcentajes de mayores o menores de edad
        int dp = 0;  // debajo peso          
        int pi = 0;  // peso ideal          
        int sp = 0;  // sobrepeso
        for (int i = 0; i < n; i++) {
            if (imc[i] == -1) {
                dp = dp + 1;
            } else if (imc[i] == 0) {
                pi = pi + 1;
            } else if (imc[i] == 1) {
                sp = sp + 1;
            }
        }
        if (dp > 0) {
            System.out.println(dp + " personas estan por debajo de su peso");
        } if (pi > 0) {
            System.out.println(pi + " personas están en su peso ideal");
        } if (sp > 0) {
            System.out.println(sp + " personas están en sobrepeso");    
        }
          
        System.out.println("***********************************");
        
        // Calculo de porcentajes de mayores o menores de edad
        int ma = 0; // mayor edad
        int me = 0; // menor de edad
        for (int i = 0; i < n; i++) {
            
            if (mayor[i] == true) {
                ma = ma + 1;
            } else 
                me = me + 1;
        }
        //System.out.println("El " + ((ma / n) * 100) + "% de personas son mayores de edad.\nEl " + ((me / n) * 100) + "% personas menores de edad");
        double may = (ma / n) * 100;
        double men = (me / n) * 100;
        if (may > 0) {
            System.out.println("El " + may + "% de personas son mayores de edad.");
        } 
        if (men > 0) {
            System.out.println("El " + men + "% personas menores de edad.");
        }
    }

}

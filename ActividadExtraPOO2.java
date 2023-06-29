package actividadextrapoo2;

import Entidades.Alquiler;
import Entidades.Pelicula;
import Entidades.ServicioGestion;
import Servicios.ServicioAlquiler;
import Servicios.ServicioPelicula;
import java.util.Scanner;

public class ActividadExtraPOO2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ServicioPelicula pelicula = new ServicioPelicula();
        ServicioAlquiler alquiler = new ServicioAlquiler();
        ServicioGestion gestion = new ServicioGestion();

        Pelicula p = new Pelicula();
        Alquiler a = new Alquiler();
        
        int opcion = 0;
        
        System.out.println("***********************************************");
        System.out.println("Bienvenido al software de gestion de peliculas");
        System.out.println("***********************************************");
            

        do {

            System.out.println("\nElija la opción\n");
            System.out.println("1. Crear Pelicula");
            System.out.println("2. Alquilar Pelicula");
            System.out.println("3. Listar peliculas disponibles");
            System.out.println("4. Listar peliculas alquiladas");
            System.out.println("5. Buscar pelicula por titulo");
            System.out.println("6. Buscar pelicula por genero");
            System.out.println("7. Buscar alquiler por fecha");
            System.out.println("8. Valor servicio alquiler");
            System.out.println("9. Salir del menú");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    pelicula.crearPelicula();
                    break;
                case 2:
                    alquiler.alquilarPelicula();
                    break;
                case 3:
                    gestion.listarPeliculas(p);
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:
                    System.out.println("Nos vemos");
                    System.exit(0);
                    break;
                default:

            }

        } while (opcion <= 9);

    }

}

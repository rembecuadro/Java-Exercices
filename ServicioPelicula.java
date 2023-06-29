package Servicios;
 
import Entidades.Pelicula;
import java.util.Scanner;

public class ServicioPelicula {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Pelicula crearPelicula() {
        
        System.out.println("Cuantas peliculas desea ingresar? ");
        int n = leer.nextInt();
        
        Pelicula pelicula = new Pelicula();
               
        
        for (int i = 0; i < n; i++) {
            System.out.println("Se va a crear la pelicula #"+(i+1));
            System.out.println("Ingrese el titulo de la pelicula que va a crear ");
            pelicula.setTitulo(leer.next());
            System.out.println("Ingrese el genero ");
            pelicula.setGenero(leer.next());
            System.out.println("Ingrese el año de estreno de la pelicula ");
            pelicula.setAnio(leer.nextInt());
            System.out.println("Ingrese el tiempo de duración de la pelicula en minutos ");
            pelicula.setDuracion(leer.nextInt());
        }
        
        return pelicula;
    }

}

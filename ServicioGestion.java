
package Entidades;
 
import java.util.Scanner;


public class ServicioGestion {
    
    Scanner leer = new Scanner(System.in).useDelimiter("n");
    
    public void listarPeliculas(Pelicula peliculas) {
        System.out.println("Cuantas peliculas desea ver ");
        int n = leer.nextInt();
        System.out.println("Estas son las peliculas disponibles");
        for (int i = 0; i < n; i++) {
            System.out.println(peliculas.getTitulo());
        }
    }
    
    public void listarAlquiler(Alquiler alquiler) {
            
        System.out.println("Estas son las peliculas disponibles");
        
        for (int i = 0; i < 10; i++) {
            System.out.println(alquiler.getPeliculaAlquilada());
        }
       
        
        
    }

}

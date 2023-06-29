
package Servicios;
 
import Entidades.Alquiler;
import java.util.Date;
import java.util.Scanner;

public class ServicioAlquiler {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Alquiler alquilarPelicula() {
        
        System.out.println("Cuantas peliculas desea alquilar? ");
        int n = leer.nextInt();
        
        Alquiler alquiler = new Alquiler();
        Date fechaInicio = new Date();
        Date fechaFin = new Date();
        
        
        for (int i = 0; i < n; i++) {
            System.out.println("Se está cargando la pelicula #"+(i+1));
            System.out.println("Ingrese el titulo de la pelicula que desea alquilar ");
            alquiler.setPeliculaAlquilada(leer.nextLine());
            System.out.println("Cuando la desea alquilar? (yyyy/mm/dd) ");
            alquiler.setFechaInicio(fechaInicio);
            System.out.println("Ingrese la fecha en que quiere devolver la pelicula (yyyy/mm/dd) ");
            alquiler.setFechaFin(fechaFin);
            System.out.println("Ingrese el tiempo de duración de la pelicula en minutos ");
            alquiler.setPrecio(leer.nextInt());
        
        }
        
        return alquiler;
    }

}

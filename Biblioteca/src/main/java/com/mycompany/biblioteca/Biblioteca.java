/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca;
import Entidad.Libro;
import Servicio.LibroServicio;

/**
 *
 * @author rembe
 */
public class Biblioteca {

    public static void main(String[] args) {
       
        LibroServicio l1 = new LibroServicio(); 
        
        Libro libro1 = l1.crearLibro();
        
        System.out.println(libro1.toString());
    }
}

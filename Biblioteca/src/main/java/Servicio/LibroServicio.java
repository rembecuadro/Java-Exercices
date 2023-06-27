/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author rembe
 */
public class LibroServicio {
    
    public Libro crearLibro() {
    
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Libro l1 = new Libro();
        
        System.out.println("Ingrese el número del ISBN");
        l1.setISBN(leer.nextInt());
        
        System.out.println("Ingrese el titulo");
        l1.setTitulo(leer.next());
        
        System.out.println("Ingrese el autor");
        l1.setAutor(leer.next());
        
        System.out.println("Ingrese el número de páginas");
        l1.setNumero_paginas(leer.nextInt());
     
        return l1;
    }
}

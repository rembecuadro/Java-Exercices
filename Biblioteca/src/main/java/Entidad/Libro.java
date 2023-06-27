/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author rembe
 */
public class Libro {
    
    // Atributos
    
    private int ISBN;
    private String titulo;
    private String autor;
    private int numero_paginas;
    
    // Constructores
    
    //Constructor por defecto

    public Libro() {
    }
    
    // Constructor por párametros

    public Libro(int ISBN, String titulo, String autor, int numero_paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numero_paginas = numero_paginas;
    }
    
    // getter & setter 

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumero_paginas() {
        return numero_paginas;
    }

    public void setNumero_paginas(int numero_paginas) {
        this.numero_paginas = numero_paginas;
    }

    @Override
    public String toString() {
        return "Libro" + "\nISBN= " + ISBN + "\nTitulo= " + titulo + "\nAutor= " + autor + "\nNumero_paginas= " + numero_paginas;
    }
    
    
}

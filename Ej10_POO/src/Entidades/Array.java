
package Entidades;
 
public class Array {

    private int tamano;
    private String nombreArreglo;
    private int numero;

    public Array() {
    }

    public Array(int tamano, String nombreArreglo, int numero) {
        this.tamano = tamano;
        this.nombreArreglo = nombreArreglo;
        this.numero = numero;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getNombreArreglo() {
        return nombreArreglo;
    }

    public void setNombreArreglo(String nombreArreglo) {
        this.nombreArreglo = nombreArreglo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void imprime() {
        
    }
}

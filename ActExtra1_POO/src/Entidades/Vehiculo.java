package Entidades;

//@author rembe
 
public class Vehiculo {
    
    protected String tipo;
    protected String marca;
    protected String modelo;
    protected int anio_modelo;

    public Vehiculo() {
    }

    public Vehiculo(String tipo, String marca, String modelo, int anio_modelo) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.anio_modelo = anio_modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio_modelo() {
        return anio_modelo;
    }

    public void setAnio_modelo(int anio_modelo) {
        this.anio_modelo = anio_modelo;
    }
    
  
}

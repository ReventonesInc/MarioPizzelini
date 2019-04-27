/*
 * Esta clase abstracta producto se trabajará con herencia y contiene sus
 * metodos respectivos
 */
package clases;

public abstract class Producto {
    private String nombre;
    private int precio;
    private String descripcion;

    //Constructor(es)    
    public Producto(String nombre, int precio, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    //Getters y setters correspondientes    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }
    
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public abstract int calcularValor();
}

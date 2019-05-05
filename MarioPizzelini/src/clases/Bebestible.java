/*
 * Esta clase contiene un atributo que identificara el bebestible. Además,
 * esta clase es herencia de la clase producto.
 */
package clases;

public class Bebestible extends Producto {
    private String idBebestible;
    
    //Constructor(es)
    public Bebestible(String idBebestible, String nombre, int precio, String descripcion) {
        super(nombre, precio, descripcion);
        this.idBebestible = idBebestible;
    }
    
    //Getters y setters correspondientes
    public String getIdBebestible() {
        return idBebestible;
    }

    public void setIdBebestible(String idBebestible) {
        this.idBebestible = idBebestible;
    }

    @Override
    public void mostrarDatos(){
        System.out.println("Id del Bebestible: "+getIdBebestible());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Rut: "+getPrecio());
        System.out.println("Descripción: "+getDescripcion());
    }
}

/*
 * Esta clase contiene un atributo que identificara el bebestible. Además,
 * esta clase es herencia de la clase producto.
 */
package clases;

public class Bebestible extends Producto implements Disponible {
    private String idBebestible;
    private boolean disponibilidad;
    
    //Constructor(es)
    public Bebestible(String idBebestible, String nombre, int precio, String descripcion) {
        super(nombre, precio, descripcion);
        this.idBebestible = idBebestible;
        this.disponibilidad = true;
    }
    
    //Getters y setters correspondientes
    public String getIdBebestible() {
        return idBebestible;
    }

    public void setIdBebestible(String idBebestible) {
        this.idBebestible = idBebestible;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public void mostrarDatos(){
        System.out.println("Id del Bebestible: "+getIdBebestible());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Rut: "+getPrecio());
        System.out.println("Descripción: "+getDescripcion());
    }

    @Override
    public void disponible() {
        this.disponibilidad = true;
    }

    @Override
    public void noDisponible() {
        this.disponibilidad = false;
    }
}

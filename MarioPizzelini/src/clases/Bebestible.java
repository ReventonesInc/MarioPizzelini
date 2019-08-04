/*
 * Esta clase contiene un atributo que identificara el bebestible. Además,
 * esta clase es herencia de la clase producto.
 */
package clases;

public class Bebestible extends Producto implements Disponible {
    private String idBebestible;
    private int cantidad;
    private boolean disponibilidad;
    
    //Constructor(es)
    public Bebestible(int idBebestible, String nombre, int precio, String descripcion, int cantidad, Boolean disponibilidad) {
        super(nombre, precio, descripcion);
        this.idBebestible = Integer.toString(idBebestible);
        this.cantidad = cantidad;
        this.disponibilidad = disponibilidad;
    }
    
    public Bebestible(int idBebestible, String nombre, int precio, String descripcion) {
        super(nombre, precio, descripcion);
        this.idBebestible = Integer.toString(idBebestible);
        this.cantidad = 1;
        this.disponibilidad = true;
    }
    
    //Getters y setters correspondientes
    public String getIdBebestible() {
        return idBebestible;
    }

    public void setIdBebestible(String idBebestible) {
        this.idBebestible = idBebestible;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
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

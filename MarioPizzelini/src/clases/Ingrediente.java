/*
 * Esta clase contiene los atributos de los ingredientes y sus metodos
 * respectivos
 */
package clases;

public class Ingrediente implements Disponible{
    private String idIngrediente;
    private String nombre;
    private int precio;
    private int cantidad;
    private boolean disponibilidad;
    
    //Constructor(es)
    public Ingrediente(int idIngrediente, String nombre, int precio, int cantidad) {
        this.idIngrediente = Integer.toString(idIngrediente);
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.disponibilidad = true;
    }
    
    public Ingrediente(int idIngrediente, String nombre, int precio) {
        this.idIngrediente = Integer.toString(idIngrediente);
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = 1;
        this.disponibilidad = true;
    }
    
    //Getters y setters correspondientes
    public String getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(String idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
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

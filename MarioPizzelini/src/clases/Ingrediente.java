/*
 * Esta clase contiene los atributos de los ingredientes y sus metodos
 * respectivos
 */
package clases;

public class Ingrediente implements Disponible{
    private String idIngrediente;
    private String nombre;
    private int precio;
    private boolean disponibilidad;
    
    //Constructor(es)
    public Ingrediente(String idIngrediente, String nombre, int precio) {
        this.idIngrediente = idIngrediente;
        this.nombre = nombre;
        this.precio = precio;
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

    public boolean isDisponibilidad() {
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

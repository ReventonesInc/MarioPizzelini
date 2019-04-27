/*
 * Esta clase contiene los atributos de los ingredientes y sus metodos
 * respectivos
 */
package clases;

public class Ingrediente {
    private String idIngrediente;
    private String nombre;
    private int precio;
    
    //Constructor(es)
    public Ingrediente(String idIngrediente, String nombre, int precio) {
        this.idIngrediente = idIngrediente;
        this.nombre = nombre;
        this.precio = precio;
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
}

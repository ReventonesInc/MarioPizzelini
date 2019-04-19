/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class Ingrediente extends Producto {
    private String idIngrediente;
    
    public Ingrediente(String idIngrediente, String nombre, int precio, String descripcion) {
        super(nombre, precio, descripcion);
        this.idIngrediente = idIngrediente;
    }

    public String getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(String idIngrediente) {
        this.idIngrediente = idIngrediente;
    }
}

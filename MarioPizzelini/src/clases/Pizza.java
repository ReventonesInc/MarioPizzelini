/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
/**
 *
 * @author XavierKrostya
 */
public class Pizza extends Producto {
    private String[] ingredientes;
    private String[] extras;
    
    public Pizza(String id, String nombre, int precio, String descripcion, String[] ingredientes){
        super(id, nombre, precio, descripcion);
        this.ingredientes = ingredientes;
        this.extras = null;
    }
    
    public String[] getIngredientes(){
        return ingredientes;
    }
    
    public String[] getExtras(){
        return extras;
    }
}

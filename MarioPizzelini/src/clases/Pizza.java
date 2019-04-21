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
public class Pizza extends Producto{
    private Ingrediente[] ingredientes;
    private Ingrediente[] extras;
    
    public Pizza(int cantIngredientes, int cantExtras, String nombre, int precio, String descripcion){
        super(nombre, precio, descripcion);
        this.ingredientes = new Ingrediente[cantIngredientes];
        this.extras = new Ingrediente[cantExtras];
    }
    
    public Ingrediente[] getIngredientes(){
        return ingredientes;
    }
    
    public Ingrediente[] getExtras(){
        return extras;
    }
}

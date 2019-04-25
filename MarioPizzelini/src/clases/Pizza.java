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
    
    public Pizza(int cantIngredientes, String nombre, int precio, String descripcion){
        super(nombre, precio, descripcion);
        this.ingredientes = new Ingrediente[cantIngredientes];
        super.setPrecio(calcularValor());
    }
    
    public Ingrediente[] getIngredientes(){
        return ingredientes;
    }
    
    /**
     * Retorna true, si el ingrediente ingresado por parámetro es agregado
     * al vector exitosamente, sino, retornará false.
     * <p>
     * @param nuevo Ingrediente.
     * @return booleano.
     */
    public boolean agregarIngrediente(Ingrediente nuevo) {
        int cantIngredientes = ingredientes.length;
        for(int i = 0; i < cantIngredientes; i++) {
            if(ingredientes[i] == null){
                ingredientes[i] = nuevo;
                return true;
            } 
        }
        return false;
    }
    /**
     * Retorna el valor de la pizza, éste es calculado mediante el recorrido
     * del vector de ingredientes y sumando el precio de cada uno de éstos.
     * <p>
     * @return int
     */
    @Override
    public final int calcularValor() {
        int valor = 0;
        for(int i = 0; ingredientes != null && i < ingredientes.length; i++) {
            valor += ingredientes[i].getPrecio();
        }        
        return valor;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

public class ListaIngrediente {
    private ArrayList<Ingrediente> ingredientes;

    public ListaIngrediente() {
        ingredientes = new ArrayList<>();
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }
    
    public Boolean agregarIngrediente(Ingrediente nuevo){
        if(ingredientes.contains(nuevo)){
            return false;
        }
        return ingredientes.add(nuevo);
    }
    
    public Boolean eliminarIngrediente(Ingrediente eliminar){
        if(ingredientes.contains(eliminar)){
            return ingredientes.remove(eliminar);
        }
        return false;
    }
    
    public void modificarIngrediente(Ingrediente modificar, Ingrediente modificado){
        ingredientes.set(ingredientes.indexOf(modificar), modificado);
    }
}

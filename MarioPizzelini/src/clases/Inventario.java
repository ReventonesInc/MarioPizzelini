/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import listas.ListaBebestible;
import listas.ListaIngrediente;

public class Inventario {
    private ListaIngrediente ingredientes;  //Lista de ingredientes
    private ListaBebestible bebestibles;  //Lista de bebestibles
    
    //Constructor
    public Inventario(ListaIngrediente ingredientes, ListaBebestible bebestibles) {
        this.ingredientes = ingredientes;
        this.bebestibles = bebestibles;
    }
    
    /*Getters y setters correspondientes*/
    public ListaIngrediente getIngredientes() {
        return ingredientes;
    }
    
    public void setIngredientes(ListaIngrediente ingredientes) {
        this.ingredientes = ingredientes;
    }

    public ListaBebestible getBebestibles() {
        return bebestibles;
    }

    public void setBebestibles(ListaBebestible bebestibles) {
        this.bebestibles = bebestibles;
    }
    
    /*------ Métodos básicos de inventario ------*/
    
    /*--- Métodos para Ingrediente ---*/
    
    /**
     * Retorna un true, si el ingrediente ingresado por el parámetro
     * es agregado a la lista exitosamente, en cambio, retornará false si
     * no se agrega. Además se ocupa el método agregarIngredientes()
     * <p>
     * @param nuevo Clase Ingrediente.
     * @return Booleano.
     */
    public Boolean agregarIngrediente(Ingrediente nuevo){
        return ingredientes.agregarIngrediente(nuevo);
    }
    
    public Boolean eliminarIngrediente(Ingrediente eliminar){
        return ingredientes.eliminarIngrediente(eliminar);
    }
    
    public void modificarIngrediente(Ingrediente modificar, Ingrediente modificado){
        ingredientes.modificarIngrediente(modificar, modificado);
    }
    
    public Boolean agregarBebestible(Bebestible nuevo){
        return bebestibles.agregarBebestible(nuevo);
    }
    
    public Boolean eliminarBebestible(Bebestible eliminar){
        return bebestibles.eliminarBebestible(eliminar);
    }
    
    public void modificarBebestible(Bebestible modificar, Bebestible modificado){
        bebestibles.modificarBebestible(modificar, modificado);
    }
}

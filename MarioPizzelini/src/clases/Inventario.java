/*
 * Esta clase contiene dos referencias, una a ListaIngrediente y otra a
 * ListaBebestibles. Además de los métodos para poder manejar dichas listas
 */
package clases;

import java.util.ArrayList;
import listas.ListaBebestible;
import listas.ListaIngrediente;

public class Inventario {
    private ListaIngrediente ingredientes;  //Lista de ingredientes
    private ListaBebestible bebestibles;  //Lista de bebestibles
    
    //Constructor(es)
    public Inventario(int idSucursal) {
        this.ingredientes = new ListaIngrediente(idSucursal);
        this.bebestibles = new ListaBebestible(idSucursal);
    }
    
    //Getters y setters correspondientes
    public ListaIngrediente getIngredientes() {
        return ingredientes;
    }

    public ListaBebestible getBebestibles() {
        return bebestibles;
    }
    
        /*--- Métodos para Ingrediente ---*/

    /**
     * Retorna true, si no hay ingredientes en la lista de ingredientes, sino,
     * retornara false.
     * <p>
     * @return booleano.
     */
    public boolean estaVacioIngredientes(){
        return ingredientes.estaVacio();
    }
    /**
     * Retorna el ingrediente encontrado, luego de buscarlo en la lista dado
     * su id.
     * <p>
     * @param idIngrediente String.
     * @return booleano.
     */
    public Ingrediente buscarIngredienteID(String idIngrediente){
        return ingredientes.buscarIngredienteID(idIngrediente);
    }    
    /**
     * Retorna true, si el ingrediente ingresado por parámetro es agregado
     * a la lista exitosamente, sino, retornará false.
     * <p>
     * @param nuevo Ingrediente.
     * @return booleano.
     */
    public boolean agregarIngrediente(Ingrediente nuevo){
        return ingredientes.agregarIngrediente(nuevo);
    }
    /**
     * Retorna true y elimina el ingrediente, si el id ingresado por paramatro
     * coincide con uno de los ingredientes en la lista. Sino, retornará false.
     * <p>
     * @param idIngrediente String.
     * @return booleano.
     */
    public boolean eliminarIngrediente(String idIngrediente){
        return ingredientes.eliminarIngrediente(idIngrediente);
    }
    /**
     * Permite modificar un ingrediente por uno nuevo entregado por parametro.
     * <p>
     * @param idIngrediente String.
     * @param modificado Ingrediente.
     */
    public void modificarIngrediente(String idIngrediente, Ingrediente modificado){
        Ingrediente modificar = ingredientes.buscarIngredienteID(idIngrediente);
        ingredientes.modificarIngrediente(modificar.getIdIngrediente(), modificado);
    }    
    /**
     * Muestra los ingredientes contenidos en la lista.
     * <p>
     */
    public void mostrarIngredientes(){
        ingredientes.mostrarIngredientes();
    }
    
        /*--- Métodos para Bebestible ---*/
    
    /**
     * Retorna true, si no hay bebestibles en la lista de bebestibles, sino,
     * retornara false.
     * <p>
     * @return booleano.
     */
    public boolean estaVacioBebestibles(){
        return bebestibles.estaVacio();
    }
    /**
     * Retorna el bebestible encontrado, luego de buscarlo en la lista dado
     * su id.
     * <p>
     * @param idBebestible String.
     * @return booleano.
     */
    public Bebestible buscarBebestibleID(String idBebestible){
        return bebestibles.buscarBebestibleID(idBebestible);
    }
    /**
     * Retorna true, si el bebestible ingresado por parámetro es agregado
     * a la lista exitosamente, sino, retornará false.
     * <p>
     * @param nuevo Bebestible.
     * @return booleano.
     */
    public boolean agregarBebestible(Bebestible nuevo){
        return bebestibles.agregarBebestible(nuevo);
    }
    /**
     * Retorna true y elimina el bebestible, si el id ingresado por paramatro
     * coincide con uno de los bebestibles en la lista. Sino, retornará false.
     * <p>
     * @param idBebestible String.
     * @return booleano.
     */
    public boolean eliminarBebestible(String idBebestible){
        return bebestibles.eliminarBebestible(idBebestible);
    }
    /**
     * Permite modificar un bebestible por uno nuevo entregado por parametro.
     * <p>
     * @param idBebestible String.
     * @param modificado Ingrediente.
     */
    public void modificarBebestible(String idBebestible, Bebestible modificado){
        Bebestible modificar = bebestibles.buscarBebestibleID(idBebestible);
        bebestibles.modificarBebestible(modificar.getIdBebestible(), modificado);
    }
    /**
     * Muestra los bebestibles contenidos en la lista.
     * <p>
     */
    public void mostrarBebestibles(){
        bebestibles.mostrarBebestibles();
    }
    
    public ArrayList<Ingrediente> mostrarListaIngrediente(){
        return ingredientes.getIngredientes();
    }
    
    public String buscarIngredienteNombre(String nombre){
        return ingredientes.buscarIngredienteNombre(nombre);
    }
}

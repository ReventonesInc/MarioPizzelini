/*
 * Esta clase contiene una lista de ingredientes, en el cual se manejarán
 * sus métodos correspondientes.
 */
package listas;
import clases.Ingrediente;
import java.util.ArrayList;

public class ListaIngrediente {
    private ArrayList<Ingrediente> ingredientes;  //Lista de ingredientes
    
    //Constructor
    public ListaIngrediente() {
        ingredientes = new ArrayList<>();
    }
    
    /*Getters y setters correspondientes*/
    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }
    
    /*--- Métodos básicos para ingredientes ---*/
    
    public boolean estaVacio(){
        return ingredientes.isEmpty();
    }
    
    /**
     * Retorna true, si el ingrediente ingresado por parámetro es agregado a
     * la lista exitosamente, en cambio, retornará false si no se agrega.
     * <p>
     * @param nuevo Ingrediente.
     * @return booleano.
     */
    public boolean agregarIngrediente(Ingrediente nuevo){
        try{
            if(ingredientes.contains(nuevo)){
                return false;
            }
            return ingredientes.add(nuevo);
        }
        catch(NullPointerException e){
            System.out.println("Ocurrió un error: "+e.getMessage());
            return false;
        }
    }
    
    /**
     * Retorna true, si el ingrediente ingresado por parámetro es eliminado de
     * la lista exitosamente, en cambio, retornará false si no se elimina.
     * <p>
     * @param idIngrediente String.
     * @return booleano.
     */
    public boolean eliminarIngrediente(String idIngrediente){
        
        for(Ingrediente actual : ingredientes) {
            if(actual.getIdIngrediente().equals(idIngrediente)) {
                return ingredientes.remove(actual);
            }
        }
        return false;
    }
    
    /**
     * Retorna un objeto Ingrediente si encuentra una coincidencia entre el
     * id entregado por parametro y el id de un ingrediente, en caso de no
     * encontrar coincidencias retorna null.
     * <p>
     * @param idIngrediente String.
     * @return booleano.
     */
    public Ingrediente buscarIngredienteID(String idIngrediente){
        for(Ingrediente actual : ingredientes){
            if(actual.getIdIngrediente().equals(idIngrediente)){
                return actual;
            }
        }
        return null;
    }

    /**
     * Permite modificar un ingrediente por uno nuevo entregado por parametro
     * <p>
     * @param idIngrediente String.
     * @param modificado Ingediente.
     */
    public void modificarIngrediente(String idIngrediente, Ingrediente modificado){
        for(Ingrediente actual : ingredientes){
            if(actual.getIdIngrediente().equals(idIngrediente)){
                actual.setIdIngrediente(modificado.getIdIngrediente());
                actual.setNombre(modificado.getNombre());
                actual.setPrecio(modificado.getPrecio());
                actual.setCantidad(modificado.getCantidad());
                actual.setDisponibilidad(modificado.getDisponibilidad());
            }
        }
    }
    
    /**
     * Imprime por pantalla el ID y nombre de todos los ingredientes
     * contenidos en el ArrayList
     * <p>
     */
    public void mostrarIngredientes(){
        if(!ingredientes.isEmpty()){
            System.out.println("-----------------------------------------------");
            for(Ingrediente actual : ingredientes){
                System.out.println("ID: "+actual.getIdIngrediente()+" Nombre: "+actual.getNombre()+".");
            }
        }
    }
}

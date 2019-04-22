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
     * Retorna un true, si el ingrediente ingresado por el parámetro
     * es agregado a la lista exitosamente, en cambio, retornará false si
     * no se agrega.
     * <p>
     * @param nuevo Clase Ingrediente.
     * @return booleano.
     */
    public boolean agregarIngrediente(Ingrediente nuevo){
        if(ingredientes.contains(nuevo)){
            return false;
        }
        return ingredientes.add(nuevo);
    }
    
    /**
     * Retorna un true, si el ingrediente ingresado por el parámetro
     * es eliminado de la lista exitosamente, en cambio, retornará false si
     * no se elimina.
     * <p>
     * @param id
     * @return booleano.
     */
    public boolean eliminarIngrediente(String id){
        for(int i = 0; ingredientes != null && i < ingredientes.size(); i++){
            if((ingredientes.get(i)).getIdIngrediente().equals(id)){
                return ingredientes.remove(ingredientes.get(i));
            }
        }
        return false;
    }
    public Ingrediente buscarIngredienteID(String idIngrediente){
        for(Ingrediente actual : ingredientes){
            if(actual.getIdIngrediente().equals(idIngrediente)){
                return actual;
            }
        }
        return null;
    }

    /**
     * Permite modificar un ingrediente según las clases Ingrediente que
     * se haya ingresado.
     * <p>
     * @param modificar Clase Ingrediente.
     * @param modificado Clase Ingediente.
     */
    public void modificarIngrediente(Ingrediente modificar, Ingrediente modificado){
        ingredientes.set(ingredientes.indexOf(modificar), modificado);
    }
    
    public void mostrarIngredientes(){
        if(!ingredientes.isEmpty()){
            System.out.println("-----------------------------------------------");
            for(Ingrediente actual : ingredientes){
                System.out.println("ID: "+actual.getIdIngrediente()+" Nombre: "+actual.getNombre()+".");
            }
        }
    }
}

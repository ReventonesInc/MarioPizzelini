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
     * @param eliminar Clase Ingrediente.
     * @return booleano.
     */
    public boolean eliminarIngrediente(Ingrediente eliminar){
        if(ingredientes.contains(eliminar)){
            return ingredientes.remove(eliminar);
        }
        return false;
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
}

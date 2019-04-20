/*
 * Esta clase contiene una lista de bebestibles, en el cual se manejarán
 * sus métodos correspondientes.
 */
package clases;
import java.util.ArrayList;

public class ListaBebestible {
    private ArrayList<Bebestible> bebestibles;  //Lista de bebestibles
    
    //Constructor
    public ListaBebestible() {
        bebestibles = new ArrayList<>();
    }
    
    /*Getters y setters correspondientes*/
    public ArrayList<Bebestible> getBebestibles() {
        return bebestibles;
    }
    
    /*--- Métodos básicos para bebestibles---*/
    
    /**
     * Retorna un true, si el bebestible ingresado por parámetro es
     * agregado exitosamente a la lista, en cambio, retornará false
     * si no se agrega.
     * <p>
     * @param nuevo Clase Bebestible.
     * @return Booleano.
     */
    public Boolean agregarBebestible(Bebestible nuevo){
        if(bebestibles.contains(nuevo)){
            return false;
        }
        return bebestibles.add(nuevo);
    }
    
    /**
     * Retorna un true, si el bebestible ingresado por parámetro es
     * eliminado exitosamente de la lista, en cambio, retornará false
     * si no es elimina.
     * <p>
     * @param eliminar Clase Bebestible.
     * @return Booleano.
     */
    public Boolean eliminarBebestible(Bebestible eliminar){
        if(bebestibles.contains(eliminar)){
            return bebestibles.remove(eliminar);
        }
        return false;
    }
    
    /**
     * Permite modificar un Bebestible según las clases Bebestible que
     * se haya ingresado.
     * <p>
     * @param modificar Clase Bebestible.
     * @param modificado Clase Bebestible.
     */
    public void modificarBebestible(Bebestible modificar, Bebestible modificado){
        bebestibles.set(bebestibles.indexOf(modificar), modificado);
    }
}

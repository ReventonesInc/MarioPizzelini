/*
 * Esta clase contiene una lista de bebestibles, en el cual se manejarán
 * sus métodos correspondientes.
 */
package listas;
import clases.Bebestible;
import java.util.ArrayList;

public class ListaBebestible {
    private ArrayList<Bebestible> bebestibles;  //Lista de bebestibles
    
    //Constructor
    public ListaBebestible(int idBebestible) {
        bebestibles = new ArrayList<>();
    }
    
    /*Getters y setters correspondientes*/
    public ArrayList<Bebestible> getBebestibles() {
        return bebestibles;
    }
    
    /*--- Métodos básicos para bebestibles---*/
    
    public boolean estaVacio(){
        return bebestibles.isEmpty();
    }
    
    /**
     * Retorna un true, si el bebestible ingresado por parámetro es
     * agregado exitosamente a la lista, en cambio, retornará false
     * si no se agrega.
     * <p>
     * @param nuevo Clase Bebestible.
     * @return booleano.
     */
    public boolean agregarBebestible(Bebestible nuevo){
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
     * @param idBebestible
     * @return booleano.
     */
    public boolean eliminarBebestible(String idBebestible){
        for(Bebestible actual : bebestibles){
            if(actual.getIdBebestible().equals(idBebestible)){
                return bebestibles.remove(actual);
            }
        }
        return false;
    }
    /**
     * Retorna el bebestible encontrado dado su id entregado por parámetro.
     * <p>
     * @param idBebestible String.
     * @return Bebestible.
     */
    public Bebestible buscarBebestibleID(String idBebestible){
        for(Bebestible actual : bebestibles){
            if(actual.getIdBebestible().equals(idBebestible)){
                return actual;
            }
        }
        return null;
    }
    /**
     * Permite modificar un Bebestible según las clases Bebestible que
     * se haya ingresado.
     * <p>
     * @param idBebestible String.
     * @param modificado Bebestible.
     */
    public void modificarBebestible(String idBebestible, Bebestible modificado){
        for(Bebestible actual : bebestibles){
            if(actual.getIdBebestible().equals(idBebestible)){
                actual.setIdBebestible(modificado.getIdBebestible());
                actual.setNombre(modificado.getNombre());
                actual.setPrecio(modificado.getPrecio());
                actual.setCantidad(modificado.getCantidad());
                actual.setDescripcion(modificado.getDescripcion());
                actual.setDisponibilidad(modificado.getDisponibilidad());
            }
        }
    }
    /**
     * Muestra todos los bebestibles contenidos en la lista.
     * <p>
     */
    public void mostrarBebestibles(){
        if(!bebestibles.isEmpty()){
            System.out.println("-----------------------------------------------");
            for(Bebestible actual : bebestibles){
                System.out.println("ID: "+actual.getIdBebestible()+" Nombre: "+actual.getNombre()+".");
            }
        }
    }
}

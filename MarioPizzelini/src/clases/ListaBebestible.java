/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.util.ArrayList;

public class ListaBebestible {
    private ArrayList<Bebestible> bebestibles;

    public ListaBebestible() {
        bebestibles = new ArrayList<>();
    }

    public ArrayList<Bebestible> getBebestibles() {
        return bebestibles;
    }
    
    public Boolean agregarBebestible(Bebestible nuevo){
        if(bebestibles.contains(nuevo)){
            return false;
        }
        return bebestibles.add(nuevo);
    }
    
    public Boolean eliminarBebestible(Bebestible eliminar){
        if(bebestibles.contains(eliminar)){
            return bebestibles.remove(eliminar);
        }
        return false;
    }
    
    public void modificarBebestible(Bebestible modificar, Bebestible modificado){
        bebestibles.set(bebestibles.indexOf(modificar), modificado);
    }
}

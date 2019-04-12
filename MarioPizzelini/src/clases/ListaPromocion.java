/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.util.*;
/**
 *
 * @author XavierKrostya
 */
public class ListaPromocion {
    private ArrayList<Promocion> promociones;
    
    public ListaPromocion(){
        this.promociones = new ArrayList<>();
    }
    
    public ArrayList<Promocion> getPromociones(){
        ArrayList<Promocion> copia = promociones;
        return copia;
    }
}

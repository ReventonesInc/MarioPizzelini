/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;
import clases.Sucursal;
import java.util.ArrayList;

public class ListaSucursal {
    private ArrayList<Sucursal> sucursales;
    
    //Constructor
    public ListaSucursal() {
        sucursales = new ArrayList<>();
    }
    
    /*Getters y setters correspondientes*/
    public ArrayList<Sucursal> getSucursales() {
        return sucursales;
    }
    
    /*------ Método básico de ListaSucursal ------*/
    
    public Boolean agregarSucursal(Sucursal nuevo){
        if(sucursales.contains(nuevo)){
            return false;
        }
        return sucursales.add(nuevo);
    }
    
    public Boolean eliminarSucursal(Sucursal eliminar){
        if(sucursales.contains(eliminar)){
            return sucursales.remove(eliminar);
        }
        return false;
    }
}

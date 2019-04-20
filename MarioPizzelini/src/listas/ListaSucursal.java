/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;
import clases.Bebestible;
import clases.Ingrediente;
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
    
    public Boolean agregarIngrediente(String rut, Ingrediente nuevo){
        if(!sucursales.isEmpty()){
            for(int i = 0; sucursales != null && i < sucursales.size(); i++){
                if((sucursales.get(i)).getRut().equals(rut)){
                    return sucursales.get(i).agregarIngrediente(nuevo);
                }
            }
        }
        return false;
    }
    
    public Boolean eliminarIngrediente(String rut, Ingrediente eliminar){
        if(!sucursales.isEmpty()){
            for(int i = 0; sucursales != null && i < sucursales.size(); i++){
                if((sucursales.get(i)).getRut().equals(rut)){
                    return sucursales.get(i).eliminarIngrediente(eliminar);
                }
            }
        }
        return false;
    }
    
    public Boolean modificarIngrediente(String rut, Ingrediente modificar, Ingrediente modificado){
        if(!sucursales.isEmpty()){
            for(int i = 0; sucursales != null && i < sucursales.size(); i++){
                if((sucursales.get(i)).getRut().equals(rut)){
                    sucursales.get(i).modificarIngrediente(modificar, modificado);
                    return true;
                }
            }
        }
        return false;
    }
    
    public Boolean agregarBebestible(String rut, Bebestible nuevo){
        if(!sucursales.isEmpty()){
            for(int i = 0; sucursales != null && i < sucursales.size(); i++){
                if((sucursales.get(i)).getRut().equals(rut)){
                    return sucursales.get(i).agregarBebestible(nuevo);
                }
            }
        }
        return false;
    }
    
    public Boolean eliminarBebestible(String rut, Bebestible eliminar){
        if(!sucursales.isEmpty()){
            for(int i = 0; sucursales != null && i < sucursales.size(); i++){
                if((sucursales.get(i)).getRut().equals(rut)){
                    return sucursales.get(i).eliminarBebestible(eliminar);
                }
            }
        }
        return false;
    }
    
    public Boolean modificarBebestible(String rut, Bebestible modificar, Bebestible modificado){
        if(!sucursales.isEmpty()){
            for(int i = 0; sucursales != null && i < sucursales.size(); i++){
                if((sucursales.get(i)).getRut().equals(rut)){
                    sucursales.get(i).modificarBebestible(modificar, modificado);
                    return true;
                }
            }
        }
        return false;
    }
}

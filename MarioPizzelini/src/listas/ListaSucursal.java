/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;
import clases.Bebestible;
import clases.Ingrediente;
import clases.Pedido;
import clases.Sucursal;
import clases.Cliente;
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
    
    /*------ Métodos básicos de ListaSucursal ------*/
    
    public boolean estaVacio(){
        return sucursales.isEmpty();
    }
    
    public boolean agregarSucursal(Sucursal nuevo){
        if(sucursales.contains(nuevo)){
            return false;
        }
        return sucursales.add(nuevo);
    }
    
    public boolean eliminarSucursal(String rutEliminar){
        for(int i = 0; sucursales != null && i < sucursales.size(); i++){
            if((sucursales.get(i)).getRut().equals(rutEliminar)){
                return sucursales.remove(sucursales.get(i));
            }
        }
        return false;
    }
    
    public void mostrarSucursales(){
        if(!sucursales.isEmpty()){
            System.out.println("-----------------------------------------------");
            for(int i = 0; sucursales != null && i < sucursales.size(); i++){
                System.out.println("RUT: "+sucursales.get(i).getRut()+" Dirección: "+sucursales.get(i).getDireccion()+".");
            }
        }
    }
    
    /*------ Métodos básicos para ingredientes ------*/
    
    public Ingrediente buscarIngredienteID(String rut, String idIngrediente){
        if(!sucursales.isEmpty()){
            for(int i = 0; sucursales != null && i < sucursales.size(); i++){
                if((sucursales.get(i)).getRut().equals(rut)){
                    return sucursales.get(i).buscarIngredienteID(idIngrediente);
                }
            }
        }
        return null;
    }
    
    public boolean estaVacioIngredientes(String rut){
        if(!sucursales.isEmpty()){
            for(int i = 0; sucursales != null && i < sucursales.size(); i++){
                if((sucursales.get(i)).getRut().equals(rut)){
                    return sucursales.get(i).estaVacioIngredientes();
                }
            }
        }
        return false;
    }
    
    public boolean agregarIngrediente(String rut, Ingrediente nuevo){
        if(!sucursales.isEmpty()){
            for(int i = 0; sucursales != null && i < sucursales.size(); i++){
                if((sucursales.get(i)).getRut().equals(rut)){
                    return sucursales.get(i).agregarIngrediente(nuevo);
                }
            }
        }
        return false;
    }
    
    public boolean eliminarIngrediente(String rut, String id){
        if(!sucursales.isEmpty()){
            for(int i = 0; sucursales != null && i < sucursales.size(); i++){
                if((sucursales.get(i)).getRut().equals(rut)){
                    return sucursales.get(i).eliminarIngrediente(id);
                }
            }
        }
        return false;
    }
    
    public void mostrarIngredientes(String rutSucursal){
        for(Sucursal actual : sucursales){
            if(actual.getRut().equals(rutSucursal)){
                actual.mostrarIngredientes();
            }
        }
    }
    
    public boolean modificarIngrediente(String rut, String idIngrediente, Ingrediente modificado){
        if(!sucursales.isEmpty()){
            for(int i = 0; sucursales != null && i < sucursales.size(); i++){
                if((sucursales.get(i)).getRut().equals(rut)){
                    sucursales.get(i).modificarIngrediente(idIngrediente, modificado);
                    return true;
                }
            }
        }
        return false;
    }

    /*------ Métodos básicos para bebestibles ------*/

    public boolean agregarBebestible(String rutSucursal, Bebestible nuevo){
        if(!sucursales.isEmpty()){
            for(int i = 0; sucursales != null && i < sucursales.size(); i++){
                if((sucursales.get(i)).getRut().equals(rutSucursal)){
                    return sucursales.get(i).agregarBebestible(nuevo);
                }
            }
        }
        return false;
    }
    
    public boolean eliminarBebestible(String rutSucursal, String idBebestible){
        if(!sucursales.isEmpty()){
            for(int i = 0; sucursales != null && i < sucursales.size(); i++){
                if((sucursales.get(i)).getRut().equals(rutSucursal)){
                    return sucursales.get(i).eliminarBebestible(idBebestible);
                }
            }
        }
        return false;
    }
    
    public boolean modificarBebestible(String rutSucursal, String idBebestible, Bebestible modificado){
        if(!sucursales.isEmpty()){
            for(int i = 0; sucursales != null && i < sucursales.size(); i++){
                if((sucursales.get(i)).getRut().equals(rutSucursal)){
                    sucursales.get(i).modificarBebestible(idBebestible, modificado);
                    return true;
                }
            }
        }
        return false;
    }
    
    public void mostrarBebestibles(String rutSucursal){
        for(Sucursal actual : sucursales){
            if(actual.getRut().equals(rutSucursal)){
                actual.mostrarBebestibles();
            }
        }
    }
    
    /*------ Métodos básicos para pedidos ------*/
    
    /*
    public boolean agregarPedido(Sucursal sucursalN, Pedido nuevo){
        if(sucursales.contains(sucursalN)){
            return sucursalN.agregarPedido(nuevo);
        }
        return false;
    }
    */
    
    public Sucursal buscarSucursalRut(String rut){
        if(!sucursales.isEmpty()){
            for(int i = 0; sucursales != null && i < sucursales.size(); i++){
                if((sucursales.get(i)).getRut().equals(rut)){
                    return sucursales.get(i);
                }
            }
        }
        return null;
    }
    
    public boolean agregarPedido(String rut, Pedido nuevo){
        if(!sucursales.isEmpty()){
            Sucursal sucursalPedido = buscarSucursalRut(rut);
            if(sucursalPedido != null){
                return sucursalPedido.agregarPedido(nuevo);
            }
            return false;
        }
        return false;
    }
    
    public boolean eliminarPedido(String rut, String idPedido){
        if(!sucursales.isEmpty()){
            Sucursal sucursalPedido = buscarSucursalRut(rut);
            if(sucursalPedido != null){
                return sucursalPedido.eliminarPedido(idPedido);
            }
            return false;
        }
        return false;
    }
    
    public int cantidadPedidosCliente(Cliente cliente){
        int contador = 0;
        
        for(Sucursal actual :  sucursales){
            contador += actual.cantidadPedidosCliente(cliente);
        }
        
        return contador;
    }
    
    public int valorTotalPedidos(){
        int contador = 0;
        
        for(Sucursal actual :  sucursales){
            contador += actual.valorTotalPedidosSucursal();
        }
        
        return contador;
    }
    
    public void eliminarTodosPedidosCliente(Cliente eliminar){
        for(Sucursal actual : sucursales){
            actual.eliminarTodosLosPedidosCliente(eliminar);
        }
    }
    
    ///////////
    public Sucursal buscarSucursalMasIngresos(){
        Sucursal buscada = null;
        
        if(sucursales == null){
            return null;
        }
        buscada = sucursales.get(0);
        for(Sucursal actual : sucursales){
            if(buscada.valorTotalPedidosSucursal() < actual.valorTotalPedidosSucursal()){
                buscada = actual;
            }
        }
        
        return buscada;
    }
}

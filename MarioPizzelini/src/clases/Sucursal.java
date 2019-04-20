/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import listas.ListaPedido;
import listas.ListaCliente;

public class Sucursal {
    private String rut;
    private String direccion;
    private ListaPedido pedidos;
    private Inventario bodega;
    
    //Constructor
    public Sucursal(String rut, String direccion, ListaPedido pedidos, Inventario bodega) {
        this.rut = rut;
        this.direccion = direccion;
        this.pedidos = pedidos;
        this.bodega = bodega;
    }
    
    /*Getters y setters correspondientes*/
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public ListaPedido getPedidos() {
        return pedidos;
    }

    public Inventario getBodega() {
        return bodega;
    }
    
    /*----- Métodos básicos de Sucursal ------*/
    
    /*--- Métodos para Ingredientes ---*/
    
    public Boolean agregarIngrediente(Ingrediente nuevo){
        return bodega.agregarIngrediente(nuevo);
    }
    
    public Boolean eliminarIngrediente(Ingrediente eliminar){
        return bodega.eliminarIngrediente(eliminar);
    }
    
    public void modificarIngrediente(Ingrediente modificar, Ingrediente modificado){
        bodega.modificarIngrediente(modificar, modificado);
    }
    
    /*--- Métodos para Bebestibles ---*/
    
    public Boolean agregarBebestible(Bebestible nuevo){
        return bodega.agregarBebestible(nuevo);
    }
    
    public Boolean eliminarBebestible(Bebestible eliminar){
        return bodega.eliminarBebestible(eliminar);
    }
    
    public void modificarBebestible(Bebestible modificar, Bebestible modificado){
        bodega.modificarBebestible(modificar, modificado);
    }
    
    /*--- Métodos para pedidos ---*/
    
    public Boolean agregarPedido(Pedido nuevo){
        return pedidos.agregarPedido(nuevo);
    }
    
    public Boolean eliminarPedido(Pedido eliminar){
        return pedidos.eliminarPedido(eliminar);
    }
}

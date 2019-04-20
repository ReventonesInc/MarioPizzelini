/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import Listas.ListaCliente;
import Listas.ListaPedido;

/**
 *
 * @author XavierKrostya
 */
public class Sucursal {
    private String id;
    private String direccion;
    private ListaPedido pedidos;
    private ListaCliente clientes;
    private Inventario bodega;

    public Sucursal(String id, String direccion, ListaPedido pedidos, ListaCliente clientes, Inventario bodega) {
        this.id = id;
        this.direccion = direccion;
        this.pedidos = pedidos;
        this.clientes = clientes;
        this.bodega = bodega;
    }
    
    public ListaPedido getPedidos() {
        return pedidos;
    }

    public ListaCliente getClientes() {
        return clientes;
    }

    public Inventario getBodega() {
        return bodega;
    }
    
    public Boolean agregarIngrediente(Ingrediente nuevo){
        return bodega.agregarIngrediente(nuevo);
    }
    
    public Boolean eliminarIngrediente(Ingrediente eliminar){
        return bodega.eliminarIngrediente(eliminar);
    }
    
    public void modificarIngrediente(Ingrediente modificar, Ingrediente modificado){
        bodega.modificarIngrediente(modificar, modificado);
    }
    
    public Boolean agregarBebestible(Bebestible nuevo){
        return bodega.agregarBebestible(nuevo);
    }
    
    public Boolean eliminarBebestible(Bebestible eliminar){
        return bodega.eliminarBebestible(eliminar);
    }
    
    public void modificarBebestible(Bebestible modificar, Bebestible modificado){
        bodega.modificarBebestible(modificar, modificado);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import listas.ListaPedido;

public class Sucursal {
    private String rut;
    private String direccion;
    private ListaPedido pedidos;
    private Inventario bodega;
    
    //Constructor
    public Sucursal(String rut, String direccion) {
        this.rut = rut;
        this.direccion = direccion;
        this.pedidos = new ListaPedido();
        this.bodega = new Inventario();
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
    
    public boolean estaVacioIngredientes(){
        return bodega.estaVacioIngredientes();
    }
    
    public boolean agregarIngrediente(Ingrediente nuevo){
        return bodega.agregarIngrediente(nuevo);
    }
    
    public boolean eliminarIngrediente(String id){
        return bodega.eliminarIngrediente(id);
    }
    
    public void modificarIngrediente(String idIngrediente, Ingrediente modificado){
        bodega.modificarIngrediente(idIngrediente, modificado);
    }
    
    public void mostrarIngredientes(){
        bodega.mostrarIngredientes();
    }
    
    /*--- Métodos para Bebestibles ---*/
    
    public boolean agregarBebestible(Bebestible nuevo){
        return bodega.agregarBebestible(nuevo);
    }
    
    public boolean eliminarBebestible(String idBebestible){
        return bodega.eliminarBebestible(idBebestible);
    }
    
    public void modificarBebestible(String idBebestible, Bebestible modificado){
        bodega.modificarBebestible(idBebestible, modificado);
    }
    
    public void mostrarBebestibles(){
        bodega.mostrarBebestibles();
    }
    
    /*--- Métodos para Pedidos ---*/
    
    public boolean agregarPedido(Pedido nuevo){
        return pedidos.agregarPedido(nuevo);
    }
    
    public boolean eliminarPedido(String idPedido){
        if(pedidos.buscarPedido(idPedido)!=null){
            return pedidos.eliminarPedido(pedidos.buscarPedido(idPedido));
        }
        return false;
    }
    
    public int cantidadPedidosCliente(Cliente clienteBuscado){
        return pedidos.cantidadPedidosCliente(clienteBuscado);
    }
    
    public int valorTotalPedidosSucursal(){
        return pedidos.valorTotalPedidos();
    }
    
    public void eliminarTodosLosPedidosCliente(Cliente eliminar){
        pedidos.eliminarPedidosCliente(eliminar);
    }

}

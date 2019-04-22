/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import listas.*;

public class MarioPizzelini {
    private ListaSucursal sucursales;  //Lista de sucursales
    private ListaCliente clientes;  //Lista de clientes

    //Constructor
    public MarioPizzelini() {
        this.sucursales = new ListaSucursal();
        this.clientes = new ListaCliente();
    }
    
    /*------ Método básicos de MarioPizzelini ------*/
    
    public boolean estaVacioIngredientes(String rut){
        return sucursales.estaVacioIngredientes(rut);
    }
    
    public boolean estaVacioSucursales(){
        return sucursales.estaVacio();
    }
    
    public boolean agregarCliente(Cliente nuevoCliente){
        return clientes.agregarCliente(nuevoCliente);
    }
    
    public boolean eliminarCliente(String rutCliente){
        if(clientes.buscarClienteRut(rutCliente)){
            sucursales.eliminarTodosPedidosCliente(clientes.retornarClienteRut(rutCliente));
            return clientes.eliminarCliente(clientes.retornarClienteRut(rutCliente));
        }
        return false;
    }
    
    public boolean modificarCliente(String modificar, Cliente modificado){
        if(clientes.buscarClienteRut(modificar)){
            clientes.modificarCliente(clientes.retornarClienteRut(modificar), modificado);
            return true;
        }
        return false;
    }
    
    public boolean agregarIngrediente(String rutSucursal, Ingrediente nuevoIngrediente){
        return sucursales.agregarIngrediente(rutSucursal, nuevoIngrediente);
    }
    public boolean eliminarIngrediente(String rutSucursal, String id){
        return sucursales.eliminarIngrediente(rutSucursal, id);
    }
    
    public boolean modificarIngrediente(String rutSucursal, String idIngrediente, Ingrediente modificado){
        return sucursales.modificarIngrediente(rutSucursal, idIngrediente, modificado);
    }
    
    public boolean agregarBebestible(String rutSucursal, Bebestible nuevoBebestible){
        return sucursales.agregarBebestible(rutSucursal, nuevoBebestible);
    }
    
    
    public boolean modificarBebestible(String rutSucursal, String idBebestible, Bebestible modificado){
        return sucursales.modificarBebestible(rutSucursal, idBebestible, modificado);
    }
    
    public void mostrarBebestibles(String rutSucursal){
        sucursales.mostrarBebestibles(rutSucursal);
    }
    
    public Sucursal buscarSucursalPorRut(String rut){
        return sucursales.buscarSucursalRut(rut);
    }
    
    public boolean agregarSucursal(Sucursal nuevaSucursal){
        return sucursales.agregarSucursal(nuevaSucursal);
    }
    
    public boolean eliminarSucursal(String rutEliminar){
        return sucursales.eliminarSucursal(rutEliminar);
    }
    
    public void mostrarSucursales(){
        sucursales.mostrarSucursales();
    }
    
    public boolean agregarPedido(String rutSucursal, Pedido pedidoNuevo){
        return sucursales.agregarPedido(rutSucursal,pedidoNuevo);
    }
    
    public boolean eliminarPedido(String rutSucursal, String idPedidoEliminar){
        return sucursales.eliminarPedido(rutSucursal, idPedidoEliminar);
    }
    
    public Cliente buscarClienteConMasPedidos(){
        return clientes.clienteMasPedidos(sucursales);
    }
    
    public int recaudacionTotal(){
        return sucursales.valorTotalPedidos();
    }
    
    public Sucursal sucursalConMayorRecaudacion(){
        return sucursales.buscarSucursalMasIngresos();
    }
     
 }
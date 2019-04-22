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
    
    public Boolean estaVacioSucursales(){
        return sucursales.estaVacio();
    }
    
    public Boolean agregarCliente(Cliente nuevoCliente){
        return clientes.agregarCliente(nuevoCliente);
    }
    
    public Boolean eliminarCliente(Cliente eliminar){
        return clientes.eliminarCliente(eliminar);
    }
    
    public Boolean agregarSucursal(Sucursal nuevaSucursal){
        return sucursales.agregarSucursal(nuevaSucursal);
    }
    
    public Boolean eliminarSucursal(Sucursal eliminar){
        return sucursales.eliminarSucursal(eliminar);
    }
    
    public Boolean agregarIngrediente(String rutSucursal, Ingrediente nuevoIngrediente){
        return sucursales.agregarIngrediente(rutSucursal, nuevoIngrediente);
    }
    
    public Boolean eliminarIngrediente(String rutSucursal, Ingrediente ingredienteEliminar){
        return sucursales.eliminarIngrediente(rutSucursal, ingredienteEliminar);
    }
    
    public Boolean agregarPedido(String rutSucursal, Pedido pedidoNuevo){
        return sucursales.agregarPedido(rutSucursal,pedidoNuevo);
    }
    
    public Boolean eliminarPedido(String rutSucursal, Pedido eliminar){
        return sucursales.eliminarPedido(rutSucursal, eliminar);
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
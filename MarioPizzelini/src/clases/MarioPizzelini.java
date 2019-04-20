/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import listas.*;



/**
 *
 * @author ceap2
 */
public class MarioPizzelini {
    private ListaSucursal sucursales;
    private ListaCliente clientes;

    public MarioPizzelini() {
        this.sucursales = new ListaSucursal();
        this.clientes = new ListaCliente();
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
    
    
}

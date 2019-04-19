/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

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
    
    
}

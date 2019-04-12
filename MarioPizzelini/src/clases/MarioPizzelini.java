/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.util.*;

/**
 *
 * @author ceap2
 */
public class MarioPizzelini {
    private String[] ingredientes;
    private ListaCliente clientes;
    private ListaProducto productos;
    private ListaPromocion promociones;
    private ListaPizza pizzas;
    private ListaPedido pedidos;

    public MarioPizzelini(String[] ingredientes, ListaCliente clientes, ListaProducto productos, ListaPromocion promociones, ListaPizza pizzas, ListaPedido pedidos) {
        this.ingredientes = ingredientes;
        this.clientes = clientes;
        this.productos = productos;
        this.promociones = promociones;
        this.pizzas = pizzas;
        this.pedidos = pedidos;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public ListaCliente getClientes() {
        return clientes;
    }

    public void setClientes(ListaCliente clientes) {
        this.clientes = clientes;
    }

    public ListaProducto getProductos() {
        return productos;
    }

    public void setProductos(ListaProducto productos) {
        this.productos = productos;
    }

    public ListaPromocion getPromociones() {
        return promociones;
    }

    public void setPromociones(ListaPromocion promociones) {
        this.promociones = promociones;
    }

    public ListaPizza getPizzas() {
        return pizzas;
    }

    public void setPizzas(ListaPizza pizzas) {
        this.pizzas = pizzas;
    }

    public ListaPedido getPedidos() {
        return pedidos;
    }

    public void setPedidos(ListaPedido pedidos) {
        this.pedidos = pedidos;
    }
    
}

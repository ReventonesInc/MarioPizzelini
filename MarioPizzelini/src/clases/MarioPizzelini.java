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

    public MarioPizzelini(int cantIngredientes) {
        ingredientes = new String[cantIngredientes];
        this.clientes = new ListaCliente();
        this.productos = new ListaProducto();
        this.promociones = new ListaPromocion();
        this.pizzas = new ListaPizza();
        this.pedidos = new ListaPedido();
    }
    
}

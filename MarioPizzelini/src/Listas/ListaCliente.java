/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;
import clases.Cliente;
import java.util.*;

/**
 *
 * @author lusho
 */
public class ListaCliente {
    private ArrayList<Cliente> clientes;

    public ListaCliente() {
        this.clientes = new ArrayList<>();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    /**
    * Retorna un valor booleano. True si lo agrega, false si no lo agrega.
    * <p>
    * El argumento nuevoCliente debe ser tipo clase Cliente.
    * @param  nuevo Cliente a agregar en el ArrayList
    * @return      Valor booleano
    */
    public boolean agregarCliente(Cliente nuevo) {
        if(clientes.contains(nuevo)) {
            return false;
        }        
        return clientes.add(nuevo);
    }
    
    public boolean eliminarCliente(Cliente eliminar) {
        if(clientes.contains(eliminar)) {
            return clientes.remove(eliminar);            
        }
        return false;
    }

    public void modificarCliente(Cliente modificar, Cliente modificado) {
        clientes.set(clientes.indexOf(modificar), modificado);
    }
}
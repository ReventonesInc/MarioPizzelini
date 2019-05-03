/*
 * Clase que contendrá los metodos necesarios para manejar los clientes
 */
package listas;
import clases.Cliente;
import java.util.*;

public class ListaCliente {
    private ArrayList<Cliente> clientes;

    //Constructor(es)
    public ListaCliente() {
        this.clientes = new ArrayList<>();
    }
    
    //Getters y setters correspondientes
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
        
    /**
     * Retorna true, si no hay clientes en la lista de clientes, sino,
     * retornara false.
     * <p>
     * @return booleano.
     */
    public boolean estaVacio(){
        return clientes.isEmpty();
    }    
    /**
     * Retorna un valor booleano. True si lo agrega, false si no lo agrega.
     * <p>
     * @param  nuevo Cliente
     * @return booleano.
     */
    public boolean agregarCliente(Cliente nuevo) {
        if(clientes.contains(nuevo)) {
            return false;
        }        
        return clientes.add(nuevo);
    }
    /**
     * Retorna un valor booleano. True si lo elimina, false si no lo elimina.
     * <p>
     * @param  eliminar Cliente
     * @return booleano.
     */
    public boolean eliminarCliente(Cliente eliminar) {//Cambiarlo
        if(clientes.contains(eliminar)) {
            return clientes.remove(eliminar);            
        }
        return false;
    }
    /**
     * Permite modificar un cliente por uno nuevo entregado por parametro.
     * <p>
     * @param modificar Cliente.
     * @param modificado Ingrediente.
     */
    public void modificarCliente(Cliente modificar, Cliente modificado) {//Cambiarlo
        clientes.set(clientes.indexOf(modificar), modificado);
    }
    /**
     * Retorna el cliente con la mayor cantidad de pedidos en la empresa.
     * <p>
     * @param sucursales ListaSucursal.
     * @return Cliente.
     */
    public Cliente clienteMasPedidos(ListaSucursal sucursales){
        int contador = 0;
        Cliente mayorPedidos = null;
        for(Cliente actual : clientes){
            if(contador < sucursales.cantidadPedidosCliente(actual)){
                contador = sucursales.cantidadPedidosCliente(actual);
                mayorPedidos = actual;
            }
        }
        return mayorPedidos;
    }
    /**
     * Retorna un valor booleano, true si encontro el cliente dado un rut
     * entregado por parámetro, sino, retornará false.
     * <p>
     * @param rutCliente String.
     * @return booleano.
     */
    public boolean buscarClienteRut(String rutCliente){
        if(!clientes.isEmpty()){
            for(Cliente actual : clientes){
                if(actual.getRut().equals(rutCliente)){
                    return true;
                }
            }
        }
        return false;
    }
    /**
     * Retorna el cliente encontrado, luego de buscarlo en la lista dado
     * su rut.
     * <p>
     * @param rutCliente String.
     * @return booleano.
     */
    public Cliente retornarClienteRut(String rutCliente){
        if(!clientes.isEmpty()){
            for(Cliente actual : clientes){
                if(actual.getRut().equals(rutCliente)){
                    return actual;
                }
            }
        }
        return null;
    }
}
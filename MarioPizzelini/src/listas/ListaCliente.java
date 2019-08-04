/*
 * Clase que contendrá los metodos necesarios para manejar los clientes
 */
package listas;
import clases.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListaCliente {
    private ArrayList<Cliente> clientes;

    //Constructor(es)
    public ListaCliente() {
        this.clientes = new ArrayList<>();
        
        ResultSet respuesta = Conexiones.Conexion.Consulta("SELECT * FROM Cliente");
        try {
            while(respuesta.next()){
                clientes.add(new Cliente(respuesta.getInt(1),respuesta.getString(2),respuesta.getString(3),respuesta.getString(4),respuesta.getString(5)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ListaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        Conexiones.Conexion.Consulta("INSERT INTO id6lWQPWdK.Cliente (idCliente, rutCliente, nombreCliente, apellidoCliente, telefonoCliente) VALUES ("+clientes.size()+1+","+nuevo.getRut()+","+nuevo.getNombre()+","+nuevo.getApellido()+","+nuevo.getTelefono()+")");
        return clientes.add(nuevo);
    }
    /**
     * Retorna un valor booleano. True si lo elimina, false si no lo elimina.
     * <p>
     * @param rutCliente String.
     * @return booleano.
     */
    public boolean eliminarCliente(String rutCliente) {//Cambiarlo --> Cambiado
        Cliente eliminado = retornarClienteRut(rutCliente);
        if(eliminado != null) {
            return clientes.remove(eliminado);
        }
        return false;
    }
    /**
     * Permite modificar un cliente por uno nuevo entregado por parametro.
     * <p>
     * @param rutCliente String.
     * @param modificado Cliente.
     */
    public void modificarCliente(String rutCliente, Cliente modificado) {
        Cliente modificar = retornarClienteRut(rutCliente);
        modificar.setRut(modificado.getRut());
        modificar.setNombre(modificado.getNombre());
        modificar.setApellido(modificado.getApellido());
        modificar.setTelefono(modificado.getTelefono());
    }
    /*public void modificarCliente(Cliente modificar, Cliente modificado) {//Cambiarlo
        modificar.setRut(modificado.getRut());
        modificar.setNombre(modificado.getNombre());
        modificar.setApellido(modificado.getApellido());
        modificar.setTelefono(modificado.getTelefono());
        //clientes.set(clientes.indexOf(modificar), modificado);
    }*/
    
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
    
    public void testMostrarClientes(){
        if(!clientes.isEmpty()){
            for(Cliente actual : clientes){
                System.out.println(actual.getId()+"     "+actual.getNombre()+" "+actual.getApellido()+" "+actual.getRut()+" "+actual.getTelefono());
            }
        }
        else{
            System.out.println("NO HAY CLIENTES");
        }
    }
}
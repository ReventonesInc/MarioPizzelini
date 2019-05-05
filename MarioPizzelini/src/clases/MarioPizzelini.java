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

    //Constructor(es)
    public MarioPizzelini() {
        this.sucursales = new ListaSucursal();
        this.clientes = new ListaCliente();
    }
    
        /*--- Métodos para Cliente ---*/
    
    /**
    * Retorna un valor booleano. True si lo agrega, false si no lo agrega.
    * <p>
    * @param  nuevoCliente Cliente
    * @return booleano.
    */
    public boolean agregarCliente(Cliente nuevoCliente){
        return clientes.agregarCliente(nuevoCliente);
    }
    /**
    * Retorna un valor booleano. True si lo elimina el cliente que coincide
    * con el rut entregado por parámetro y false si no lo elimina.
    * <p>
    * @param  rutCliente Cliente
    * @return booleano.
    */
    public boolean eliminarCliente(String rutCliente){
        if(clientes.buscarClienteRut(rutCliente)){
            sucursales.eliminarTodosPedidosCliente(clientes.retornarClienteRut(rutCliente));
            return clientes.eliminarCliente(clientes.retornarClienteRut(rutCliente));
        }
        return false;
    }
    /**
    * Permite modificar un cliente por uno nuevo entregado por parametro.
    * <p>
    * @param modificar String.
    * @param modificado Cliente.
    * @return booleano.
    */
    public boolean modificarCliente(String modificar, Cliente modificado){
        if(clientes.buscarClienteRut(modificar)){
            clientes.modificarCliente(clientes.retornarClienteRut(modificar), modificado);
            return true;
        }
        return false;
    }
    /**
     * Retorna el cliente con la mayor cantidad de pedidos en la empresa.
     * <p>
     * @return Cliente.
     */
    public Cliente buscarClienteConMasPedidos(){
        return clientes.clienteMasPedidos(sucursales);
    }
    
        /*--- Métodos para Sucursal ---*/

    public boolean estaVacioSucursales(){
        return sucursales.estaVacio();
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
    
    public Sucursal sucursalConMayorRecaudacion(){
        return sucursales.buscarSucursalMasIngresos();
    }
    
    public int recaudacionTotal(){
        return sucursales.valorTotalPedidos();
    }
    
        /*--- Métodos para Ingrediente ---*/

    public boolean estaVacioIngredientes(String rut){
        return sucursales.estaVacioIngredientes(rut);
    }
    
    public Ingrediente buscarIngredienteID(String rut, String id){
        return sucursales.buscarIngredienteID(rut, id);
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
    
    public void mostrarIngredientes(String rutSucursal){
        sucursales.mostrarIngredientes(rutSucursal);
    }
    
        /*--- Métodos para Ingrediente ---*/

    public boolean estaVacioBebestibles(String rut){
        return sucursales.estaVacioBebestibles(rut);
    }
    
    public Bebestible buscarBebestibleID(String rut, String id){
        return sucursales.buscarBebestibleID(rut, id);
    }
    
    public boolean agregarBebestible(String rutSucursal, Bebestible nuevoBebestible){
        return sucursales.agregarBebestible(rutSucursal, nuevoBebestible);
    }
    
    public boolean eliminarBebestible(String rutSucursal, String idBebestible){
        return sucursales.eliminarBebestible(rutSucursal, idBebestible);
    }
    
    public boolean modificarBebestible(String rutSucursal, String idBebestible, Bebestible modificado){
        return sucursales.modificarBebestible(rutSucursal, idBebestible, modificado);
    }
    
    public void mostrarBebestibles(String rutSucursal){
        sucursales.mostrarBebestibles(rutSucursal);
    }
    
        /*--- Métodos para Pedido ---*/
    
    public boolean agregarPedido(String rutSucursal, Pedido pedidoNuevo){
        return sucursales.agregarPedido(rutSucursal,pedidoNuevo);
    }
    
    public boolean eliminarPedido(String rutSucursal, String idPedidoEliminar){
        return sucursales.eliminarPedido(rutSucursal, idPedidoEliminar);
    }
    
    public boolean agregarPizza(String rutSucursal, String idPedido, Pizza nuevo){
        return sucursales.agregarPizza(rutSucursal, idPedido, nuevo);
    }
    
    public void mostrarPedidoPorID(String rutSucursal, String idPedido){
        sucursales.mostrarPedidoPorID(rutSucursal, idPedido);
    }
    
    public void actualizarMontoTotalDeUnPedido(String rutSucursal, String idPedido){
        sucursales.actualizarMontoTotalDeUnPedido(rutSucursal, idPedido);
    }
}
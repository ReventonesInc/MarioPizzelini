/*
 * Esta clase contiene los datos de la sucursal y los metodos necesarios para
 * 
 */
package clases;

import listas.ListaPedido;

public class Sucursal {
    private int idSucursal;
    private String rut;
    private String direccion;
    private ListaPedido pedidos;
    private Inventario bodega;
    
    //Constructor(es)
    public Sucursal(String rut, String direccion) {
        this.rut = rut;
        this.direccion = direccion;
        this.pedidos = new ListaPedido();
        this.bodega = new Inventario();
    }
    
    //Getters y setters correspondientes
    public int getIdSucursal(){
        return idSucursal;
    }
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public ListaPedido getPedidos() {
        return pedidos;
    }

    public Inventario getBodega() {
        return bodega;
    }
    
        /*--- Métodos para Ingredientes ---*/
    
    /**
     * Retorna true, si no hay ingredientes en el inventario, sino retornara
     * false.
     * <p>
     * @return booleano.
     */
    public boolean estaVacioIngredientes(){
        return bodega.estaVacioIngredientes();
    }
    /**
     * Retorna el ingrediente encontrado, luego de buscarlo en inventario dado
     * su id.
     * <p>
     * @param idIngrediente String.
     * @return booleano.
     */
    public Ingrediente buscarIngredienteID(String idIngrediente){
        return bodega.buscarIngredienteID(idIngrediente);
    }
    /**
     * Retorna true, si el ingrediente ingresado por parámetro es agregado
     * al inventario exitosamente, sino, retornará false.
     * <p>
     * @param nuevo Ingrediente.
     * @return booleano.
     */
    public boolean agregarIngrediente(Ingrediente nuevo){
        return bodega.agregarIngrediente(nuevo);
    }
    /**
     * Retorna true y elimina el ingrediente, si el id ingresado por paramatro
     * coincide con uno de los ingredientes en el inventario. Sino, retornará
     * false.
     * <p>
     * @param id String.
     * @return booleano.
     */
    public boolean eliminarIngrediente(String id){
        return bodega.eliminarIngrediente(id);
    }
    /**
     * Permite modificar un ingrediente por uno nuevo entregado por parametro.
    * <p>
    * @param idIngrediente String.
    * @param modificado Ingrediente.
    */
    public void modificarIngrediente(String idIngrediente, Ingrediente modificado){
        bodega.modificarIngrediente(idIngrediente, modificado);
    }
    /**
     * Muestra los ingredientes contenidos en el inventario.
    * <p>
    */
    public void mostrarIngredientes(){
        bodega.mostrarIngredientes();
    }
    
        /*--- Métodos para Bebestibles ---*/
    
    /**
     * Retorna true, si no hay bebestibles en el inventario, sino retornara
     * false.
     * <p>
     * @return booleano.
     */
    public boolean estaVacioBebestibles(){
        return bodega.estaVacioBebestibles();
    }
    /**
     * Retorna el bebestible encontrado, luego de buscarlo en inventario dado
     * su id.
     * <p>
     * @param idBebestible String.
     * @return booleano.
     */
    public Bebestible buscarBebestibleID(String idBebestible){
        return bodega.buscarBebestibleID(idBebestible);
    }
    /**
     * Retorna true, si el bebestible ingresado por parámetro es agregado
     * al inventario exitosamente, sino, retornará false.
     * <p>
     * @param nuevo Bebestible.
     * @return booleano.
     */
    public boolean agregarBebestible(Bebestible nuevo){
        return bodega.agregarBebestible(nuevo);
    }
    /**
     * Retorna true y elimina el bebestible, si el id ingresado por paramatro
     * coincide con uno de los bebestibles en el inventario. Sino, retornará
     * false.
     * <p>
     * @param idBebestible String.
     * @return booleano.
     */
    public boolean eliminarBebestible(String idBebestible){
        return bodega.eliminarBebestible(idBebestible);
    }
    /**
     * Permite modificar un bebestible por uno nuevo entregado por parametro.
    * <p>
    * @param idBebestible String.
    * @param modificado Ingrediente.
    */
    public void modificarBebestible(String idBebestible, Bebestible modificado){
        bodega.modificarBebestible(idBebestible, modificado);
    }
    /**
     * Muestra los bebestibles contenidos en el inventario.
    * <p>
    */
    public void mostrarBebestibles(){
        bodega.mostrarBebestibles();
    }
    
        /*--- Métodos para Pedidos ---*/
    /**
     * Retorna true, si el pedido ingresado por parámetro es agregado 
     * exitosamente, sino, retornará false.
     * <p>
     * @param nuevo Pedido.
     * @return booleano.
     */
    public boolean agregarPedido(Pedido nuevo){
        return pedidos.agregarPedido(nuevo);
    }
    /**
     * Retorna true y elimina el pedido, si el id ingresado por paramatro
     * coincide con uno de los pedidos en la lista pedidos. Sino, retornará
     * false.
     * <p>
     * @param key int,
     * @return booleano.
     */
    public boolean eliminarPedido(int key){
        return pedidos.eliminarPedido(key);
    }
    /**
     * Retorna la cantidad de pedidos realizados por un cliente. El cliente
     * a buscar es entregado por parámetro.
     * <p>
     * @param clienteBuscado Cliente.
     * @return int.
     */
    public int cantidadPedidosCliente(Cliente clienteBuscado){
        return pedidos.cantidadPedidosCliente(clienteBuscado);
    }
    
    /**
     * Retorna el valor recaudado en la sucursal, luego de sumar los montos
     * de todos los pedidos realizados.
     * <p>
     * @return int.
     */
    public int valorTotalPedidosSucursal(){
        return pedidos.valorTotalPedidos();
    }
    
    /**
     * Elimina todos los pedidos de un cliente entregado por parámetro.
     * <p>
     * @param rutCliente String.
     */
    public void eliminarTodosLosPedidosCliente(String rutCliente){
        pedidos.eliminarPedidosCliente(rutCliente);
    }

    public boolean agregarPizza(int keyPedido, Pizza nuevo){
        return pedidos.agregarPizza(keyPedido, nuevo);
    }
    
    public void mostrarPedidoPorID(int keyPedido){
        pedidos.mostrarPedidoPorID(keyPedido);
    }
    
    public void actualizarMontoTotalDeUnPedido(int keyPedido){
        pedidos.actualizarMontoTotalDeUnPedido(keyPedido);
    }
}

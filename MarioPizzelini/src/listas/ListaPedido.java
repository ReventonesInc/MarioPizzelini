/*
 * Clase ListaPedido, el cual manejará un ArrayList de tipo Pedido.
 * En general se guardarán los pedidos de la pizzería.
 */
package listas;
import clases.Pedido;
import java.util.ArrayList;
import clases.Cliente;
import clases.Pizza;

public class ListaPedido {
    private ArrayList<Pedido> pedidos;    //ArrayList donde se guardarán los pedidos
    
    //Constructor de ListaPedido    
    public ListaPedido() {
        this.pedidos = new ArrayList();
    }
    
    //Getter y setters correspondientes    
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
    
    //Métodos de ListaPedido    
    
    /**
     * Retorna true si el pedido ingresado es agregado existosamente al
     * ArrayList, en el caso contrario retornará false
     * <p>
     * @param nuevo pedido para agregar al ArrayList
     * @return boolean
     */
    public boolean agregarPedido(Pedido nuevo){
        if(pedidos.contains(nuevo)){
            return false;
        }
        return pedidos.add(nuevo);
    }
    
    /**
     * Retorna true si se elimina exitosamente del ArrayList, en el caso
     * contrario retornará false.
     * <p>
     * @param eliminar identificación del pedido
     * @return boolean
     */
    public boolean eliminarPedido(Pedido eliminar) {
        if(pedidos.contains(eliminar)) {
            return pedidos.remove(eliminar);            
        }
        return false;
    }
    /**
     * Modifica el pedido indicado por parámetro por el nuevo entregado por
     * parámetro.
     * <p>
     * @param modificar
     * @param modificado 
     */
    public void modificarPedido(Pedido modificar, Pedido modificado) {
        modificar.setIdPedido(modificado.getIdPedido());
        modificar.setMontoPedido(modificado.getMontoPedido());
        //pedidos.set(pedidos.indexOf(modificar), modificado);
    }
    /**
     * Retorna el pedido encontrado, luego de buscarlo dado su id entregado
     * por parámetro.
     * <p>
     * @param idPedido String.
     * @return Pedido.
     */
    public Pedido buscarPedido(String idPedido){
        if(!pedidos.isEmpty()){
            for(Pedido actual : pedidos){
                if(actual.getIdPedido().equals(idPedido)){
                    return actual;
                }
            }
        }
        return null;
    }
    /**
     * Retorna el valor total de sumar todos los montos de los pedidos.
     * <p>
     * @return int.
     */
    public int valorTotalPedidos() {    //Monto Recaudado en la sucursal
        int total = 0;
        if(!pedidos.isEmpty()) {
            for(Pedido actual : pedidos) {
                total += actual.getMontoPedido();
            }
        }
        return total;
    }
    /**
     * Retorna la cantidad de pediso de un cliente entregado por parámetro.
     * <p>
     * @param clienteBuscado Cliente.
     * @return int.
     */
    public int cantidadPedidosCliente(Cliente clienteBuscado){
        int contador = 0;
        
        for(Pedido actual : pedidos){
            if(actual.getClienteReferenciado().equals(clienteBuscado)){
                contador++;
            }
        }
        
        return contador;
    }
    /**
     * Elimina todos los pedidos de un cliente entregado por parámetro.
     * <p>
     * @param eliminar Cliente.
     */
    public void eliminarPedidosCliente(Cliente eliminar){
        for(Pedido actual : pedidos){
            if(actual.getClienteReferenciado().equals(eliminar)){
                pedidos.remove(actual);
            }
        }
    }
    
    public boolean agregarPizza(String idPedido, Pizza nuevo){
        for(Pedido actual : pedidos) {
            if(actual.getIdPedido().equals(idPedido)){
                actual.agregarPizza(nuevo);
            }
        }
        return false;
    }
    
    public void mostrarPedidoPorID(String idPedido){
        for(Pedido actual : pedidos) {
            if(actual.getIdPedido().equals(idPedido)){
                System.out.println("ID: "+actual.getIdPedido()+" RUT: "+actual.getClienteReferenciado().getRut()+" MONTO: "+actual.getMontoPedido());
            }
        }
    }
    
    public void actualizarMontoTotalDeUnPedido(String idPedido){
        for(Pedido actual : pedidos) {
            if(actual.getIdPedido().equals(idPedido)){
                actual.ActualizarMontoTotal();
            }
        }
    }
}

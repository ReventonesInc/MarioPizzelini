/*
 * Clase ListaPedido, el cual manejará un ArrayList de tipo Pedido.
 * En general se guardarán los pedidos de la pizzería.
 */
package listas;
import clases.Pedido;
import java.util.ArrayList;
import clases.Cliente;

public class ListaPedido {
    private ArrayList<Pedido> pedidos;    //ArrayList donde se guardarán los pedidos
    
    //A continuación se el constructor de ListaPedido
    
    public ListaPedido() {
        this.pedidos = new ArrayList();
    }
    
    //Getter y setters correspondientes
    
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
    
    //Métodos de ListaPedido
    
    
    /**
     * Retorna un pedido si encuentra la identificación registrada en el
     * ArrayList de pedidos, si no retornará null.
     * <p>
     * @param idPedido identificación del pedido
     * @return class Pedido o null
     */
        
    public Pedido buscarPedido(String idPedido){
        for(int i = 0; pedidos != null && i < pedidos.size(); i++){
            if((pedidos.get(i)).getIdPedido().equals(idPedido)){
                return pedidos.get(i);
            }
        }
        return null;
    }
    
    /**
     * Retorna true si el pedido ingresado es agregado existosamente del ArrayList,
     * en el caso contrario retornará false
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
     * Retorna true si se elimina exitosamente del ArrayList, en el caso contrario
     * retornará false.
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
    
    public void modificarPedido(Pedido modificar, Pedido modificado) {
        pedidos.set(pedidos.indexOf(modificar), modificado);
    }
    
    public int valorTotalPedidos() {    //Monto Recaudado en la sucursal
        int total = 0;
        if(!pedidos.isEmpty()) {
            for(Pedido actual : pedidos) {
                total += actual.getMontoPedido();
            }
        }
        return total;
    }
    
    public int cantidadPedidosCliente(Cliente clienteBuscado){
        int contador = 0;
        
        for(Pedido actual : pedidos){
            if(actual.getClienteReferenciado().equals(clienteBuscado)){
                contador++;
            }
        }
        
        return contador;
    }
    
    
}

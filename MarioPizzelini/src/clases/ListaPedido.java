/*
 * Clase ListaPedido, el cual manejará un ArrayList de tipo Pedido.
 * En general se guardarán los pedidos de la pizzería.
 */
package clases;
import java.util.ArrayList;

public class ListaPedido {
    private ArrayList<Pedido> pedidos;    //ArrayList donde se guardarán los pedidos
    
    //A continuación se el constructor de ListaPedido
    
    public ListaPedido(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
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
            if((pedidos.get(i)).getId().equals(idPedido)){
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
     * @return Boolean
     */
    public Boolean agregarPedido(Pedido nuevo){
        if(pedidos.isEmpty()){
            return pedidos.add(nuevo);
        }
        else{
            return pedidos.add(nuevo);
        }
    }
    
    /**
     * Retorna true si se elimina exitosamente del ArrayList, en el caso contrario
     * retornará false.
     * <p>
     * @param idPedido identificación del pedido
     * @return Boolean
     */
    public Boolean eliminarPedido(String idPedido){
        if(pedidos.isEmpty()){
            return false;
        }
        else{
            Pedido pedidoBuscado = buscarPedido(idPedido);
            if(pedidoBuscado != null){
                return pedidos.remove(pedidoBuscado);
            }
            else{
                return false;
            }
        }
    }
}

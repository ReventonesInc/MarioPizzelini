/*
 * Clase ListaPedido, el cual manejará un ArrayList de tipo Pedido.
 * En general se guardarán los pedidos de la pizzería.
 */
package clases;
import java.util.ArrayList;

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
    
    public Boolean buscarPedido(String id){
        for(int i = 0; pedidos != null && i < pedidos.size(); i++){
            if((pedidos.get(i)).getId().equals(id)){
                return true;
            }
        }
        return false;
    }
    
    public Boolean agregarPedido(Pedido nuevo){
        if(pedidos.isEmpty()){
            return pedidos.add(nuevo);
        }
        else{
            return pedidos.add(nuevo);
        }
    }
    
    /*
    public Boolean eliminarPedido(String idPedido){
        if(pedidos.isEmpty()){
            return false;
        }
        else{
            asd
        }
    }
    */
}

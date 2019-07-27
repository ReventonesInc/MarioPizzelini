/*
 * Clase ListaPedido, el cual manejará un ArrayList de tipo Pedido.
 * En general se guardarán los pedidos de la pizzería.
 */
package listas;
import clases.Pedido;
import java.util.ArrayList;
import clases.Cliente;
import clases.Pizza;
import java.util.HashMap;
import java.util.Set;

public class ListaPedido {
    private HashMap<Integer,Pedido> listaPedidos; //Diccionario donde se guardarán los pedidos;
    private ArrayList<Pedido> pedidos;
    
    //Constructor de ListaPedido    
    public ListaPedido() {
        this.listaPedidos = new HashMap<>();
        this.pedidos = new ArrayList();
    }
    
    //Getter y setters correspondientes    
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
    
    public HashMap<Integer, Pedido> getListaPedidos() {
        return listaPedidos;
    }
    
    //Métodos de ListaPedido
    
    public int generarIndice(){
        int indice = listaPedidos.size();
        return indice;
    }
    
    public Pedido buscarPedido(int keyBuscado){
        Set<Integer> totalKeys = listaPedidos.keySet();
        for(Integer key : totalKeys){
            if(key == keyBuscado){
                return listaPedidos.get(key);
            }
        }
        return null;
    }
    
    public int buscarIndice(Pedido buscar){
        Set<Integer> totalKeys = listaPedidos.keySet();
        for(Integer key : totalKeys){
            if(listaPedidos.get(key) == buscar){
                return key;
            }
        }
        return 0;
    }
    
    public boolean agregarPedido(Pedido nuevo){
        if(!listaPedidos.containsValue(nuevo)){
            int nuevaKey = generarIndice();
            listaPedidos.put(nuevaKey, nuevo);
            return true;
        }
        return false;
    }
    
    public boolean eliminarPedido(Pedido eliminar){
        if(listaPedidos.containsValue(eliminar)){
            int key = buscarIndice(eliminar);
            return listaPedidos.remove(key,eliminar);
        }
        return false;
    }
    
    public boolean eliminarPedido(int key){
        if(listaPedidos.containsKey(key)){
            Pedido eliminar = buscarPedido(key);
            return listaPedidos.remove(key,eliminar);
        }
        return false;
    }
    
    public void modificarMontoPedido(int keyPedido, Pedido modificado){
        if(listaPedidos.containsKey(keyPedido)){
            listaPedidos.get(keyPedido).setMontoPedido(modificado.getMontoPedido());
        }
    }
    
    public int valorTotalPedidos(){
        int total = 0;
        if(!listaPedidos.isEmpty()){
            Set<Integer> totalKeys = listaPedidos.keySet();
            for(Integer key : totalKeys){
                total += listaPedidos.get(key).getMontoPedido();
            }
        }
        return 0;
    }
    
    public int cantidadPedidosCliente(Cliente clienteBuscado){
        int contador = 0;
        if(!listaPedidos.isEmpty()){
            Set<Integer> totalKeys = listaPedidos.keySet();
            for(Integer key : totalKeys){
                if(listaPedidos.get(key).getClienteReferenciado().equals(clienteBuscado)){
                    contador++;
                }
            }
        }
        return contador;
    }
    
    public boolean eliminarPedidosCliente(Cliente eliminar){
        if(!listaPedidos.isEmpty()){
           Set<Integer> totalKeys = listaPedidos.keySet();
            for(Integer key : totalKeys){
                if(listaPedidos.get(key).getClienteReferenciado().equals(eliminar)){
                    return listaPedidos.remove(key, listaPedidos.get(key));
                }
            } 
        }
        return false;
    }
    
    public boolean agregarPizza(int keyPedido, Pizza nuevo){
        if(!listaPedidos.isEmpty()){
           Set<Integer> totalKeys = listaPedidos.keySet();
            for(Integer key : totalKeys){
                if(key.equals(keyPedido)){
                    return listaPedidos.get(key).agregarPizza(nuevo);
                }
            } 
        }
        return false;
    }
    
    public void actualizarMontoTotalDeUnPedido(int keyPedido){
        if(!listaPedidos.isEmpty()){
           Set<Integer> totalKeys = listaPedidos.keySet();
            for(Integer key : totalKeys){
                if(key.equals(keyPedido)){
                    listaPedidos.get(key).ActualizarMontoTotal();
                }
            } 
        }
    }
    
    public void mostrarPedidoPorID(int keyPedido){
        if(!listaPedidos.isEmpty()){
           Set<Integer> totalKeys = listaPedidos.keySet();
            for(Integer key : totalKeys){
                if(key.equals(keyPedido)){
                    System.out.println("ID: "+keyPedido+" RUT: "+listaPedidos.get(key).getClienteReferenciado().getRut()+" MONTO: "+listaPedidos.get(key).getMontoPedido());
                }
            } 
        }
        else{
            System.out.println("No hay pedidos registrados!");
        }
    }
    
    
    //CORRESPONDE EN EL ARRAYLIST <------------------------------ ATENCIÓN
    //Métodos de ListaPedido    
    
    /*
    /**
     * Retorna true si el pedido ingresado es agregado existosamente al
     * ArrayList, en el caso contrario retornará false
     * <p>
     * @param nuevo pedido para agregar al ArrayList
     * @return boolean
     */
    /*
    public boolean agregarPedido(Pedido nuevo){
        if(pedidos.contains(nuevo)){
            return false;
        }
        return pedidos.add(nuevo);
    }
    */
    
    /*
    /**
     * Retorna true si se elimina exitosamente del ArrayList, en el caso
     * contrario retornará false.
     * <p>
     * @param eliminar identificación del pedido
     * @return boolean
     */
    /*
    public boolean eliminarPedido(Pedido eliminar) {
        if(pedidos.contains(eliminar)) {
            return pedidos.remove(eliminar);            
        }
        return false;
    }
    */
    
    /*
    /**
     * Modifica el pedido indicado por parámetro por el nuevo entregado por
     * parámetro.
     * <p>
     * @param modificar
     * @param modificado 
     */
    /*
    public void modificarPedido(Pedido modificar, Pedido modificado) {
        modificar.setIdPedido(modificado.getIdPedido());
        modificar.setMontoPedido(modificado.getMontoPedido());
        //pedidos.set(pedidos.indexOf(modificar), modificado);
    }
    */
    
    /*
    /**
     * Retorna el pedido encontrado, luego de buscarlo dado su id entregado
     * por parámetro.
     * <p>
     * @param idPedido String.
     * @return Pedido.
     */
    /*
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
    */
    
    /*
    /**
     * Retorna el valor total de sumar todos los montos de los pedidos.
     * <p>
     * @return int.
     */
    /*
    public int valorTotalPedidos() {    //Monto Recaudado en la sucursal
        int total = 0;
        if(!pedidos.isEmpty()) {
            for(Pedido actual : pedidos) {
                total += actual.getMontoPedido();
            }
        }
        return total;
    }
    */
    
    /*
    /**
     * Retorna la cantidad de pediso de un cliente entregado por parámetro.
     * <p>
     * @param clienteBuscado Cliente.
     * @return int.
     */
    /*
    public int cantidadPedidosCliente(Cliente clienteBuscado){
        int contador = 0;
        
        for(Pedido actual : pedidos){
            if(actual.getClienteReferenciado().equals(clienteBuscado)){
                contador++;
            }
        }
        
        return contador;
    }
    */
    
    /*
    /**
     * Elimina todos los pedidos de un cliente entregado por parámetro.
     * <p>
     * @param eliminar Cliente.
     */
    /*
    public void eliminarPedidosCliente(Cliente eliminar){
        for(Pedido actual : pedidos){
            if(actual.getClienteReferenciado().equals(eliminar)){
                pedidos.remove(actual);
            }
        }
    }
    */
    
    /*
    public boolean agregarPizza(String idPedido, Pizza nuevo){
        for(Pedido actual : pedidos) {
            if(actual.getIdPedido().equals(idPedido)){
                actual.agregarPizza(nuevo);
            }
        }
        return false;
    }
    */
    
    /*
    public void mostrarPedidoPorID(String idPedido){
        for(Pedido actual : pedidos) {
            if(actual.getIdPedido().equals(idPedido)){
                System.out.println("ID: "+actual.getIdPedido()+" RUT: "+actual.getClienteReferenciado().getRut()+" MONTO: "+actual.getMontoPedido());
            }
        }
    }
    */
    
    /*
    public void actualizarMontoTotalDeUnPedido(String idPedido){
        for(Pedido actual : pedidos) {
            if(actual.getIdPedido().equals(idPedido)){
                actual.ActualizarMontoTotal();
            }
        }
    }
    */
}

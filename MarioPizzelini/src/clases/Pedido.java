/*
 * Clase pedido, el cual contendrá las diferentes formas para que un cliente
 * pueda crear y ordenar su pedido.
 */
package clases;

public class Pedido {
    private int idPedido;
    private Cliente clienteReferenciado;       //cliente que ordenó el pedido
    private Pizza[] pizzasPedidas;             //pizzas escogidas por el cliente
    private Bebestible[] bebestiblesPedidos;   //bebestibles escogidos por el cliente
    private int montoPedido;
    
    //Constructor(es)
    
    //Cuando el cliente pide: Pizza
    public Pedido(int idPedido, Cliente clienteReferenciado, int cantPizzas){
        this.idPedido = idPedido;
        this.clienteReferenciado = clienteReferenciado;
        this.pizzasPedidas = new Pizza[cantPizzas];
        this.bebestiblesPedidos = null;
        this.montoPedido = 0;
    }
    
    //Cuando el cliente pide: Bebestible, Pizza
    public Pedido(Cliente clienteReferenciado, int cantPizzas, int cantBebestibles){
        this.clienteReferenciado = clienteReferenciado;
        this.pizzasPedidas = new Pizza[cantPizzas];
        this.bebestiblesPedidos = new Bebestible[cantBebestibles];
        this.montoPedido = 0;
    }
    
    //Getters y setters correspondientes
    public int getIdPedido(){
        return idPedido;
    }
    public Cliente getClienteReferenciado() {
        return clienteReferenciado;
    }

    public void setClienteReferenciado(Cliente clienteReferenciado) {
        this.clienteReferenciado = clienteReferenciado;
    }

    public Pizza[] getPizzasPedidas() {
        return pizzasPedidas;
    }

    public void setPizzasPedidas(Pizza[] pizzasPedidas) {
        this.pizzasPedidas = pizzasPedidas;
    }

    public Bebestible[] getBebestiblesPedidos() {
        return bebestiblesPedidos;
    }

    public void setBebestiblesPedidos(Bebestible[] bebestiblesPedidos) {
        this.bebestiblesPedidos = bebestiblesPedidos;
    }

    public int getMontoPedido() {
        return montoPedido;
    }

    public void setMontoPedido(int montoPedido) {
        this.montoPedido = montoPedido;
    }
    
    /**
     * Retorna el valor del pedido, éste es calculado sumando los precios de
     * los ingredientes y bebestibles al recorrer sus vectores correspondientes
     * <p>
     * @return int
     */
    public void ActualizarMontoTotal() {
        int total = 0;
        for (int i = 0; pizzasPedidas != null && i < pizzasPedidas.length; i++) {            
            total += pizzasPedidas[i].getPrecio();
        }
        montoPedido = total;
    }
    /**
     * Retorna un valor booleano, correspiente a el valor de verdad si la pizza
     * fue agregada o no.
     * <p>
     * @param nuevo Pizza.
     * @return booleano.
     */
    public boolean agregarPizza(Pizza nuevo) {
        for(int i = 0; i < pizzasPedidas.length ; i++) {
            if(pizzasPedidas[i] == null){
                pizzasPedidas[i] = nuevo;
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna un valor booleano, corresponde a el valor de verdad si el bebestible
     * fue agregado o no.
     * <p>
     * @param nuevo Bebestible
     * @return booleano
     */
    public boolean agregarBebestible(Bebestible nuevo){
        if(nuevo.getCantidad() > 0){
            for(int i = 0; i < bebestiblesPedidos.length; i++){
                if(bebestiblesPedidos[i] == null){
                    bebestiblesPedidos[i] = nuevo;
                    bebestiblesPedidos[i].setCantidad(bebestiblesPedidos[i].getCantidad() - 1);
                    return true;
                }
            }
        }
        return false;
    }
}
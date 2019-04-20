/*
 * Clase pedido, el cual contendrá las diferentes formas para que un cliente
 * pueda crear y ordenar su pedido.
 */
package clases;

public class Pedido {
    private String idPedido;                          //id del pedido
    private Cliente clienteReferenciado;        //cliente que ordenó el pedido
    private Pizza[] pizzasPedidas;            //Pizza que puede escoger el cliente
    private Bebestible[] bebestiblesPedidos;      //Producto que puede escoger el cliente
    
    //A continuación constructores de pedido
    
    //Cuando el cliente pide: Pizza
    public Pedido(String idPedido, Cliente clienteReferenciado, int cantPizzas){
        this.idPedido = idPedido;
        this.clienteReferenciado = clienteReferenciado;
        this.pizzasPedidas = new Pizza[cantPizzas];
    }
    
    //Cuando el cliente pide: Producto, Pizza
    public Pedido(String id, Cliente clienteReferenciado, int cantPizzas, int cantBebestibles){
        this.idPedido = idPedido;
        this.clienteReferenciado = clienteReferenciado;
        this.pizzasPedidas = new Pizza[cantPizzas];
        this.bebestiblesPedidos = new Bebestible[cantBebestibles];
    }
    
    //Getters y setters correspondientes

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
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
    
}
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
    private int montoPedido;
    
    //A continuación constructores de pedido
    
    //Cuando el cliente pide: Pizza
    public Pedido(String idPedido, Cliente clienteReferenciado, int cantPizzas, int montoPedido){
        this.idPedido = idPedido;
        this.clienteReferenciado = clienteReferenciado;
        this.pizzasPedidas = new Pizza[cantPizzas];
        this.montoPedido = montoTotal();
    }
    
    //Cuando el cliente pide: Bebestible, Pizza
    public Pedido(String idPedido, Cliente clienteReferenciado, int cantPizzas, int cantBebestibles, int montoPedido){
        this.idPedido = idPedido;
        this.clienteReferenciado = clienteReferenciado;
        this.pizzasPedidas = new Pizza[cantPizzas];
        this.bebestiblesPedidos = new Bebestible[cantBebestibles];
        this.montoPedido = montoTotal();
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

    public int getMontoPedido() {
        return montoPedido;
    }

    public void setMontoPedido(int montoPedido) {
        this.montoPedido = montoPedido;
    }    
    
    public final int montoTotal() {
        int total = 0;
        for (int i = 0; pizzasPedidas != null && i < pizzasPedidas.length; i++) {
            total += pizzasPedidas[i].getPrecio();
        }
        return total;
    }
    
}
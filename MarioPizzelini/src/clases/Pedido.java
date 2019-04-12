/*
 * Clase pedido, el cual contendrá las diferentes formas para que un cliente
 * pueda crear y ordenar su pedido.
 */
package clases;

public class Pedido {
    private String id;                          //id del pedido
    private Cliente clienteReferenciado;        //cliente que ordenó el pedido
    private Pizza pizzaReferenciada;            //Pizza que puede escoger el cliente
    private Promocion promoReferenciada;        //Promoción que puede escoger el cliente
    private Producto productoReferenciado;      //Producto que puede escoger el cliente
    
    //A continuación constructores de pedido
    
    //Cuando el cliente pide: Promo, Producto, Pizza
    public Pedido(String id, Cliente clienteReferenciado, Pizza pizzaReferenciada, Promocion promoReferenciada, Producto productoReferenciado){
        this.id = id;
        this.clienteReferenciado = clienteReferenciado;
        this.pizzaReferenciada = pizzaReferenciada;
        this.promoReferenciada = promoReferenciada;
        this.productoReferenciado = productoReferenciado;
    }
    
    //Cuando el cliente pide: Promo, Producto
    public Pedido(String id, Cliente clienteReferenciado, Promocion promoReferenciada, Producto productoReferenciado){
        this.id = id;
        this.clienteReferenciado = clienteReferenciado;
        this.promoReferenciada = promoReferenciada;
        this.productoReferenciado = productoReferenciado;
    }
    
    //Cuando el cliente pide: Promo
    public Pedido(String id, Cliente clienteReferenciado,Promocion promoReferenciada){
        this.id = id;
        this.clienteReferenciado = clienteReferenciado;
        this.promoReferenciada = promoReferenciada;
    }
    
    //Cuando el cliente pide: Pizza
    public Pedido(String id, Cliente clienteReferenciado, Pizza pizzaReferenciada){
        this.id = id;
        this.clienteReferenciado = clienteReferenciado;
        this.pizzaReferenciada = pizzaReferenciada;
    }
    
    //Cuando el cliente pide: Producto, Pizza
    public Pedido(String id, Cliente clienteReferenciado, Producto productoReferenciado, Pizza pizzaReferenciada){
        this.id = id;
        this.clienteReferenciado = clienteReferenciado;
        this.productoReferenciado = productoReferenciado;
        this.pizzaReferenciada = pizzaReferenciada;
    }
    
    //Cuando el cliente pide: Promo, Pizza
    public Pedido(String id, Cliente clienteReferenciado, Promocion promoReferenciada, Pizza pizzaReferenciada){
        this.id = id;
        this.clienteReferenciado = clienteReferenciado;
        this.promoReferenciada = promoReferenciada;
        this.pizzaReferenciada = pizzaReferenciada;
    }
    
    //Getters y setters correspondientes
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cliente getClienteReferenciado() {
        return clienteReferenciado;
    }

    public void setClienteReferenciado(Cliente clienteReferenciado) {
        this.clienteReferenciado = clienteReferenciado;
    }

    public Pizza getPizzaReferenciada() {
        return pizzaReferenciada;
    }

    public void setPizzaReferenciada(Pizza pizzaReferenciada) {
        this.pizzaReferenciada = pizzaReferenciada;
    }

    public Promocion getPromoReferenciada() {
        return promoReferenciada;
    }

    public void setPromoReferenciada(Promocion promoReferenciada) {
        this.promoReferenciada = promoReferenciada;
    }

    public Producto getProductoReferenciado() {
        return productoReferenciado;
    }

    public void setProductoReferenciado(Producto productoReferenciado) {
        this.productoReferenciado = productoReferenciado;
    }
}
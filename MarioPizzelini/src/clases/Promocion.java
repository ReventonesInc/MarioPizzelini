/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author XavierKrostya
 */
public class Promocion {
    private String nombrePromocion;
    private String descripcionPromo;
    private Pizza[] pizzas;
    private Producto[] productosExtra;
    
    public Promocion(String nombrePromocion, String nombrePromo, Pizza[] pizzas, Producto[] productos){
        this.nombrePromocion = nombrePromocion;
        this.descripcionPromo = nombrePromo;
        this.pizzas = pizzas;
        this.productosExtra = productos;
    }
    public Promocion(String nombrePromocion, String nombrePromo, Pizza[] pizzas){
        this.nombrePromocion = nombrePromocion;
        this.descripcionPromo = nombrePromo;
        this.pizzas = pizzas;
        this.productosExtra = null;
    }

    public String getNombrePromocion() {
        return nombrePromocion;
    }

    public void setNombrePromocion(String nombrePromocion) {
        this.nombrePromocion = nombrePromocion;
    }

    public String getDescripcionPromo() {
        return descripcionPromo;
    }

    public void setDescripcionPromo(String descripcionPromo) {
        this.descripcionPromo = descripcionPromo;
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }

    public void setPizzas(Pizza[] pizzas) {
        this.pizzas = pizzas;
    }

    public Producto[] getProductosExtra() {
        return productosExtra;
    }

    public void setProductosExtra(Producto[] productosExtra) {
        this.productosExtra = productosExtra;
    }
    
}

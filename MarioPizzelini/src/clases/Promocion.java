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
    public Producto[] getProductosExtra() {
        return productosExtra;
    }

    public void setProductosExtra(Producto[] productosExtra) {
        this.productosExtra = productosExtra;
    }
    
}

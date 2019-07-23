/*
 * Clase interfaz para verificar la existencia de un producto en el inventario.
 * contiene dos métodos para manipular un booleano.
 */
package clases;

/**
 *
 * @author XavierKrostya
 */
public interface Disponible {
     
    public void disponible(); //Si existe el producto, se cambia a true
    
    public void noDisponible(); //Si no existe el producto, se cambia a false;
}

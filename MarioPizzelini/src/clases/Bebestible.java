/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class Bebestible extends Producto {
    private String idBebestible;
    
    public Bebestible(String idBebestible, String nombre, int precio, String descripcion) {
        super(nombre, precio, descripcion);
        this.idBebestible = idBebestible;
    }

    public String getIdBebestible() {
        return idBebestible;
    }

    public void setIdBebestible(String idBebestible) {
        this.idBebestible = idBebestible;
    }

    @Override
    public int calcularValor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

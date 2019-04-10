package Clases;
import java.util.*;

public class Sucursal {
    private String id;
    private String direccion;
    private ListaEmpleados empleados;
    private ListaPedidos pedidos;
    private Bodega inventario;
    
    public Sucursal(String id, String direccion, Bodega inventario) {
        this.id = id;
        this.direccion = direccion;
        this.inventario = inventario;
        this.empleados = new ListaEmpleados();
        this.pedidos = new ListaPedidos();
    }
}

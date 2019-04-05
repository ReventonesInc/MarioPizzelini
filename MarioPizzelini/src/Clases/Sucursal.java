package Clases;
import java.util.*;

public class Sucursal {
    private String id;
    private String direccison;
    private ArrayList<Empleado> empleados;
    private Arraylist<Pedido> pedidos;
    private Bodega inventario;
    
    public Sucursal(String id, String direccion, Bodega inventario) {
        this.id = id;
        this.direccion = direccion;
        this.inventario = inventario;
        empleados = new ArrayList<Empleado>();
        pedidos = new ArrayList<Pedido>();
    }
    
    public buscarEmpleado(String rut) {
        for(int i = 0; empleados != null && i < empleados.size(); i++) {
        }
    }
    
    public buscarEmpleado(String nombre) {
        for(int i = 0; empleados != null && i < empleados.size(); i++) {
            
        }
    }
}

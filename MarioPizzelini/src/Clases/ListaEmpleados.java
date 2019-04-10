package Clases;
import java.util.*;

/* Clase que permite el manejo de la colección de empleado registrados en la
 * sucursal, posee las opciones básicas para agregar, eliminar, modificar y
 * mostrar un empleado del establecimiento.
 */

public class ListaEmpleados {
    private ArrayList<Empleado> empleados;  //ArrayList que se manejará
    
    /*Constructor*/
    public ListaEmpleados(){
        this.empleados = new ArrayList();
    }
    
    /*Getters y setter correspondientes*/
    public ArrayList<Empleado> getEmpleados(){
        return empleados;
    }
    
    public void setEmpleado(ArrayList<Empleado> empleados){
        this.empleados = empleados;
    }
    
    /*Métodos de la clase*/
    public Boolean agregarEmpleado(){
        if(empleados.isEmpty()){
            
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;
import clases.Bebestible;
import clases.Ingrediente;
import clases.Pedido;
import clases.Sucursal;
import clases.Pizza;
import clases.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListaSucursal {
    private ArrayList<Sucursal> sucursales;
    
    //Constructor
    public ListaSucursal() {
        sucursales = new ArrayList<>();
        ResultSet respuesta = Conexiones.Conexion.Consulta("SELECT * FROM Sucursal");
        try {
            while(respuesta.next()){
                sucursales.add(new Sucursal(respuesta.getInt(1),respuesta.getString(2),respuesta.getString(3)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ListaSucursal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*Getters y setters correspondientes*/
    public ArrayList<Sucursal> getSucursales() {
        return sucursales;
        
    }
    
        /*--- Métodos para Sucursal ---*/
    
    /**
     * Retorna true, si no hay sucursales en la lista de sucursales, sino,
     * retornara false.
     * <p>
     * @return booleano.
     */
    public boolean estaVacio(){
        return sucursales.isEmpty();
    }
    /**
     * Retorna la sucursal encontrada, luego de buscarlo en la lista dado
     * su rut
     * <p>
     * @param rut String.
     * @return booleano.
     */
    public Sucursal buscarSucursalRut(String rut){
        if(!sucursales.isEmpty()){
            for(int i = 0; sucursales != null && i < sucursales.size(); i++){
                if((sucursales.get(i)).getRut().equals(rut)){
                    return sucursales.get(i);
                }
            }
        }
        return null;
    }
    /**
     * Retorna true, si la sucursal ingresada por parámetro fue agregada a la
     * lista exitosamente, sino, retornará false.
     * <p>
     * @param nuevo Sucursal.
     * @return booleano.
     */
    public boolean agregarSucursal(Sucursal nuevo){
        if(sucursales.contains(nuevo)){
            return false;
        }

        return sucursales.add(nuevo);
    }
    /**
     * Retorna true y elimina la sucursal, si el rut ingresado por paramatro
     * coincide con una de las sucursales en la lista. Sino, retornará false.
     * <p>
     * @param rutEliminar String.
     * @return booleano.
     */
    public boolean eliminarSucursal(String rutEliminar){
        for(int i = 0; sucursales != null && i < sucursales.size(); i++){
            if((sucursales.get(i)).getRut().equals(rutEliminar)){
                return sucursales.remove(sucursales.get(i));
            }
        }
        return false;
    }
    /**
     * Muestra las sucursales contenidas en la lista.
     * <p>
     */
    public void mostrarSucursales(){
        if(!sucursales.isEmpty()){
            System.out.println("-----------------------------------------------");
            for(int i = 0; sucursales != null && i < sucursales.size(); i++){
                System.out.println("RUT: "+sucursales.get(i).getRut()+" Dirección: "+sucursales.get(i).getDireccion()+".");
            }
        }
    }
    /**
     * Retorna la sucursal que tiene la mayor cantidad de ingresos, estos son
     * calculados mediante el recorrido de las sucursales y sumar los valores
     * de todos los pedidos.
     * @return Sucursal.
     */
    public Sucursal buscarSucursalMasIngresos(){
        Sucursal buscada = null;
        
        if(sucursales == null){
            return null;
        }
        buscada = sucursales.get(0);
        for(Sucursal actual : sucursales){
            if(buscada.valorTotalPedidosSucursal() < actual.valorTotalPedidosSucursal()){
                buscada = actual;
            }
        }        
        return buscada;
    }
    
    
        /*--- Métodos para Ingrediente ---*/
    
    /**
     * Retorna true, si no hay ingredientes en la sucursal que coindica con el 
     * rut entregado por parámetro, sino, retornara false.
     * <p>
     * @param rut String.
     * @return booleano.
     */
    public boolean estaVacioIngredientes(String rut){
        if(!sucursales.isEmpty()){
            for(int i = 0; sucursales != null && i < sucursales.size(); i++){
                if((sucursales.get(i)).getRut().equals(rut)){
                    return sucursales.get(i).estaVacioIngredientes();
                }
            }
        }
        return true; //aqui habia un false
    }
    /**
     * Busca la coincidencia entre id's de ingredientes en una sucursal que
     * coincida con el rut entregado por parametro. Retorna el ingrediente si
     * es encontrado, sino, retorna null.
     * <p>
     * @param rut String.
     * @param idIngrediente String.
     * @return booleano.
     */
    public Ingrediente buscarIngredienteID(String rut, String idIngrediente){
        if(!sucursales.isEmpty()){
            for(int i = 0; sucursales != null && i < sucursales.size(); i++){
                if((sucursales.get(i)).getRut().equals(rut)){
                    return sucursales.get(i).buscarIngredienteID(idIngrediente);
                }
            }
        }
        return null;
    }
    /**
     * Retorna true, si el ingrediente ingresado por parámetro es agregado
     * a la sucursal que coincide con el rut entregado por parámetro
     * exitosamente, sino, retornará false.
     * <p>
     * @param rut String.
     * @param nuevo Ingrediente.
     * @return booleano.
     */
    public boolean agregarIngrediente(String rut, Ingrediente nuevo){
        if(!sucursales.isEmpty()){
            for(Sucursal actual : sucursales) {
                if(actual.getRut().equals(rut)) {
                    return actual.agregarIngrediente(nuevo);
                }
            }
        }
        return false;
    }
    /**
     * Retorna true y elimina el ingrediente, si el id ingresado por paramatro
     * coincide con uno de los ingredientes de una sucursal que tiene como
     * rut, el entregado por parámetro, sino, retornará false.
     * <p>
     * @param rut String.
     * @param id String.
     * @return booleano.
     */
    public boolean eliminarIngrediente(String rut, String id){
        if(!sucursales.isEmpty()){
            for(int i = 0; sucursales != null && i < sucursales.size(); i++){
                if((sucursales.get(i)).getRut().equals(rut)){
                    return sucursales.get(i).eliminarIngrediente(id);
                }
            }
        }
        return false;
    }
    /**
     * Permite modificar un ingrediente por uno nuevo entregado por parametro
     * en una sucursal que coincida con el rut entregado por parámetro.
     * <p>
     * @param rut String.
     * @param idIngredienteModificar String.
     * @param modificado Ingrediente.
     * @return booleano.
     */
    public boolean modificarIngrediente(String rut, String idIngredienteModificar, Ingrediente modificado){
        if(!sucursales.isEmpty()){
            for(int i = 0; sucursales != null && i < sucursales.size(); i++){
                if((sucursales.get(i)).getRut().equals(rut)){
                    sucursales.get(i).modificarIngrediente(idIngredienteModificar, modificado);
                    return true;
                }
            }
        }
        return false;
    }
    /**
     * Muestra los ingredientes contenidos en la sucursal que coincida con el
     * rut entregado por parámetro.
     * <p>
     * @param rutSucursal String.
     */
    public void mostrarIngredientes(String rutSucursal){
        for(Sucursal actual : sucursales){
            if(actual.getRut().equals(rutSucursal)){
                actual.mostrarIngredientes();
            }
        }
    }
    
        /*--- Métodos para Bebestible ---*/
    
    /**
     * Retorna true, si no hay bebestibles en la sucursal que coindica con el 
     * rut entregado por parámetro, sino, retornara false.
     * <p>
     * @param rut String.
     * @return booleano.
     */
    public boolean estaVacioBebestibles(String rut){
        if(!sucursales.isEmpty()){
            for(int i = 0; sucursales != null && i < sucursales.size(); i++){
                if((sucursales.get(i)).getRut().equals(rut)){
                    return sucursales.get(i).estaVacioBebestibles();
                }
            }
        }
        return true;
    }
    /**
     * Busca la coincidencia entre id's de bebestibles en una sucursal que
     * coincida con el rut entregado por parametro. Retorna el bebestible si
     * es encontrado, sino, retorna null.
     * <p>
     * @param rut String.
     * @param idBebestible String.
     * @return booleano.
     */
    public Bebestible buscarBebestibleID(String rut, String idBebestible){
        if(!sucursales.isEmpty()){
            for(int i = 0; sucursales != null && i < sucursales.size(); i++){
                if((sucursales.get(i)).getRut().equals(rut)){
                    return sucursales.get(i).buscarBebestibleID(idBebestible);
                }
            }
        }
        return null;
    }
    /**
     * Retorna true, si el bebestible ingresado por parámetro es agregado
     * a la sucursal que coincide con el rut entregado por parámetro
     * exitosamente, sino, retornará false.
     * <p>
     * @param rutSucursal String.
     * @param nuevo Bebestible.
     * @return booleano.
     */
    public boolean agregarBebestible(String rutSucursal, Bebestible nuevo){
        if(!sucursales.isEmpty()){
            for(int i = 0; sucursales != null && i < sucursales.size(); i++){
                if((sucursales.get(i)).getRut().equals(rutSucursal)){
                    return sucursales.get(i).agregarBebestible(nuevo);
                }
            }
        }
        return false;
    }   
    /**
     * Retorna true y elimina el bebestible, si el id ingresado por paramatro
     * coincide con uno de los bebestibles de una sucursal que tiene como
     * rut el entregado por parámetro, sino, retornará false.
     * <p>
     * @param rutSucursal String.
     * @param idBebestible String.
     * @return booleano.
     */
    public boolean eliminarBebestible(String rutSucursal, String idBebestible){
        if(!sucursales.isEmpty()){
            for(int i = 0; sucursales != null && i < sucursales.size(); i++){
                if((sucursales.get(i)).getRut().equals(rutSucursal)){
                    return sucursales.get(i).eliminarBebestible(idBebestible);
                }
            }
        }
        return false;
    }    
    /**
     * Permite modificar un bebestible por uno nuevo entregado por parametro
     * en una sucursal que coincida con el rut entregado por parámetro.
     * <p>
     * @param rutSucursal String.
     * @param idBebestibleModificar String.
     * @param modificado Ingrediente.
     * @return booleano.
     */
    public boolean modificarBebestible(String rutSucursal, String idBebestibleModificar, Bebestible modificado){
        if(!sucursales.isEmpty()){
            for(int i = 0; sucursales != null && i < sucursales.size(); i++){
                if((sucursales.get(i)).getRut().equals(rutSucursal)){
                    sucursales.get(i).modificarBebestible(idBebestibleModificar, modificado);
                    return true;
                }
            }
        }
        return false;
    }
    /**
     * Muestra los bebestibles contenidos en la sucursal que coincida con el
     * rut entregado por parámetro.
     * <p>
     * @param rutSucursal String.
     */
    public void mostrarBebestibles(String rutSucursal){
        for(Sucursal actual : sucursales){
            if(actual.getRut().equals(rutSucursal)){
                actual.mostrarBebestibles();
            }
        }
    }
    
        /*--- Métodos para Pedido ---*/
    
    /*
    public boolean agregarPedido(Sucursal sucursalN, Pedido nuevo){
        if(sucursales.contains(sucursalN)){
            return sucursalN.agregarPedido(nuevo);
        }
        return false;
    }
    */
    
    /**
     * Retorna true, si el pedido ingresado por parámetro es agregado
     * a la sucursal que coincide con el rut entregado por parámetro
     * exitosamente, sino, retornará false.
     * <p>
     * @param rut String.
     * @param nuevo Bebestible.
     * @return booleano.
     */
    public boolean agregarPedido(String rut, Pedido nuevo){
        if(!sucursales.isEmpty()){
            Sucursal sucursalPedido = buscarSucursalRut(rut);
            if(sucursalPedido != null){
                return sucursalPedido.agregarPedido(nuevo);
            }
            return false;
        }
        return false;
    }
    /**
     * Retorna true y elimina el pedido, si el id ingresado por paramatro
     * coincide con uno de los pedidos de una sucursal que tiene como
     * rut el entregado por parámetro, sino, retornará false.
     * <p>
     * @param rut String.
     * @param idPedido String.
     * @return booleano.
     */
    public boolean eliminarPedido(String rut, int keyPedido){
        if(!sucursales.isEmpty()){
            Sucursal sucursalPedido = buscarSucursalRut(rut);
            if(sucursalPedido != null){
                return sucursalPedido.eliminarPedido(keyPedido);
            }
            return false;
        }
        return false;
    }
    /**
     * Retorna la cantidad de pdidos de un cliente entregado por parámetro
     * @param cliente Cliente.
     * @return int.
     */
    public int cantidadPedidosCliente(Cliente cliente){
        int contador = 0;        
        for(Sucursal actual :  sucursales){
            contador += actual.cantidadPedidosCliente(cliente);
        }
        
        return contador;
    }
    /**
     * Retorna el valor total al sumar todos los pedidos de una sucursal.
     * @return int.
     */
    public int valorTotalPedidos(){
        int contador = 0;
        
        for(Sucursal actual :  sucursales){
            contador += actual.valorTotalPedidosSucursal();
        }
        
        return contador;
    }
    /**
     * Eliminar todos los pedidos que tengan como referencia un cliente
     * entregado por parámetro.
     * @param rutCliente String. 
     */
    public void eliminarTodosPedidosCliente(String rutCliente){
        for(Sucursal actual : sucursales){
            actual.eliminarTodosLosPedidosCliente(rutCliente);
        }
    }
    
    public boolean agregarPizza(String rutSucursal, int keyPedido, Pizza nuevo){
        for(Sucursal actual : sucursales){
            if(actual.getRut().equals(rutSucursal)){
                return actual.agregarPizza(keyPedido, nuevo);
            }
        }
        return false;
    }
    
    public void mostrarPedidoPorID(String rutSucursal, int keyPedido){
        for(Sucursal actual : sucursales){
            if(actual.getRut().equals(rutSucursal)){
                actual.mostrarPedidoPorID(keyPedido);
            }
        }
    }
    
    public void actualizarMontoTotalDeUnPedido(String rutSucursal, int keyPedido){
        for(Sucursal actual : sucursales){
            if(actual.getRut().equals(rutSucursal)){
                actual.actualizarMontoTotalDeUnPedido(keyPedido);
            }
        }
    }
    
    public int montoRecaudadoSucursal (String rutSucursal){
        for(Sucursal actual : sucursales){
            if(actual.getRut().equals(rutSucursal)){
                return actual.valorTotalPedidosSucursal();
            }
        }
        return -1;
    }
    
    public int tamano(){
        return sucursales.size();
    }
}
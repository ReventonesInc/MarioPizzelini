/*
 * Esta clase contiene una lista de ingredientes, en el cual se manejarán
 * sus métodos correspondientes.
 */
package listas;
import clases.Ingrediente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListaIngrediente {
    private ArrayList<Ingrediente> ingredientes;  //Lista de ingredientes
    
    //Constructor
    public ListaIngrediente(int idSucursal) {
        ingredientes = new ArrayList<>();
        ResultSet respuesta = Conexiones.Conexion.Consulta("SELECT * FROM Ingrediente INNER JOIN IngredienteAlmacenado"+
                " ON Ingrediente.idIngrediente = IngredienteAlmacenado.idIngrediente AND IngredienteAlmacenado.idSucursal = "+idSucursal);
        try {
            while(respuesta.next()){
                ingredientes.add(new Ingrediente(respuesta.getInt(1),respuesta.getString(2),respuesta.getInt(3),respuesta.getBoolean(6)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ListaIngrediente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*Getters y setters correspondientes*/
    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }
    
    /*--- Métodos básicos para ingredientes ---*/
    
    public boolean estaVacio(){
        return ingredientes.isEmpty();
    }
    
    /**
     * Retorna true, si el ingrediente ingresado por parámetro es agregado a
     * la lista exitosamente, en cambio, retornará false si no se agrega.
     * <p>
     * @param nuevo Ingrediente.
     * @return booleano.
     */
    public boolean agregarIngrediente(Ingrediente nuevo){
        try{
            if(ingredientes.contains(nuevo)){
                return false;
            }
            return ingredientes.add(nuevo);
        }
        catch(NullPointerException e){
            System.out.println("Ocurrió un error: "+e.getMessage());
            return false;
        }
    }
    
    /**
     * Retorna true, si el ingrediente ingresado por parámetro es eliminado de
     * la lista exitosamente, en cambio, retornará false si no se elimina.
     * <p>
     * @param idIngrediente String.
     * @return booleano.
     */
    public boolean eliminarIngrediente(String idIngrediente){
        try{
            for(Ingrediente actual : ingredientes) {
                if(actual.getIdIngrediente().equals(idIngrediente)) {
                    return ingredientes.remove(actual);
                }
            }
            return false;
        }
        catch(NullPointerException e){
            System.out.println("Ocurrió un error: "+e.getMessage());
            return false;
        }
    }
    
    /**
     * Retorna un objeto Ingrediente si encuentra una coincidencia entre el
     * id entregado por parametro y el id de un ingrediente, en caso de no
     * encontrar coincidencias retorna null.
     * <p>
     * @param idIngrediente String.
     * @return booleano.
     */
    public Ingrediente buscarIngredienteID(String idIngrediente){
        for(Ingrediente actual : ingredientes){
            if(actual.getIdIngrediente().equals(idIngrediente)){
                return actual;
            }
        }
        return null;
    }

    /**
     * Permite modificar un ingrediente por uno nuevo entregado por parametro
     * <p>
     * @param idIngrediente String.
     * @param modificado Ingediente.
     */
    public void modificarIngrediente(String idIngrediente, Ingrediente modificado){
        for(Ingrediente actual : ingredientes){
            if(actual.getIdIngrediente().equals(idIngrediente)){
                actual.setIdIngrediente(modificado.getIdIngrediente());
                actual.setNombre(modificado.getNombre());
                actual.setPrecio(modificado.getPrecio());
                actual.setCantidad(modificado.getCantidad());
                actual.setDisponibilidad(modificado.getDisponibilidad());
            }
        }
    }
    
    /**
     * Imprime por pantalla el ID y nombre de todos los ingredientes
     * contenidos en el ArrayList
     * <p>
     */
    public void mostrarIngredientes(){
        if(!ingredientes.isEmpty()){
            System.out.println("-----------------------------------------------");
            for(Ingrediente actual : ingredientes){
                System.out.println("ID: "+actual.getIdIngrediente()+" Nombre: "+actual.getNombre()+".");
            }
        }
    }
    
    public String buscarIngredienteNombre(String nombre){
        for(Ingrediente actual : ingredientes){
            if(actual.getNombre().equals(nombre)){
                return actual.getIdIngrediente();
            }
        }
        return null;
    }
}

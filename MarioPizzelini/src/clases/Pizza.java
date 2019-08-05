/*
 * Esta clase contiene un vector con los ingredientes que posee la pizza.
 * Además esta clase es herencia de la clase producto.
 */
package clases;

public class Pizza extends Producto{
    private Ingrediente[] ingredientes;
    
    //Constructor(es)
    public Pizza(int cantIngredientes, String nombre, int precio, String descripcion){
        super(nombre, precio, descripcion);
        this.ingredientes = new Ingrediente[cantIngredientes];
        super.setPrecio(0);
    }

    public Pizza() {
        super(null,0,null);  
        this.ingredientes = null;
        super.setPrecio(0);
    }
    //Getters y setters correspondientes
    public Ingrediente[] getIngredientes(){
        return ingredientes;
    }
    
    /**
     * Retorna true, si el ingrediente ingresado por parámetro es agregado
     * al vector exitosamente, sino, retornará false.
     * <p>
     * @param nuevo Ingrediente.
     * @return booleano.
     */
    public boolean agregarIngrediente(Ingrediente nuevo) {
        if(nuevo.getCantidad() >= 0){
            int cantIngredientes = ingredientes.length;
            for(int i = 0; i < cantIngredientes; i++) {
                if(ingredientes[i] == null){
                    ingredientes[i] = nuevo;
                    ingredientes[i].setCantidad(ingredientes[i].getCantidad() - 1);
                    return true;
                } 
            }
        }
        return false;
    }
    /**
     * Retorna el valor de la pizza, éste es calculado mediante el recorrido
     * del vector de ingredientes y sumando el precio de cada uno de éstos.
     * <p>
     * @return int
     */
    @Override
    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Rut: "+getPrecio());
        System.out.println("Descripción: "+getDescripcion());
    }
    
    public void calcularValor() {
        int valor = 0;
        for(int i = 0; ingredientes != null && i < ingredientes.length; i++) {
            valor += ingredientes[i].getPrecio();
        }        
        super.setPrecio(valor);
    }
}

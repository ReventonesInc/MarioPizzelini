package Clases;
import java.util.*;

public class Bodega {
    private String id;
    private ListaIngredientes listaIngredientes;
    private ListaRefrescos listaRefrescos;

    public Bodega(String id) {
        this.id = id;
        this.listaIngredientes = new ListaIngredientes();
        this.listaRefrescos = new ListaRefrescos();
    }
    
    
}

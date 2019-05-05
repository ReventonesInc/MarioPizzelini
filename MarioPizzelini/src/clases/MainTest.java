/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.util.*;

/**
 *
 * @author XavierKrostya
 */
public class MainTest {

    public static void main(String args[]){
        MarioPizzelini MP = new MarioPizzelini();
        MP.agregarCliente(new Cliente("20.181.368-9","Javier", "Ortiz", "88136613"));
        MP.agregarCliente(new Cliente("12.345.678-9","C bastian", "Mamut", "12345678"));
        MP.agregarSucursal(new Sucursal("72.222.222-9", "Riquelme 444"));
        MP.agregarBebestible("72.222.222-9", new Bebestible("1", "CocaCola", 1000, "Bebida gaseosa cocacola"));
        MP.agregarBebestible("72.222.222-9", new Bebestible("2", "Pepsi", 1000, "Bebida gaseosa pepsi"));
        MP.agregarIngrediente("72.222.222-9", new Ingrediente("1", "Queso", 500));
        MP.agregarIngrediente("72.222.222-9", new Ingrediente("2", "Jamón", 700));
        MP.agregarIngrediente("72.222.222-9", new Ingrediente("3", "Pepinillos", 900));
        
        //int cantidadPizza;
        //int cantidadBebestible;
        
        //Scanner teclado = new Scanner(System.in);
        //cantidadPizza = teclado.nextInt();
        //cantidadBebestible = teclado.nextInt();
        
        Pizza auxPizzas[] = new Pizza[3];
        //Bebestible auxBebestible[] = new Bebestible[cantidadBebestible];
        
        //System.out.println("Cuantos ingredientes desea?");
        //cantidadIngrediente = teclado.nextInt();
        auxPizzas[0] = new Pizza(3, "pizzaluis", 0, "Esto es una pizza");
        auxPizzas[1] = new Pizza(1, "pizzajavier", 0, "Esto es una pizza");
        auxPizzas[2] = new Pizza(2, "pizzafranco", 0, "Esto es una pizza");
        
        auxPizzas[0].agregarIngrediente(MP.buscarIngredienteID("72.222.222-9", "1"));
        auxPizzas[0].agregarIngrediente(MP.buscarIngredienteID("72.222.222-9", "2"));
        auxPizzas[0].agregarIngrediente(MP.buscarIngredienteID("72.222.222-9", "3"));
        auxPizzas[0].calcularValor();
        
        auxPizzas[1].agregarIngrediente(MP.buscarIngredienteID("72.222.222-9", "1"));
        auxPizzas[1].calcularValor();
        
        auxPizzas[2].agregarIngrediente(MP.buscarIngredienteID("72.222.222-9", "1"));
        auxPizzas[2].agregarIngrediente(MP.buscarIngredienteID("72.222.222-9", "2"));
        auxPizzas[2].calcularValor();
        
        MP.agregarPedido("72.222.222-9", new Pedido("1",new Cliente("20.181.368-9","Javier", "Ortiz", "88136613"),3));
        MP.agregarPizza("72.222.222-9", "1", auxPizzas[0]);
        MP.agregarPizza("72.222.222-9", "1", auxPizzas[1]);
        MP.agregarPizza("72.222.222-9", "1", auxPizzas[2]);
        MP.actualizarMontoTotalDeUnPedido("72.222.222-9", "1");
        
        MP.mostrarPedidoPorID("72.222.222-9", "1");
    }
}

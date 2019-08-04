package clases;
import java.util.*;
import javax.swing.JOptionPane;

public class MainTest {

    public static void main(String args[]){
        MarioPizzelini MP = new MarioPizzelini();
        //Scanner teclado = new Scanner(System.in);
        //int cantidadPizza = teclado.nextInt();
        
        Sucursal sucursalUno = new Sucursal(1,"20.181.368-9", "Riquelme 444");
        MP.agregarSucursal(sucursalUno);
        
        Cliente clienteUno = new Cliente(3,"19.154.617-2","Luis","Maturana","123456789");
        MP.agregarCliente(clienteUno);
        
        Ingrediente ingredienteUno = new Ingrediente(1,"Salsa",500,10);
        Ingrediente ingredienteDos = new Ingrediente(2, "Queso", 500, 10);
        Ingrediente ingredienteTres = new Ingrediente(3, "Jamón", 700, 10);
        Ingrediente ingredienteCuatro = new Ingrediente(4, "Pepinillos", 900);
        
        MP.agregarIngrediente(sucursalUno.getRut(), ingredienteUno);
        MP.agregarIngrediente(sucursalUno.getRut(), ingredienteDos);
        MP.agregarIngrediente(sucursalUno.getRut(), ingredienteTres);
        MP.agregarIngrediente(sucursalUno.getRut(), ingredienteCuatro);
        
        Bebestible bebestibleUno = new Bebestible( 1, "CocaCola", 1000, "Bebida gaseosa cocacola");
        Bebestible bebestibleDos = new Bebestible(2, "Pepsi", 1000, "Bebida gaseosa pepsi", 5);
        MP.agregarBebestible(sucursalUno.getRut(), bebestibleUno);
        MP.agregarBebestible(sucursalUno.getRut(), bebestibleDos);
        
        int cantidadPizzas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de pizzas a pedir:"));
        System.out.println("La cantidad de pizza es: "+cantidadPizzas);        
        Pizza auxPizzas[] = new Pizza[cantidadPizzas];
        
        /*for(int i = 0; i<cantidadPizzas; i++) {
            auxPizzas[i] = new Pizza(2,null,0,null);   
            //auxPizzas[i] = new Pizza();                        
        };*/
        
        MP.mostrarIngredientes(sucursalUno.getRut());
        
        //System.out.println("NOMBRE: "+sucursalUno.getBodega().getIngredientes().getIngredientes().get(0).getNombre());
        
        String[] nombresIngredientes = new String[4];
        for(int i = 0; i < 4; i++) {
            nombresIngredientes[i] = sucursalUno.getBodega().getIngredientes().getIngredientes().get(i).getIdIngrediente();
        }
        
        for(int i = 0; i < cantidadPizzas; i++) {
            int cantidadIngredientes = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos ingredientes desea en su pizza numero "+ (i+1) +" ?"));
            System.out.println("Usted eligio "+cantidadIngredientes+" Ingredientes, por favor seleccionelos");
            auxPizzas[i] = new Pizza(cantidadIngredientes, null, 0, null);
            
            for(int j = 0; j<cantidadIngredientes; j++) {
                Object opcion = JOptionPane.showInputDialog(null,"Selecciona un ingrediente", "Elegir",JOptionPane.QUESTION_MESSAGE,null,nombresIngredientes,nombresIngredientes[0]);                
                String ide = opcion.toString();
                //System.out.println(ide);
                Ingrediente buscar = MP.buscarIngredienteID(sucursalUno.getRut(), ide);
                System.out.println(auxPizzas[i].agregarIngrediente(buscar));
            }
            auxPizzas[i].calcularValor();
            //System.out.println(auxPizzas[i].getPrecio());
        }
        
        //int cantidadBebestibles = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de bebestibles a pedir:"));
        //System.out.println("La cantidad de bebestibles es: "+cantidadBebestibles); 
        //Bebestible auxBebestibles[] = new Bebestible[cantidadBebestibles];
        
        MP.agregarPedido(sucursalUno.getRut(), new Pedido(1, clienteUno,cantidadPizzas)); // key es 1
        for(int i = 0; i < cantidadPizzas; i++){
            MP.agregarPizza(sucursalUno.getRut(), 0, auxPizzas[i]);
        }
        MP.actualizarMontoTotalDeUnPedido(sucursalUno.getRut(), 0);
        MP.mostrarPedidoPorID(sucursalUno.getRut(), 0);
        
        
        
        MP.testMostrarClientes();
    }
}
        
        /*MP.agregarCliente(new Cliente("20.181.368-9","Javier", "Ortiz", "88136613"));
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
        */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import clases.Cliente;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author XavierKrostya
 */
public class MainTestMap {
    public static void main(String arg[]){
        HashMap<Integer,Cliente> diccionario = new HashMap<>();
        Cliente clienten1 = new Cliente(1,"20.181.368-9","Javier","Ortiz","988136613");
        Cliente clienten2 = new Cliente(2,"12.223.499-1","Paula","Andrea","987437389");
        Cliente clienten3 = new Cliente(3,"12.345.678-9","Pepito","Rodiguez","912345678");
        
        diccionario.put(1,clienten1);
        diccionario.put(2, clienten2);
        diccionario.put(3, clienten3);
        
        int totalKey = diccionario.size();
        
        String indice = String.valueOf(totalKey);
        System.out.println("El total de keys : "+indice);

        
        String valor = diccionario.get(2).getRut();
        System.out.println("El rut es: "+valor);
    }
}

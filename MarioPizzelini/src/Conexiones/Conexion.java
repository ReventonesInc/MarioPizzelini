package Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author ceap2
 */
public class Conexion {
    static Connection contacto = null;
    public static String usuario;
    public static String password;
    public static Boolean status = Boolean.FALSE;
    
    
    public static Connection getConexion(){
        status = Boolean.FALSE;
        String urlDatabase = "https://remotemysql.com";
        
        try{
            Class.forName(urlDatabase);
        }catch(ClassNotFoundException e){
            System.out.println("Ocurrió un error brigido, te echaste el programa."+e.getMessage());
        }
        
        try{
            contacto = DriverManager.getConnection(urlDatabase,"id6lWQPWdK","G5fyEm9ord");
            //contacto = DriverManager.getConnection(urlDatabase,Conexion.usuario,Conexion.password);
            
            status = Boolean.TRUE;
        }catch(SQLException e){
            System.out.println("Ocurrió un error en el login de la base de datos "+e.getMessage());
        }
        
        return contacto;
    }
    
    
    public static void setCuenta(String usuario, String password){
        Conexion.usuario = usuario;
        Conexion.password = password;
    }
    
    public static Boolean getStatus(){
        return Conexion.status;
    }
    
    public static ResultSet Consulta(String consulta){
        Connection con = getConexion();
        Statement declara;
        try{
            declara = con.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta;
        }catch(SQLException e){
            System.out.println("Ocurrió un error al realizar la consulta "+e.getMessage());
        }
        return null;
    }
}

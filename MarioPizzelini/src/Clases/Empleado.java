package Clases;
import java.util.*;

public class Empleado extends Persona{
    private String password;

    public Empleado(String rut, String nombre, String apellido, String correoElectronico, String password) {
        super(rut, nombre, apellido, correoElectronico);
        this.password = password;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
}


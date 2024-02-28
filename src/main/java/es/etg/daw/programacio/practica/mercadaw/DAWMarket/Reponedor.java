package es.etg.daw.programacio.practica.mercadaw.dawmarket;

public class Reponedor extends Empleado{
    public static final double SUELDO = 1200;  
    
    public Reponedor(String nombre, String apellidos, String seccion) {
        super(nombre, apellidos, seccion, SUELDO);
    }
}

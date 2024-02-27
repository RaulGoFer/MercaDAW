package es.etg.daw.programacio.practica.mercadaw;

public class Reponedor extends Empleado{
    public static final double SUELDO = 1200;  
    
    public Reponedor(int identificador, String nombre, String apellidos, String seccion) {
        super(identificador, nombre, apellidos, seccion, SUELDO);
    }
}

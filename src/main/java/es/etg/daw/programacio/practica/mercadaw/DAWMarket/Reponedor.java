package es.etg.daw.programacio.practica.mercadaw.DAWMarket;

public class Reponedor extends Empleado{
    public static final double SUELDO = 1200;  
    
    public Reponedor(String nombre, String apellidos, String seccion) {
        super(nombre, apellidos, seccion, SUELDO);
    }
}

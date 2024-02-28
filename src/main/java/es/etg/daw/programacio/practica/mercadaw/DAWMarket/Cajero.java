package es.etg.daw.programacio.practica.mercadaw.dawmarket;

public class Cajero extends Empleado{

    public static final double SUELDO = 1300;    

    public Cajero(String nombre, String apellidos, String seccion) {
        super(nombre, apellidos, seccion, SUELDO);
    }
}

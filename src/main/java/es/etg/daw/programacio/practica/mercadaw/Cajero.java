package es.etg.daw.programacio.practica.mercadaw;

public class Cajero extends Empleado{

    public static final double SUELDO = 1300;    

    public Cajero(String nombre, String apellidos, String seccion) {
        super(nombre, apellidos, seccion, SUELDO);
    }
}

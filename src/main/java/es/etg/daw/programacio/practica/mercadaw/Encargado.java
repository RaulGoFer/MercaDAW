package es.etg.daw.programacio.practica.mercadaw;

public class Encargado extends Empleado{
    public static final double SUELDO = 1500;

    public Encargado(int identificador, String nombre, String apellidos, String seccion) {
        super(identificador, nombre, apellidos, seccion, SUELDO);

    }

    
}

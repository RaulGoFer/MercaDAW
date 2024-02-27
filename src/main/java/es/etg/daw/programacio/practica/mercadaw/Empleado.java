package es.etg.daw.programacio.practica.mercadaw;

import es.etg.daw.programacio.practica.mercadaw.Utilidades.IGestionable;

public class Empleado{
    public static final double SUELDO = 1000;

    private int identificador;
    private String nombre;
    private String apellidos;
    private String seccion;

    public Empleado(int identificador, String nombre, String apellidos, String seccion, double sueldo) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.seccion = seccion;
        sueldo = SUELDO;
    }

    public static double getSueldo() {
        return SUELDO;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

}

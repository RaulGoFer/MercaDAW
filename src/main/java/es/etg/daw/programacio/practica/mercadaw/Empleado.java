package es.etg.daw.programacio.practica.mercadaw;


public class Empleado{
    public static final double SUELDO = 1000;

    private static int idIncremental = 1;
    private int identificador;
    private String nombre;
    private String apellidos;
    private String seccion;

    public Empleado(String nombre, String apellidos, String seccion, double sueldo) {
        this.identificador = idIncremental ++;
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


    @Override
    public String toString() {
        final String UTILIDAD_T = "\t";
        final String UTILIDAD_N = "\n";
        return this.identificador + UTILIDAD_T + this.nombre + UTILIDAD_T + this.apellidos + UTILIDAD_T + this.seccion + UTILIDAD_N;
    }

}

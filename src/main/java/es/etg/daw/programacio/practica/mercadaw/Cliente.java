package es.etg.daw.programacio.practica.mercadaw;

public class Cliente {
    private int códigoPostal;
    private String correoElectrónico;
    private String nombre;

    public Cliente(int códigoPostal, String correoElectrónico, String nombre) {
        this.códigoPostal = códigoPostal;
        this.correoElectrónico = correoElectrónico;
        this.nombre = nombre;
    }

    public int getCódigoPostal() {
        return códigoPostal;
    }

    public void setCódigoPostal(int códigoPostal) {
        this.códigoPostal = códigoPostal;
    }

    public String getCorreoElectrónico() {
        return correoElectrónico;
    }

    public void setCorreoElectrónico(String correoElectrónico) {
        this.correoElectrónico = correoElectrónico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

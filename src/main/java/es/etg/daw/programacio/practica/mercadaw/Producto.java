package es.etg.daw.programacio.practica.mercadaw;

import es.etg.daw.programacio.practica.mercadaw.Utilidades.IGestionable;
import es.etg.daw.programacio.practica.mercadaw.Utilidades.IImprimible;

public abstract class Producto implements IGestionable, IImprimible {
    private String nombre;
    private String marca;
    private double precio;
    private double altura;
    private double anchura;
    private double peso;
    private double iva;
    private int componentes;
    private String descripcion;

    public Producto(String nombre, String marca, double precio, double altura, double anchura, double peso, int componentes, String descripcion, double iva) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.altura = altura;
        this.anchura = anchura;
        this.peso = peso;
        this.componentes = componentes;
        this.descripcion = descripcion;
        this.iva = iva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public int getComponentes() {
        return componentes;
    }

    public void setComponentes(int componentes) {
        this.componentes = componentes;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}

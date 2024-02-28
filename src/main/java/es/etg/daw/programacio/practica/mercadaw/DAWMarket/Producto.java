package es.etg.daw.programacio.practica.mercadaw.dawmarket;

public abstract class Producto{
    private String nombre;
    private String marca;
    private double precio;
    private double altura;
    private double anchura;
    private double peso;
    private int componentes;
    private String descripcion;

    public Producto(String nombre, String marca, double precio, double altura, double anchura, double peso, int componentes, String descripcion) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.altura = altura;
        this.anchura = anchura;
        this.peso = peso;
        this.componentes = componentes;
        this.descripcion = descripcion;
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

    public abstract String getCategoria();
    public abstract double getIVA();

    @Override
    public String toString() {
        
        final String MSG_NOMBRE ="Nombre: ";
        final String MSG_MARCA = "Marca: ";
        final String MSG_CATEGORIA= "Categoría: ";        
        final String MSG_PRECIO = "Precio en Euros: ";
        final String MSG_IVA = "IVA: ";
        final String MSG_PESO = "Peso en kg: ";
        final String MSG_ALTURA = "Altura en metros: ";
        final String MSG_ANCHURA = "Anchura en metros: ";
        final String MSG_COMPONENTES = "Número de elementos: ";
        final String MSG_DESCRIPCION = "Descripición: ";
        final String UTILIDAD_N = "\n";

        return UTILIDAD_N + MSG_NOMBRE + getNombre() + UTILIDAD_N + MSG_MARCA + getMarca() + UTILIDAD_N + MSG_CATEGORIA + getCategoria() + UTILIDAD_N + MSG_PRECIO + getPrecio() + UTILIDAD_N + MSG_IVA + getIVA() + UTILIDAD_N + MSG_PESO + getPeso() + UTILIDAD_N + MSG_ALTURA + getAltura() + UTILIDAD_N + MSG_ANCHURA + getAnchura() + UTILIDAD_N + MSG_COMPONENTES + getComponentes() + UTILIDAD_N + MSG_DESCRIPCION + getDescripcion() + UTILIDAD_N;
    }

    public String generarTicket() {
        final String MSG_NOMBRE ="\nNombre: ";
        final String MSG_MARCA = "\nMarca: ";
        final String MSG_CATEGORIA= "\nCategoría: ";
        final String MSG_DESCRIPCION = "\nDescripición: ";

        return MSG_NOMBRE + getNombre() + MSG_MARCA + getMarca() + MSG_CATEGORIA + getCategoria() + MSG_DESCRIPCION + getDescripcion();
    }

}

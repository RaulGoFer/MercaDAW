package es.etg.daw.programacio.practica.mercadaw.dawmarket;

public class Cosmética extends Producto{

    public final double IVA = 21;

    public Cosmética(String nombre, String marca, double precio, double altura, double anchura, double peso, int componentes, String descripcion) {
        super(nombre, marca, precio, altura, anchura, peso, componentes, descripcion);
    }

    @Override
    public String getCategoria() {
        final String MSG_COSMETICA = "Cosmética";
        return MSG_COSMETICA;
    }

    @Override
    public double getIVA() {
        return this.IVA;
    }
    
}

package es.etg.daw.programacio.practica.mercadaw;

public class Cosmética extends Producto{

    public static final double IVA = 0.21;

    public Cosmética(String nombre, String marca, double precio, double altura, double anchura, double peso, int componentes, String descripcion, double iva) {
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

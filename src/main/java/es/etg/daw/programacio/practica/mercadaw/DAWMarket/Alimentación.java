package es.etg.daw.programacio.practica.mercadaw.DAWMarket;

public class Alimentación extends Producto{

    public final double IVA = 4;

    public Alimentación(String nombre, String marca, double precio, double altura, double anchura, double peso, int componentes, String descripcion) {
        super(nombre, marca, precio, altura, anchura, peso, componentes, descripcion);
    }

    @Override
    public String getCategoria() {
        final String MSG_ALIMENTACION = "Alimentación";
        return MSG_ALIMENTACION;
    }

    @Override
    public double getIVA() {
        return this.IVA;
    }

    


    
}

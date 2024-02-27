package es.etg.daw.programacio.practica.mercadaw;

public class Droguería extends Producto {

    public static final double IVA = 0.10;

    public Droguería(String nombre, String marca, double precio, double altura, double anchura, double peso, int componentes, String descripcion, double iva){
        super(nombre, marca, precio, altura, anchura, peso, componentes, descripcion);
    }

    @Override
    public String getCategoria() {
        final String MSG_DROGUERIA = "Droguería";
        return MSG_DROGUERIA;
    }

    @Override
    public double getIVA() {
        return this.IVA;
    }

}

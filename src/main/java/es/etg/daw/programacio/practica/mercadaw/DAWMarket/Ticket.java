package es.etg.daw.programacio.practica.mercadaw.DAWMarket;

import java.util.List;

import es.etg.daw.programacio.practica.mercadaw.Utilidades.IImprimible;

public class Ticket implements IImprimible {
    private List<Producto> productos;

    public Ticket(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String imprimir() {
        final String UTILIDAD_N = "\n\n";

        String etiquetas = "";

        for (Producto producto : productos) {
            etiquetas += producto.generarTicket() + UTILIDAD_N;
        }

        return etiquetas;
    }

}

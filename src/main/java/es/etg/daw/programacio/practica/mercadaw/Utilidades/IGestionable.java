package es.etg.daw.programacio.practica.mercadaw.Utilidades;

import es.etg.daw.programacio.practica.mercadaw.DAWMarket.Empleado;
import es.etg.daw.programacio.practica.mercadaw.DAWMarket.Producto;

public interface IGestionable {
    public void darAlta(Producto producto);
    public void darAlta(Empleado empleado);


}

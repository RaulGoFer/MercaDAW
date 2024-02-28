package es.etg.daw.programacio.practica.mercadaw.utilidades;

import es.etg.daw.programacio.practica.mercadaw.dawmarket.Empleado;
import es.etg.daw.programacio.practica.mercadaw.dawmarket.Producto;

public interface IGestionable {
    public void darAlta(Producto producto);
    public void darAlta(Empleado empleado);


}

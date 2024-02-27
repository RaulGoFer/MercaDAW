package es.etg.daw.programacio.practica.mercadaw;

import java.util.ArrayList;
import java.util.List;
import es.etg.daw.programacio.practica.mercadaw.Utilidades.IGestionable;

public class Supermercado implements IGestionable{
    private List<Producto> productos = new ArrayList<Producto>();
    private List<Empleado> empleados = new ArrayList<Empleado>();
    private List<Cliente> clientes = new ArrayList<Cliente>();
    
    @Override
    public void agregar(Producto producto){
        productos.add(producto);
    }

    @Override
    public void agregar(Empleado empleado){
        empleados.add(empleado);
    }








}

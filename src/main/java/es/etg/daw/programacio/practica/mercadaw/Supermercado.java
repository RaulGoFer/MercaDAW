package es.etg.daw.programacio.practica.mercadaw;

import java.util.ArrayList;
import java.util.List;

import es.etg.daw.programacio.practica.mercadaw.Utilidades.Categoria;
import es.etg.daw.programacio.practica.mercadaw.Utilidades.IGestionable;

public class Supermercado implements IGestionable {
    private String nombre;
    private String direccion;
    private List<Producto> productos = new ArrayList<Producto>();
    private List<Empleado> empleados = new ArrayList<Empleado>();
    private List<Cliente> clientes = new ArrayList<Cliente>();

    public Supermercado(String nombre, String direccion, List<Producto> productos, List<Empleado> empleados) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.productos = productos;
        this.empleados = empleados;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public void darAlta(Producto producto) {
        productos.add(producto);
    }

    @Override
    public void darAlta(Empleado empleado) {
        empleados.add(empleado);
    }

    public Empleado crearEmpleado(String nombre, String apellido, String seccion) {

        final String CAJERO = "Cajero";
        final String REPONEDOR = "Reponedor";
        final String ENCARGADO = "Encargado";

        switch (seccion) {
            case CAJERO:
                return new Cajero(nombre, apellido, CAJERO);

            case REPONEDOR:
                return new Reponedor(nombre, apellido, REPONEDOR);

            case ENCARGADO:
                return new Encargado(nombre, apellido, ENCARGADO);

            default:
                return new Empleado(nombre, apellido, seccion, 0);
        }
    }

    public static Producto crearProducto(Categoria categoria, String nombre, String marca, double precio, double altura, double anchura, double peso, int componentes, String descripcion) {
        switch (categoria) {
            case ALIMENTACION:
                return new Alimentación(nombre, marca, precio, altura, anchura, peso, componentes, descripcion);
            case DROGUERIA:
                return new Droguería(nombre, marca, precio, altura, anchura, peso, componentes, descripcion);
            case COSMETICA:
                return new Cosmética(nombre, marca, precio, altura, anchura, peso, componentes, descripcion);
            
        }
    }

}

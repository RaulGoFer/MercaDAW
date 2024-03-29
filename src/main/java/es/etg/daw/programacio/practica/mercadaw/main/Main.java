package es.etg.daw.programacio.practica.mercadaw.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import es.etg.daw.programacio.practica.mercadaw.DAWMarket.Empleado;
import es.etg.daw.programacio.practica.mercadaw.DAWMarket.Producto;
import es.etg.daw.programacio.practica.mercadaw.DAWMarket.Supermercado;
import es.etg.daw.programacio.practica.mercadaw.DAWMarket.Ticket;
import es.etg.daw.programacio.practica.mercadaw.Utilidades.Categoria;

public class Main {

    public static int leerInt(String msg) {
        int numero = 0;

        System.out.println(msg);
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();

        return numero;
    }

    public static double leerDouble(String msg) {
        double numero = 0;

        System.out.println(msg);
        Scanner sc = new Scanner(System.in);
        numero = sc.nextDouble();

        return numero;
    }

    public static String leerString(String msg) {
        String numero = "";

        System.out.println(msg);
        Scanner sc = new Scanner(System.in);
        numero = sc.nextLine();

        return numero;
    }

    public static void imprimirMenu() {
        final String MSG_BIENVENIDA = "BIENVENIDO!! ";
        final String MSG_CONTRATAR_T = "Introduce 1 para contratar a un trabajador: ";
        final String MSG_AGREGAR_BEBIDA = "Introduce 2 para agregar una bebida: ";
        final String MSG_AGREGAR_COMIDA = "Introduce 3 para agregar una comida: ";
        final String MSG_DESPEDIR_T = "Introduce 4 para despedir a un trabajador: ";
        final String MSG_ELIMINAR_CONS = "Introduce 5 para eliminar una consumición: ";
        final String MSG_LISTADO_CONS = "Introduce 6 para obtener un listado de las consumiciones: ";
        final String MSG_LISTAR_T = "Introduce 7 para obtener un listado de los trabajadores: ";
        final String MSG_IMPRIMIR_N = "Introduce 8 para imprimir una nomina: ";
        final String MSG_IMPRIMIR_M = "Introduce 9 para imprimir un menu: ";
        final String MSG_SALIR = "Introduce 0 para cerrar el programa: ";
        final String UTILIDAD_N = "\n";

        System.out.println(UTILIDAD_N + MSG_BIENVENIDA + UTILIDAD_N + UTILIDAD_N + MSG_CONTRATAR_T + UTILIDAD_N
                + MSG_AGREGAR_BEBIDA + UTILIDAD_N + MSG_AGREGAR_COMIDA + UTILIDAD_N + MSG_DESPEDIR_T + UTILIDAD_N
                + MSG_ELIMINAR_CONS + UTILIDAD_N
                + MSG_LISTADO_CONS + UTILIDAD_N + MSG_LISTAR_T + UTILIDAD_N + MSG_IMPRIMIR_N + UTILIDAD_N
                + MSG_IMPRIMIR_M + UTILIDAD_N + MSG_SALIR + UTILIDAD_N);
    }

    public static Supermercado inicializarSupermercado(List<Empleado> empleados, List<Producto> productos) {
        final String NOMBRE_SUPER = "DAWMarket";
        final String CALLE_SUPER = "Calle Enrique Tierno Galván";

        Supermercado supermercado = new Supermercado(NOMBRE_SUPER, CALLE_SUPER, productos, empleados);
        return supermercado;
    }

    public static Empleado contratarEmpleado(Supermercado supermercado) {
        final String MSG_INTRO_NOMBRE = "\n Introduce el nombre del empleado: ";
        final String MSG_INTRO_APELLIDOS = "\n Introduce los apellidos del empleado: ";
        final String MSG_INTRO_SECCION = "\n Introduce la sección del empleado: ";

        return supermercado.crearEmpleado(leerString(MSG_INTRO_NOMBRE), leerString(MSG_INTRO_APELLIDOS),
                leerString(MSG_INTRO_SECCION));
    }

    public static Producto añadirProducto(Supermercado supermercado) {
        final String MSG_INTRO_NOMBRE = "\n Introduce el nombre del producto: ";
        final String MSG_INTRO_MARCA = "\n Introduce la marca del producto: ";
        final String MSG_INTRO_PRECIO = "\n Introduce el precio del producto: ";
        final String MSG_INTRO_ALTURA = "\n Introduce la altura del producto: ";
        final String MSG_INTRO_ANCHURA = "\n Introduce la anchura del producto: ";
        final String MSG_INTRO_PESO = "\n Introduce el peso del producto: ";
        final String MSG_INTRO_COMPONENTES = "\n Introduce el número de componentes del producto: ";
        final String MSG_INTRO_DESCRIPCION = "\n Introduce la descripción del producto: ";
        final String MSG_INTRO_CATEGORIA = "\n Introduce la categoría del producto (ALIMENTACION, DROGUERIA, COSMETICA): ";
        final String MSG_EXCEPCION = "Introoduce una categoria válida. + \n";

        String stringCategoria = leerString(MSG_INTRO_CATEGORIA);
        Categoria categoria = null;

        while (categoria == null) {
            try {
                categoria = Categoria.valueOf(stringCategoria.toUpperCase());
            } catch (IllegalArgumentException categoriaInvalida) {
                System.out.println(MSG_EXCEPCION);
            }
        }

        return supermercado.crearProducto(categoria, leerString(MSG_INTRO_NOMBRE), leerString(MSG_INTRO_MARCA),
                leerDouble(MSG_INTRO_PRECIO), leerDouble(MSG_INTRO_ALTURA), leerDouble(MSG_INTRO_ANCHURA),
                leerDouble(MSG_INTRO_PESO), leerInt(MSG_INTRO_COMPONENTES), leerString(MSG_INTRO_DESCRIPCION));

    }

    public static void calcularProductos(List<Producto> productos) {
        final float INCREMENTO_25 = 1.25f;
        final float INCREMENTO_15 = 0.15f;
        final float INCREMENTO_10 = 0.10f;
        final float INCREMENTO_5 = 0.05f;
        final int PESO_MIN = 1;
        final int PESO_MAX = 5;
        final float ALTURA_LIMITE = 0.5f;
        final float ANCHURA_LIMITE = 0.5f;
        final float CENTIMOS = 0.10f;
        final int COMPONENTES_LIMITE = 2;
        final float CONVERSION = 0.90f;
        final String EURO = "€";
        final String DOLLAR = "$";
        final String BARRA = "/";
        final String USABILIDAD = "\n";
        final String MSG_REACARGO_PRECIO = "Precio de venta: ";
        final String MSG_REACRGO_PESO = "Recargo por peso: ";
        final String MSG_RECARGO_ALTURA = "Recargo por altura: ";
        final String MSG_RECARGO_ANCHURA = "Recargo por anchura: ";
        final String MSG_RECARGO_COMPONENTES = "Recargo por número de piezas: ";
        final String MSG_PRECIO_TOTAL = "PRECIO TOTAL: ";

        for (Producto producto : productos) {
            double altura = producto.getAltura();
            double anchura = producto.getAnchura();
            double peso = producto.getPeso();
            int componentes = producto.getComponentes();
            double precioVenta = 0;
            double recargoPeso = 0;
            double recargoAltura = 0;
            double recargoAnchura = 0;
            double recargoComponentes = 0;
            double precioTotal = 0;
            double precioDolares = 0;

            precioVenta = producto.getPrecio() * INCREMENTO_25;
            System.out.println(MSG_REACARGO_PRECIO + precioVenta);

            if (peso > PESO_MAX) {
                recargoPeso = precioVenta * INCREMENTO_15; // 15% si pesa más de 5 kg
            } else if (peso > PESO_MIN) {
                recargoPeso = precioVenta * INCREMENTO_10; // 10% si pesa más de 1 kg
            } else {
                recargoPeso = precioVenta * INCREMENTO_5; // 5% en el resto de casos
            }
            System.out.println(MSG_REACRGO_PESO + recargoPeso);

            if (altura > ALTURA_LIMITE) {
                recargoAltura = precioVenta * INCREMENTO_10; // 10% si la altura es mayor de 0.5 metros
            } else {
                recargoAltura = precioVenta * INCREMENTO_5; // 5% en el resto de casos
            }
            System.out.println(MSG_RECARGO_ALTURA + recargoAltura);

            if (anchura > ANCHURA_LIMITE) {
                recargoAnchura = precioVenta * INCREMENTO_10; // 10% si la anchura es mayor de 0.5 metros
            } else {
                recargoAnchura = precioVenta * INCREMENTO_5; // 5% en el resto de casos
            }
            System.out.println(MSG_RECARGO_ANCHURA + recargoAnchura);

            if (componentes > COMPONENTES_LIMITE) {
                recargoComponentes = precioVenta + CENTIMOS * componentes; // 10 centimos por componente
            }
            System.out.println(MSG_RECARGO_COMPONENTES + recargoComponentes);

            precioTotal = precioVenta + recargoPeso + recargoAltura + recargoAnchura + recargoComponentes; // recargos
            precioDolares = precioTotal / CONVERSION;
            System.out.println(MSG_PRECIO_TOTAL + precioTotal + EURO + BARRA + precioDolares + DOLLAR + USABILIDAD);
        }
    }

    public static void mostrarEmpleados(List<Empleado> empleados) {
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }

    public static void imprimirTicket(Ticket ticket) {
        System.out.println(ticket.imprimir());
    }

    public static void main(String[] args) {
        final String MSG_INTRO_OPC = "Introduce una de las opciones anteriores: ";
        final int OPC_SALIR = 0;
        final int OPC_ALTA_EMPLEADO = 1;
        final int OPC_ALTA_PRODUCTO = 2;
        final int OPC_VISUALIZAR_PRODUCTO = 3;
        final int OPC_VISUALIZAR_EMPLEADOS = 4;
        final int OPC_OBTENER_PRECIO = 5;
        final int OPC_IMPRIMIR_TICKET = 6;

        int opcion = 0;

        List<Empleado> empleados = new ArrayList<Empleado>();
        List<Producto> productos = new ArrayList<Producto>();
        Supermercado supermercado = inicializarSupermercado(empleados, productos);
        Ticket ticket = new Ticket(productos);

        do {
            imprimirMenu();
            opcion = leerInt(MSG_INTRO_OPC);
            switch (opcion) {
                case OPC_ALTA_EMPLEADO:
                    supermercado.darAlta(contratarEmpleado(supermercado));
                    break;
                case OPC_ALTA_PRODUCTO:
                    supermercado.darAlta(añadirProducto(supermercado));
                    break;
                case OPC_VISUALIZAR_PRODUCTO:
                    System.out.println(productos.toString());
                    break;
                case OPC_VISUALIZAR_EMPLEADOS:
                    mostrarEmpleados(empleados);
                    break;
                case OPC_OBTENER_PRECIO:
                    calcularProductos(productos);
                    break;
                case OPC_IMPRIMIR_TICKET:
                    imprimirTicket(ticket);
            }

        } while (opcion != OPC_SALIR);
    }
}
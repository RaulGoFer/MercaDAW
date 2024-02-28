package es.etg.daw.programacio.practica.mercadaw.main;

import java.util.ArrayList;
import java.util.List;

import es.etg.daw.programacio.practica.mercadaw.Empleado;

public class Main {

    public static void mostrarEmpleados(List<Empleado> empleados){

        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }



    public static void main(String[] args) {
        System.out.println("Hello world!");

        Empleado e = new Empleado(2, "Eternocleidomastoideo", "sanchez", null, 3);       
        Empleado e1 = new Empleado(2, "hola", "s", null, 3);
        List<Empleado> empleados = new ArrayList<Empleado>();
        empleados.add(e);
        empleados.add(e1);
        mostrarEmpleados(empleados);

    }
}
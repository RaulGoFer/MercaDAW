package es.etg.daw.programacio.practica.mercadaw.main;

import es.etg.daw.programacio.practica.mercadaw.Alimentación;
import es.etg.daw.programacio.practica.mercadaw.Cosmética;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Alimentación a = new Alimentación("pepe", "daw", 5, 0.20, 0.27, 5, 3, "hola");
        System.out.println(a);

        Cosmética c = new Cosmética("NOMBRE", "DAW", 5, 5, 5, 5, 5, null);
        System.out.println(c.toString());
    }
}
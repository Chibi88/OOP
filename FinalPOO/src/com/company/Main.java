package com.company;

public class Main {

    public static void main(String[] args) {

        Municipio generalPueyrredon = new Municipio();

        generalPueyrredon.agregarPropiedad("Casa Avenida");
        generalPueyrredon.agregarPropiedad("Casa Calle");
        generalPueyrredon.agregarPropiedad("Barrio Cerrado");

        generalPueyrredon.mostrarPropiedades();

    }
}

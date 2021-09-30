package com.company;

import java.util.Objects;

public class Jugador implements Comparable<Jugador> {

    private Integer numeroCamiseta;
    private String nombre;
    private Boolean esTitular;
    private Boolean estaLesionado;

    public Jugador(Integer numeroCamiseta, String nombre, Boolean esTitular, Boolean estaLesionado) {
        this.numeroCamiseta = numeroCamiseta;
        this.nombre = nombre;
        this.esTitular = esTitular;
        this.estaLesionado = estaLesionado;
    }

    @Override
    public int compareTo(Jugador jugador) {

        return this.numeroCamiseta.compareTo(jugador.numeroCamiseta);
    }

    public Boolean getEsTitular() {
        return esTitular;
    }

    public Boolean getEstaLesionado() {
        return estaLesionado;
    }

    @Override
    public String toString() {
        return numeroCamiseta + " " + nombre;
    }


}
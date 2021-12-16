package com.company.test;

import com.company.ClaseGenerica;

public class TestGenerics {

    public static void main(String[] args) {

        ClaseGenerica<Integer> objetoInt = new ClaseGenerica<>(15);
        objetoInt.obtenerTipo();

        ClaseGenerica<String> objetoString = new ClaseGenerica<>("Chibi");
        objetoString.obtenerTipo();

    }

    //hasta que no proporciono un valor y creo uun objeto de esta variable
    // es generico. Se usa para trabajar con las apis de Collection



}

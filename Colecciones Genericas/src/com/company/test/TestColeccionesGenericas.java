package com.company.test;

import java.util.ArrayList;
import java.util.*;

public class TestColeccionesGenericas {

    public static void main(String[] args) {
        List <String> miLista = new ArrayList<>();
        miLista.add ("lunes");
        miLista.add ("martes");
        miLista.add ("miercoles");
        miLista.add ("jueves");
        miLista.add ("viernes");
        //imprimir(miLista);
        //String elemento = miLista.get(0);

        Set <String> miSet = new HashSet<>();
        miSet.add("lunes");
        miSet.add("martes");
        miSet.add("miercoles");
        miSet.add("jueves");
        miSet.add("viernes");
        //imprimir(miSet);


        Map<String,String>  miMapa = new HashMap<>();
        miMapa.put("valor1", "Silvina");
        miMapa.put("valor2", "Felipe");

        String elementoMapa = miMapa.get("valor1");
        System.out.println("elementoMapa: " + elementoMapa);

        imprimir(miMapa.keySet());     //regresa valores de claves
        imprimir((miMapa.values()));

        /* funcion lambda

        miLista.forEach(elemento -> {
            System.out.println("elemento - " + elemento);
           });     */
    }


    public static void imprimir (Collection <String> coleccion){
             for (Object elemento : coleccion){
                 System.out.println("Elemento - " + elemento);
             }

    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //creo el scanner
        Scanner scanner = new Scanner(System.in);
        // que el usuario ingrese el nombre
        System.out.println(" ingrese el nombre de su perro: ");
        String nombre = scanner.nextLine();
        // que el usuario ingrese la comida
        System.out.println("ingrese cuantos kg come por dia");
        Double cantidadParaLlenarse = scanner.nextDouble();

        // crear una funcion que calcule cuantos paquetes comio el perro
        Integer cantidadPaquetes =  cuantosPaquetesComio(cantidadParaLlenarse);
        System.out.println(nombre + " consumio " + cantidadPaquetes + " paquetes para estar lleno");

    }

    public static Integer cuantosPaquetesComio(Double cantidadParaLlenarse) {
        Scanner scanner = new Scanner(System.in);
        Double cantidadConsumida = 0.0;
        Integer cantidadDePaquetes = 0;
        while (cantidadConsumida < cantidadParaLlenarse) {
            System.out.println("ingresa el peso del paquete: ");
            Double pesoPaquete = scanner.nextDouble();
            cantidadConsumida += pesoPaquete;
            cantidadDePaquetes++;
        }

        return cantidadDePaquetes;
    }
}
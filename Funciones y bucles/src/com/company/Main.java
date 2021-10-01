package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// funciones y bucles
        System.out.println(suma(2,2));


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        Integer numero = scanner.nextInt();
        contarHasta (numero);
    }

    static Integer suma (Integer numero1, Integer numero2){
        return numero1 + numero2;
        }

    static void contarHasta (Integer numero){
        for (Integer i=1; i<=numero ; i++){
            System.out.println(i);
    }
    }

}

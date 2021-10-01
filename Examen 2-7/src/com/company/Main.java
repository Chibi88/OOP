package com.company;

public class Main {

    public static void main(String[] args) {


        Policia policia1 = new Policia("Juan", "Perez", 100);
        Policia policia2 = new Policia("Ernesto", "Gonzalez", 101);
        ArmaLarga armaLarga = new ArmaLarga(policia1, 200, 300.0, "Bersa", 22, "En uso",true, "para patrullar", 5 );
        ArmaLarga armaLarga1 = new ArmaLarga(policia1, 100, 200.0, "Bersa", 22, "En uso",true, "para patrullar", 5 );
        ArmaCorta armaCorta1 = new ArmaCorta(policia2, 300, 300.0, "Bersa", 9, "Nueva", true);

        armaCorta1.alcanceMayor();
        armaCorta1.informarAlcance();
        armaLarga.estaEnCondiciones();

        if(armaLarga.compareTo(armaLarga1)>0){
            System.out.println("El primer arma es mejor");
        }else if (armaLarga.compareTo(armaLarga1)<0){
            System.out.println("la segunda arma es mejor");
        }else {
            System.out.println("son iguales");
        }

    }
}

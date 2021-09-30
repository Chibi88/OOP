package com.company;


public class Main {

    public static void main(String[] args) {

        Socio primerSocio = new Socio("1","Lean",1000.0,"Futbol");
        Socio segundoSocio = new Socio("2","Luciana",2000.0,"tennis");

        SocioHabilitado socioHabilitado = new SocioHabilitado("3","Guido",3000.0,"polo",false);

        System.out.println(primerSocio.costoMensual());
        System.out.println(socioHabilitado.costoMensual());


    }
}

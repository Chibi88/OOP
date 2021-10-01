package com.company;

public class PropiedadFactory {

    private static PropiedadFactory instance;

    private PropiedadFactory(){
    }

    public static PropiedadFactory getInstance(){
            if (instance == null){
            instance = new PropiedadFactory();
        }
        return instance;
    }

    public Propiedad crearPropiedad (String nombrePropiedad){

        switch (nombrePropiedad){
            case "Casa Avenida":
                return new Casa ("Av. San Martin",130,500.0);
            case "Casa Calle":
                return new Casa ("Mitre", 233, 700.0);
            case "Barrio Cerrado":
                BarrioCerrado barrioCerrado = new BarrioCerrado("Gutierres",330, 2);
                barrioCerrado.agregarPropiedad(crearPropiedad("Casa Avenida"));
                barrioCerrado.agregarPropiedad(crearPropiedad("Casa Calle"));
                return barrioCerrado;
            default:
                return null;
        }

    }




}

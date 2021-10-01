package com.company;

public class ArmaCorta extends Arma {

    private Boolean automatica;

    public ArmaCorta(Policia policia, Integer cantidadMunicion, Double alcanceAprox, String marca, Integer calibre, String estado, Boolean automatica) {
        super(policia, cantidadMunicion, alcanceAprox, marca, calibre, estado);
        this.automatica = automatica;
    }

    public Boolean alcanceMayor(){
        return (getAlcanceAprox() >= 200.0);
    }

    public void informarAlcance(){
        if (alcanceMayor() == true){
            System.out.println("El alcance del arma es mayor a 200 metros");
        }
    }




}



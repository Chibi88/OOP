package com.company;

public abstract class Arma {

    private Policia policia;
    private Integer cantidadMunicion;
    private Double alcanceAprox;
    private String marca;
    private Integer calibre;
    private String estado;

    public Arma(Policia policia, Integer cantidadMunicion, Double alcanceAprox, String marca, Integer calibre, String estado) {
        this.policia = policia;
        this.cantidadMunicion = cantidadMunicion;
        this.alcanceAprox = alcanceAprox;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
    }

    public Double getAlcanceAprox() {
        return alcanceAprox;
    }

    public void estaEnCondiciones(){
        if (estado == "En uso" && calibre>=9){
            System.out.println("Esta en condiciones");
        }else {
        System.out.println("El arma no esta en condiciones");
    }


} }

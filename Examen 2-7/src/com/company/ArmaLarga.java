package com.company;

public class ArmaLarga extends Arma implements Comparable{

    private Boolean selloRenar;
    private String descripcionUso;
    private Integer nivelArma;

    public ArmaLarga(Policia policia, Integer cantidadMunicion, Double alcanceAprox, String marca, Integer calibre, String estado, Boolean selloRenar, String descripcionUso, Integer nivelArma) {
        super(policia, cantidadMunicion, alcanceAprox, marca, calibre, estado);
        this.selloRenar = selloRenar;
        this.descripcionUso = descripcionUso;
        this.nivelArma = nivelArma;
    }

    @Override
    public int compareTo(Object object) {

        ArmaLarga unArmaLarga = (ArmaLarga) object;
        Integer nivelArma1 = this.nivelArma;
        Integer nivelArma2 = unArmaLarga.nivelArma;

        if (nivelArma1>nivelArma2){
            return 1;
        }
        if (nivelArma1<nivelArma2) {
            return -1;
        }
        return 0;
    }
}

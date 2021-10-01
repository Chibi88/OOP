package com.company;

import java.util.ArrayList;
import java.util.List;

public class BarrioCerrado extends Propiedad{

    private List<Propiedad> propiedades;
    private Integer factorMultiplicador;

    public BarrioCerrado(String calle, Integer numero, Integer factorMultiplicador) {
        super(calle, numero);
        this.factorMultiplicador = factorMultiplicador;
        propiedades = new ArrayList<>();
    }

    public void agregarPropiedad(Propiedad propiedad){
        propiedades.add(propiedad);
    }

    @Override
    public Double calcularImpuesto() {
        Double impuestoTotal = 0.0;
        for (Propiedad propiedad : propiedades) {
            impuestoTotal += propiedad.calcularImpuesto();
            }
        impuestoTotal = impuestoTotal*factorMultiplicador;

        return impuestoTotal;
    }

    @Override
    public String toString() {
        return "Barrio cerrado en calle " + getCalle() + " al : " + getNumero() + " tiene un impuesto base de " + calcularImpuesto();
    }
}

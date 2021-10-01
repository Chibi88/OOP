package com.company;

public class Casa extends Propiedad{

    private Double montoBaseImpuesto;

    public Casa(String calle, Integer numero, Double montoBaseImpuesto) {
        super(calle, numero);
        this.montoBaseImpuesto = montoBaseImpuesto;
    }


    @Override
    public Double calcularImpuesto() {
        Double montoImpuesto = montoBaseImpuesto;
                if (getCalle().equals("Av. San Martin")){
                    montoImpuesto += (montoImpuesto*0.1);
                }
        return montoImpuesto;
    }

    @Override
    public String toString() {
        return "Casa sobre la calle " + getCalle() + " al : " + getNumero() + " tiene un impuesto base de " + montoBaseImpuesto + " es decir, un impuesto de " + calcularImpuesto();
    }

}



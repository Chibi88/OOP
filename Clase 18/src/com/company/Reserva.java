package com.company;

import java.util.ArrayList;
import java.util.List;

public class Reserva {
    private Integer codigo;
    private String recorrido;
    private Integer cantPersonas;

    public Reserva(Integer codigo, String recorrido, Integer cantPersonas) {
        this.codigo = codigo;
        this.recorrido = recorrido;
        this.cantPersonas = cantPersonas;
    }

        public Double calcularPrecioReserva(){
        Double precioBoleto = cantPersonas * 50.0;
        if(recorrido.equals("Buenos Aires-Bragado") || recorrido.equals("Bragado-Buenos Aires")) {
            precioBoleto = precioBoleto * 0.2;
        }
            return precioBoleto;
        }



}

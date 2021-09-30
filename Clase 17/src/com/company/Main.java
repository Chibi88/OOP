package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        //Paciente paciente = null;

        try{
            Paciente paciente = new Paciente("Juan","Perez","12345",new Date(2023), new Date(2023));
            System.out.println(paciente.getNombre());
        } catch (PacienteException e){
            e.printStackTrace();
        }


    }
}

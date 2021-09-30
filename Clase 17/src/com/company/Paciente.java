package com.company;

import java.util.Date;

public class Paciente {
    String nombre;
    String apellido;
    String historiaClinica;
    Date fechaInternacion;
    Date fechaAlta;

    //Tiene que haber una excepcion si la fecha de internación fuera
    //posterior
    //La fecha de internacion tiene que ser anterior a hoy
    // cuando la fecha de alta es posterior al día de la internación.
    Paciente (String nombre, String apellido, String historiaClinica, Date fechaInternacion, Date fechaAlta) throws PacienteException {
        Date hoy= new Date();
        System.out.println(hoy);
        this.nombre=nombre;
        this.apellido=apellido;
        //fechaAlta=null;

        if (fechaInternacion.before(hoy)) {
            this.fechaInternacion = fechaInternacion;
        }else{
            throw new PacienteException("La fecha de internacion debe ser anterior a hoy");
        }

        if(fechaAlta.before(fechaInternacion)){
            throw new PacienteException("La fecha de alta debe ser posterior a la de internación");
        }else{
            this.fechaAlta = fechaAlta;
        }
    }

    public Date getFechaInternacion() {
        return fechaInternacion;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void darAlta(Date fechaAlta)
    {
        if (fechaAlta.after(fechaInternacion))
            System.out.println("Ok");
        else
            System.out.println("No se puede");
    }

    public String getNombre() {
        return nombre;
    }
}

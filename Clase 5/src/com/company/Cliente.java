package com.company;

//clase

public class Cliente {

    //atributos
    private String nombre;
    private String apellido;
    private Double deuda;

    //constructor
    public Cliente (String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        deuda = 0.0;
    }

    //getters y setters
    public String getNombre( ){
        return nombre;}
    public String getApellido ( ){
        return apellido;}
    public double getDeuda ( ){
        return D;}

    public void setNombre( String nombre) {this.nombre = nombre;}
    public void setApellido( String apellido) {this.apellido = apellido;}

    //metodos
    public void incrementarDeuda (Double monto){
        deuda += monto;
    }



}

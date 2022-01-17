package com.company;

//Esta va a ser la clase entidad que se conecte a la tabla de base de datos de persona
//la tabla persona la creamos previamente en workbench

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table (name = "persona")
public class Persona implements Serializable {

    //Serializable permite convertir cualquier objeto cuya en una secuencia
    // de bytes que pueden ser posteriormente leídos para restaurar el objeto original.

    private static final long serialVersionUID = 1L;

    @Column (name = "id_persona")
    @Id
    private int idPersona;

    private String nombre;

    //si la tabla en la base de datos se llama igual, no es necesaria la anotacion @column
    //en ID ponele, en la tabla es id_persona y aca idPersona, entonces tengo que referenciar
    //a que tabla va. (en nombre no es necesario)

    private String apellido;
    private String email;
    private String telefono;

    //Si la tabla tiene distinto nombre, o mayusculas/minusculas se usa @Table


    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

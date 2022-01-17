package com.company.test;

import com.company.Persona;
import com.company.dao.PersonaDAO;

public class OperacionesHibernateJPA {
    public static void main(String[] args) {
        PersonaDAO personaDAO = new PersonaDAO();
        personaDAO.listar();


        Persona persona = new Persona();
        persona.setNombre("Carlos");
        persona.setApellido("Lopez");
        persona.setEmail("Carlos@mail.com");
        persona.setTelefono("22351122");
        personaDAO.insertar(persona);

        Persona persona2 = new Persona();
        persona.setIdPersona(15);
        personaDAO.buscarPersonaPorId(persona2);
        System.out.println(persona2);
        persona.setApellido("Suarez");
        persona.setEmail("mailnuevo@mail.com");
        personaDAO.modificar(persona2);
        personaDAO.listar();

        Persona persona3 = new Persona();
        persona.setIdPersona(2);
        personaDAO.buscarPersonaPorId(persona3);
        //System.out.println(persona3);
        personaDAO.eliminar(persona3);
        personaDAO.listar();





}
}

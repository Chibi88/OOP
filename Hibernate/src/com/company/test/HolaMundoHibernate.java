package com.company.test;

import com.company.Persona;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class HolaMundoHibernate {
    public static void main(String[] args) {
        String hql = "SELECT p FROM Persona p";
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("HibernateEjemplo"); //llamo a mi base de datos por nombre para conectarme
        EntityManager entityManager = fabrica.createEntityManager();

        Query query = entityManager.createQuery(hql);
        List<Persona> personas = query.getResultList();
        for (Persona p:personas) {
            System.out.println("Persona:" + p);

        }
    }
}

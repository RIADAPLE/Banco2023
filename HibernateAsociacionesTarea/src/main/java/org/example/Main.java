package org.example;

import jakarta.persistence.EntityManager;
import org.example.entity.Conjuntos;
import org.example.entity.Students;
import org.example.util.JpaUtil;

public class Main {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.getEntityManager();
        try{
            em.getTransaction().begin();
            System.out.println("-----Creando usuario-------");
            Students student = new Students("Ricardo", "Aparicio");
            Conjuntos conjuntos = new Conjuntos("Grupo de sociales");

            conjuntos.addStudent(student);

            em.persist(conjuntos);

            em.getTransaction().commit();
            System.out.println(student);
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
}
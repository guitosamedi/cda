package fr.diginamic;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TestJPA {

    public static void main(String[] args) {

        /*
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo-jpa");
            EntityManager em = emf.createEntityManager();
            System.out.println(em);
            em.close();
            emf.close();
        */

        try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo-jpa");
            EntityManager em = emf.createEntityManager()){
                System.out.println(em);
            }
        }
}



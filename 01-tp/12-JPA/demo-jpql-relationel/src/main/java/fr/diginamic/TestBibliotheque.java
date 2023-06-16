package fr.diginamic;
import fr.diginamic.entites.*;
import jakarta.persistence.*;

public class TestBibliotheque {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo-jpql");
             EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();


            // AFFICHER LISTE LIVRE
           TypedQuery<Livre> allLivre = em.createQuery("select l from Livre l", Livre.class);
            for(Livre livre : allLivre.getResultList()){
                System.out.println(livre);
            }

            /*
            // AFFICHER LISTE CLIENT
            TypedQuery<Client> allClient = em.createQuery("select c from Client c", Client.class);
            for(Client client : allClient.getResultList()){
                System.out.println(client);
            }

            // AFFICHER LISTE EMPRUNTS
            TypedQuery<Emprunt> allEmprunt = em.createQuery("select e from Emprunt e", Emprunt.class);
            for(Emprunt emprunt : allEmprunt.getResultList()){
                System.out.println(emprunt);
            }
            */

            em.getTransaction().commit();

            }
        }
}


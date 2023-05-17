package entites;

import entite2.Personne;

public class TestPersonne {
    public static void main(String[] args) {

        AdressePostale address = new AdressePostale(15, "rue de la paix", 75000, "Paris" );
        Personne p1 = new Personne("Alain", "Deloin", address);
        Personne p2 = new Personne("Clint", "Eastwood", address);


        System.out.println("Je suis " + p1);
        //System.out.println("Je suis " + p2.prenom + " " + p2.nom + " et je vis à " + address );

    }

}

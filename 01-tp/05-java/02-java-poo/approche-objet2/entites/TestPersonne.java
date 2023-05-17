package entites;

import entite2.Personne;

public class TestPersonne {
    public static void main(String[] args) {

        AdressePostale adresse = new AdressePostale(15, "rue de la paix", 75000, "Paris" );
        Personne p1 = new Personne("Alain", "Deloin", adresse);
        Personne p2 = new Personne("Clint", "Eastwood");

        System.out.println("Je suis " + p1.prenom + " " + p1.nom + " et je vis à " + adresse.numeroRue + adresse.libelleRue + adresse.codePostal + adresse.ville );
        System.out.println("Je suis " + p2.prenom + " " + p2.nom );
    }

}

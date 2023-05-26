package fr.entites;

public class TestPersonne {
    public static void main(String[] args) {

        AdressePostale adresse = new AdressePostale(15, "rue rivoli", 75000, "Paris" );
        Personne p1 = new Personne("Alain", "Deloin", adresse); // p1 est une instance de la classe Personne
       // Personne p2 = new Personne("Clint", "Eastwood");

        //System.out.println("Je suis " + p1.prenom + " " + p1.nom + " et je vis à " + adresse.numeroRue + adresse.libelleRue + adresse.codePostal + adresse.ville );
        //System.out.println("Je suis " + p2.prenom + " " + p2.nom );

        p1.afficherPersonne(); // On appelle une methode d'instance sur une variable de type Personne

        p1.modifierNom("Bilbot");
        p1.modifierPrenom("Fredon");
        p1.afficherPersonne();

        AdressePostale adresse2 = new AdressePostale(88, "rue palavas", 3400, "Montpellier" );
        p1.modifierAdresse(adresse2);


        // Je veux stocker dans une variable

        String nom = p1.getNom();
        System.out.println(nom);
    }

}

package entites;

import entite2.Personne;

public class TestPersonne {
    public static void main(String[] args) {

        Personne personne1 = new Personne();
        Personne personne2 = new Personne();

        personne1.prenom ="John";
        personne1.nom ="Doe";
        personne1.address.numeroRue = 15;
        personne1.address.libelleRue = "Rue de la Paix";
        personne1.address.codePostal = 75000;
        personne1.address.ville = "Paris";

        personne2.prenom ="Adam";
        personne2.nom ="Smith";
        personne2.address.numeroRue = 65;
        personne2.address.libelleRue = "baker street";
        personne2.address.codePostal = 75000;
        personne2.address.ville = "London";

    }

}

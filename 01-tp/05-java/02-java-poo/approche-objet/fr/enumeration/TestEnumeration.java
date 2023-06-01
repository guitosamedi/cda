package fr.enumeration;

import static fr.enumeration.Saison.rechercheSaison;

public class TestEnumeration {
    public static void main(String[] args) {

        Saison[] saisons = Saison.values();

        for (Saison saison : saisons ){
            System.out.println(saison);
        }

        String nom = String.valueOf("ETE");
        System.out.println("Nom Saison : " + nom);

        String libelle = "ETE";

        String test = String.valueOf(rechercheSaison(libelle));
        System.out.println("Recherche saison: " + test);


    }
}

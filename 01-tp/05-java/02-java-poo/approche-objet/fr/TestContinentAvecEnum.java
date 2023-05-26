package fr;

import fr.enumeration.Saison;
import fr.listes.Continent;
import fr.listes.Ville;

import java.util.ArrayList;

public class TestContinentAvecEnum {
    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<>();
        villes.add(new Ville("New York", 343000, Continent.AMERIQUE));
        villes.add(new Ville("Paris", 47800, Continent.EUROPE));
        villes.add(new Ville("Pékin", 53400, Continent.ASIE));
        villes.add(new Ville("Moscou", 484000, Continent.EUROPE));
        villes.add(new Ville("Berlin", 9700, Continent.EUROPE));
        villes.add(new Ville("Sydney", 77200, Continent.OCEANIE));
        villes.add(new Ville("Sao Paulo", 850700, Continent.AMERIQUE));
        villes.add(new Ville("Dakar", 40600, Continent.AFRIQUE));

        for (Ville ville : villes ){
            System.out.println(ville);
        }

    }
}

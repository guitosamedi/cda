package fr;

import fr.listes.Villes;
import fr.tri.VilleNomComparator;
import fr.tri.VillePopComparator;

import java.util.*;

public class TestVilles {
    public static void main(String[] args) {
        ArrayList<Villes> villes = new ArrayList<>();
        villes.add(new Villes("Nice", 343000));
        villes.add(new Villes("Carcassonne", 47800));
        villes.add(new Villes("Narbonne", 53400));
        villes.add(new Villes("Lyon", 484000));
        villes.add(new Villes("Foix", 9700));
        villes.add(new Villes("Pau", 77200));
        villes.add(new Villes("Marseille", 850700));
        villes.add(new Villes("Tarbes", 40600));

        // Collection représente le concept de Collection : ArrayList implémente Collection
        // Cela a pour effet qu'ArrayList a une liste de méthode imposée par Collection

        Collections.sort(villes, new VillePopComparator(false)); // la méthode sort appelle votre méthode compareTo

        for (Villes v: villes) {
            System.out.println(v);
        }
        System.out.println("-----------------------------");

        Villes ville = Collections.min(villes, new VilleNomComparator());
        System.out.println(ville);

        System.out.println("-----------------------------");
        for (Villes v: villes) {
            System.out.println(v);
        }

    }
}
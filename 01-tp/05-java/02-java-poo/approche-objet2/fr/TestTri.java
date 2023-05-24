package fr;

import fr.listes.Ville;
import fr.tri.VilleHabComparator;

import java.util.ArrayList;
import java.util.Collections;

public class TestTri {
    public static void main(String[] args) {
        ArrayList<Ville> ville = new ArrayList<>();
        ville.add(new Ville("Nice", 343000));
        ville.add(new Ville("Carcassonne", 47800));
        ville.add(new Ville("Narbonne", 53400));
        ville.add(new Ville("Lyon", 484000));
        ville.add(new Ville("Foix", 9700));
        ville.add(new Ville("Pau", 77200));
        ville.add(new Ville("Marseille", 850700));
        ville.add(new Ville("Tarbes", 40600));

        Collections.sort(ville);
        System.out.println("********************");
        for (Ville v: ville){
            System.out.println(v);
        }
        System.out.println("********************");
       // Collections.sort(ville, new VilleHabComparator());
       // for (Ville v: ville){
       //     System.out.println();
       // }
    }
}

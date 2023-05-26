package fr.maps;

import java.util.HashMap;

public class MapVille
{
    public static void main(String[] args) {
        Ville v1 = new Ville("Nice", 343000);
        Ville v2 = new Ville("Carcassonne", 47800);
        Ville v3 = new Ville("Narbonne", 53400);
        Ville v4 = new Ville("Lyon", 484000);
        Ville v5 = new Ville("Foix", 9700);
        Ville v6 = new Ville("Pau", 77200);
        Ville v7 = new Ville("Marseille", 850700);
        Ville v8 = new Ville("Tarbes", 40600);

        HashMap<String, Ville> ville = new HashMap<>();

        Ville minHab = ville.get(0);
        System.out.println(minHab);
    }
}

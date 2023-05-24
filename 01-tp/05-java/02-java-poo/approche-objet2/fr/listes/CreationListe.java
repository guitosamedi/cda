package fr.listes;

import java.util.ArrayList;

public class CreationListe {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            list.add(i);
        }
        // Affichage de la liste
        System.out.println(list);

        // Affichage de la taille de la liste
        System.out.println(list.size());
    }
}

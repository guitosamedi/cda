package fr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeInt {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(-1);
        list1.add(5);
        list1.add(7);
        list1.add(3);
        list1.add(-2);
        list1.add(4);
        list1.add(8);
        list1.add(5);

        // Array Jialei
        //ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));

        // Iterator
        Iterator<Integer> iter = list1.iterator();

        System.out.println("Affichage de la liste: ");
        for ( Integer list: list1) {
            System.out.println(list);
        }

        System.out.println("Affichage de la taille: ");
        System.out.println(list1.size());

        System.out.println("Affichage du plus grand élément: ");
        System.out.println(Collections.max(list1));

    // Remove Min Collection
        while(iter.hasNext()){
            if(iter.next().equals(Collections.min(list1))) {
                iter.remove();
            }
        }

        System.out.println("Affichage de la liste sans le plus petit élément: ");
        for ( Integer list: list1) {
            System.out.println(list);
        }
    }
}


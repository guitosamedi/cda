package fr.boucles;

public class ExerciceTableauEntier {
    public static void main(String[] args) {
        // Délarer un tableau avec les entiers de 1 à 10
        int[] monTableau = {1,2,3,4,5,6,7,8,9,10};
        
        // Afficher le premier élément du tableau
            System.out.println(monTableau[0]);

        // Afficher le dernier élément du tableau
            System.out.println(monTableau[9]);

        // Afficher la longueur du tableau
        System.out.println(monTableau.length);

        // Afficher le dernier élément du tableau avec length
        System.out.println(monTableau.length -1);
        // Modifier la valeur index 4
        int modifierIndexTableau = monTableau[4];
        modifierIndexTableau = 8;
        System.out.println(modifierIndexTableau);
        };
    }


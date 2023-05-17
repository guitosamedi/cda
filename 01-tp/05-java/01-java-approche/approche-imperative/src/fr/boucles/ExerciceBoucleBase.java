package fr.boucles;

public class ExerciceBoucleBase {
    public static void main(String[] args) {

        // Afficher des entiers de 1 à 10
       for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Afficher mon nom 20 fois
        String me = " Guito Samedi";
        for (int i=0; i<20; ++i){
            System.out.println(me);
        }

        // Afficher les nombre pairs jusqu'à 100
        for (int i=2; i<=100; i=i+2){
            System.out.println(i);
        }

        // Afficher les nombre impairs jusqu'à 99
        for (int i=1; i<=99; i++){
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

    }
}

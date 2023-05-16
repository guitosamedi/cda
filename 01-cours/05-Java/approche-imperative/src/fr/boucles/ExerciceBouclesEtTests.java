package fr.boucles;

public class ExerciceBouclesEtTests {

    public static void main(String[] args) {
        int[] monTableau = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        // Afficher tableau dans une boucle
       for (int i =0; i<monTableau.length;i++) {
            System.out.println(monTableau[i]);
        }

        // Afficher ordre inversé
        for (int i=0; i< monTableau.length/2; i++){
            int monTableauInverse = monTableau[i];
            monTableau[i] = monTableau[monTableau.length - i - 1];
            monTableau[monTableau.length - i - 1] = monTableauInverse;

        }

        // Afficher tableau inversé
        for(int i = 0; i < monTableau.length; i++)
        {
            System.out.println(monTableau[i]);
        }
    }
}

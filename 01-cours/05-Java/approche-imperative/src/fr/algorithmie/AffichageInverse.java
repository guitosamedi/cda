package fr.algorithmie;

public class AffichageInverse {
    public static void main(String[] args) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        // Afficher tableau dans une boucle
        for (int i =0; i<array.length;i++) {
            System.out.println(array[i]);
        }
        // Afficher ordre inversé
        for (int i=0; i< array.length/2; i++){
            int array2 = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = array2;

        }

        // Afficher tableau inversé
        for(int i = 0; i < array.length; i++)
        {
            System.out.println("Le tableau inversé: " + array[i]);
        }

        // Afficher tableau copié
        for(int i = 0; i < array.length; i++)
        {

            int[] arrayCopy = new int[0];
            arrayCopy[i] = array[i];
            System.out.println("Le tableau copié: " + arrayCopy[i]);
        }

    }
}

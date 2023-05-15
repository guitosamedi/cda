package fr.declaration.variable;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class DeclarationApp {

    public static void main(String[] args) {
        byte b = 1;
        short s = 1746;
        int nombreDeStagiaire = 15;
        long populationMondial = 10000L;
        float f = 2.6F; // Rajouter le F ou f permet de considérer la donnée comme étant un Float 4 Octets max
        double d = 8.2D; // Double 8 Octets
        char c = 'C';
        boolean bo = false;
        String direBonjour = "Hello World !";

        System.out.println(b);
        System.out.println(s);
        System.out.println(nombreDeStagiaire);
        System.out.println(populationMondial);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(bo);
        System.out.println(direBonjour);
    }
}
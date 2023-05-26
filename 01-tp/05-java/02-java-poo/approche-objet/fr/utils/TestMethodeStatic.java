package fr.utils;

public class TestMethodeStatic {
    public static void main(String[] args) {
        String chaine = "44";
        int number =   Integer.parseInt(chaine);
        int a= 10;
        int b = 98;
        int afficherMax= Integer.max(a, b);
        int afficherMin= Integer.min(a, b);
        System.out.println(number);
        System.out.println(afficherMax);
        System.out.println(afficherMin);
    }
}

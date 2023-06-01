package fr.exceptions;

public class TestOperation {
    public static void main(String[] args) {
        try {
            double resultat = Operation.diviser(20, 1);
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.err.println(e.getMessage());
        }
    }
}

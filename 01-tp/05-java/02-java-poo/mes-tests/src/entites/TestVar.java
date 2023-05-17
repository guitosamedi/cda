package entites;

public class TestVar {
    public static void main(String[] args) {
        // variable local doit être initialisée
        int age; // Pas bon
        Personne adr;
       // System.out.println(age); // compilation Nok
        int age2 = 0; // Bon
        System.out.println(age2); // Compilation ok
    }
}

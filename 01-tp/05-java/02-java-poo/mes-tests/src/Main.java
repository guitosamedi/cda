import entites.Personne;
public class Main {
    public static void main(String[] args) {

        Personne p1 = new Personne("DUPONT", 30);
        System.out.println("Je suis " + p1.nom + " et j'ai " + p1.age + " ans");

    }
}
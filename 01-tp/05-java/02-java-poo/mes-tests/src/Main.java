import entites.Personne;
import general.Ville;

public class Main {
    public static void main(String[] args) {

        Personne p1 = new Personne("DUPONT", 30);
        //System.out.println("Je suis " + p1.nom + " et j'ai " + p1.age + " ans");
        Ville ville1 = new Ville("Marseille", 69 );
        Ville ville2 = new Ville("Paris", 100 );
        //System.out.println("" + ville1.compareTo(ville2));
        System.out.println ("Coucou".compareTo("Bonjour"));
    }
}
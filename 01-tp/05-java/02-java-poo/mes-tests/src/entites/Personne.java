package entites;

public class Personne {

    // Proriété de la classe
    public String nom;
    public int age;

    /* La méthode suivante est appelée à chaque fois
        on L'appelle un constructeur
     */
    public Personne(String nom, int age) {
        this.age = age; // => le this permet d'indiquer qu'on manipule une variable globale
        this.nom =nom;
    }
}

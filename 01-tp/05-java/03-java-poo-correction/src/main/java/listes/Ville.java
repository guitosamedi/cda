package listes;

import java.util.Comparator;
import java.util.Objects;

public class Ville implements Comparable<Ville> {
    private String nom;
    private int pop;

    public static int nbCommunes = 36000;
    public static final Ville PARIS = new Ville("Paris", 2500000);

    /**
     *
     * @param nom
     * @param pop
     */
    public Ville(String nom, int pop) {
        this.nom = nom;
        this.pop = pop;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Ville ville = (Ville) o;
        return pop == ville.pop && Objects.equals(nom, ville.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, pop);
    }

    /**
     * Cette méthode est super bien
     * @param x x
     * @param y y
     */
    public static void afficherNbDepartements(int x, int y){
        // Une méthode static a le droit d'utiliser d'autres méthodes static et des attributs statics.
    }

    @Override
    public int compareTo(Ville o) {
        // On utilise la méthode compareTo de la classe String
        // return this.nom.compareTo(o.getNom());

        if (this.pop > o.getPop()) {
            return 1;
        }
        else if (this.pop < o.getPop()){
            return -1;
        }
        return 0;
        //return this.pop - o.getPop();
    }

    public Ville(String nom) {
        this.nom = nom;
        this.pop = pop;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", pop=" + pop +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }

}

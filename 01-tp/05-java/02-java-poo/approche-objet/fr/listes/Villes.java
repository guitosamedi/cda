package fr.listes;

public class Villes implements Comparable<Villes>{
    private String nom;
    private int pop;

    public Villes(String nom, int pop) {
        this.nom = nom;
        this.pop = pop;
    }
    public Villes(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", pop=" + pop +
                '}';
    }

    @Override
    public int compareTo(Villes o) {
        return 0;
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
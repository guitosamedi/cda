package fr.listes;

public class Ville implements Comparable<Ville>{
    private String nom;
    private int hab;

    private Continent continent;

    public Ville(String nom, int hab, Continent continent) {
        this.nom = nom;
        this.hab = hab;
        this.continent = continent;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public Ville(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
               ", hab=" + hab +
                ", continent=" + continent +
                '}';
    }

    @Override
    public int compareTo(Ville o) {
       // return this.nom.compareTo(o.getNom());
        if (this.hab > o.getHab()) {
            return 1;
        }else if (this.hab < o.getHab()){
            return -1;
        }
        return 0;

        // Aussi possible en une ligne
       // return this.hab -o.getHab();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getHab() {
        return hab;
    }

    public void setHab(int hab) {
        this.hab = hab;
    }
}
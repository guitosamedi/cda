package fr.fichier;

public class Ville {
    private String nom;
    private int departement;
    private String region;
    private int population;

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", departement=" + departement +
                ", region='" + region + '\'' +
                ", population=" + population +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDepartement() {
        return departement;
    }

    public void setDepartement(int departement) {
        this.departement = departement;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}

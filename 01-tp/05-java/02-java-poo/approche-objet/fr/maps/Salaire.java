package fr.maps;

public class Salaire {
    private String nom;
    private double salaire;
    public Salaire(String nom, double salaire){
        this.nom = nom;
        this.salaire= salaire;
    }
    @Override
    public String toString() {
        return "Salaire{" +
                "nom='" + nom + '\'' +
                ", salaire=" + salaire +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }
}

package fr.maps;

public class Ville {
    private String nom;
    private int hab;

    public Ville (String nom, Integer hab){
        this.nom=nom;
        this.hab=hab;
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

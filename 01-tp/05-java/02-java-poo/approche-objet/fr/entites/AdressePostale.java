package fr.entites;

public class AdressePostale {
    int numeroRue;
    String libelleRue;
    int codePostal;
    String ville;

 // Attention l'ordre des paramètres du constructeur doit être respectée lors de l'appel
    public AdressePostale(int numeroRue, String libelleRue, int codePostal, String ville) {
        this.numeroRue = numeroRue;
        this.libelleRue = libelleRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }
}


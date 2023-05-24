package fr.banque;

public class Compte {
    //private double soldeCompte; // Mauvaise pratique ne pas suffixer le nom de la variable du nom de la Class
    private double solde;
    // private String numeroCompte; // Mauvaise pratique ne pas suffixer le nom de la variable du nom de la Class
    private String numero;
    public Compte(double soldeCompte, String numeroCompte){
        this.numero = numeroCompte;
        this.solde = soldeCompte;
    }

    // Redefinition de la méthode toString appartenant à la classe Object
    @Override
    public String toString() {
        return "Compte : " + "solde=" + solde + ", numero=" + numero;
    }

    public double getSoldeCompte() {
        return solde;
    }

    public void setSoldeCompte(double soldeCompte) {
        this.solde = soldeCompte;
    }

    public String getNumeroCompte() {
        return numero;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numero = numeroCompte;
    }
}

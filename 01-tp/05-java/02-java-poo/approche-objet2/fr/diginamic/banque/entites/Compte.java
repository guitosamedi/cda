package fr.diginamic.banque.entites;

public class Compte {
    private double soldeCompte;

    private int numeroCompte;

    public Compte(double soldeCompte, int numeroCompte){
        this.numeroCompte = numeroCompte;
        this.soldeCompte = soldeCompte;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "soldeCompte=" + soldeCompte +
                ", numeroCompte=" + numeroCompte +
                '}';
    }

    public double getSoldeCompte() {
        return soldeCompte;
    }

    public void setSoldeCompte(double soldeCompte) {
        this.soldeCompte = soldeCompte;
    }

    public long getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
    }
}

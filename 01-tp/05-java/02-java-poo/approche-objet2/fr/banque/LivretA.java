package fr.banque;

public class LivretA extends Compte {
    private double taux;

    // la classe mère a un constructeur !!! donc la classe fille doit contenir un constructeur qui appelle celui de la classe mere

    public LivretA(double soldeCompte, String numeroCompte, double tauxCompte){
      super(soldeCompte, numeroCompte); // appel du constructeur de la classe mère obligatoire
      this.taux= tauxCompte;
    }

    @Override
    public String toString() {
        // Appel toString() de la Classe mère
        String compte = super.toString();
        return compte + ", " + "taux=" + taux;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }
}

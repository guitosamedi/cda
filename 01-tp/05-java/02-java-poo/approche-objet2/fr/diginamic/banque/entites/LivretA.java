package fr.diginamic.banque.entites;

public class LivretA extends Compte {
    private double taux;

    // la classe mère a un constructeur !!! donc la classe fille doit contenir un constructeur qui appelle celui de la classe mere

    public LivretA(double soldeCompte, String numeroCompte, double taux){
      super(soldeCompte, numeroCompte); // appel du constructeur de la classe mère obligatoire
      this.taux= taux;
    }
}

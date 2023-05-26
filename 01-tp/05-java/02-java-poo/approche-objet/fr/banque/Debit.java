package fr.banque;

public class Debit extends Operation {
    public Debit(String date, double montant) {
        super(date, montant);
    }
    // penser à passer l'attribut montant de la classe Operation en protected
    public double recalculerSolde(double ancienSolde){
        return ancienSolde-montant;

        // on peut utiliser aussi la methode (getter/Setter) getMontant mais l'attribut montant de la classe Operation doit être en private
        // return ancienSolde-getMontant();
    }
    @Override
    public String getType() {
        return "DEBIT";
    }

}

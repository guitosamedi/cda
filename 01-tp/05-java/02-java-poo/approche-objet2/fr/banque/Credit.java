package fr.banque;

public class Credit extends Operation {
    public Credit(String date, double montant) {
        super(date, montant);
    }
    // Penser à passer l'attribut montant de la classe Operation en protected
    public double recalculerSolde(double ancienSolde){
        return ancienSolde+montant;
    }

    @Override
    public String getType() {
        return "CREDIT";
    }
}

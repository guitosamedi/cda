package fr.banque;

public abstract class Operation {
    private String date;
    protected double montant;

    public Operation (String date, double montant){
    this.date = date;
    this.montant = montant;
    }
    public abstract String getType();

    @Override
    public String toString() {
        return "Operation{" +
                "date='" + date + '\'' +
                ", montant=" + montant + ", type=" +getType() +
                '}';
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public abstract double recalculerSolde(double ancienSolde);

}

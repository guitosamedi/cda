package fr.banque;


public class CompteTaux extends Compte{

    private double remuneration;

    public CompteTaux(double soldeCompte, String numeroCompte, double remunerationCompte){
        super(soldeCompte, numeroCompte); // appel du constructeur de la classe mère obligatoire
        this.remuneration= remunerationCompte;
    }

    @Override
    public String toString() {
        // Appel toString() de la Classe mère
        String compte = super.toString();
        return  compte + ", " + "remuneration=" + remuneration;
    }

    public double getRemuneration() {
        return remuneration;
    }

    public void setRemuneration(double remuneration) {
        this.remuneration = remuneration;
    }
}

package fr.diginamic.banque.entites;


public class CompteTaux extends Compte{

    private double remuneration;

    public CompteTaux(double soldeCompte, String numeroCompte, double remuneration){
        super(soldeCompte, numeroCompte); // appel du constructeur de la classe mère obligatoire
        this.remuneration= remuneration;
    }

    @Override
    public String toString() {
        // Appel toString() de la Classe mère
        String compte = super.toString();
        return "Compte{" + compte + "" +
                "remuneration=" + remuneration +
                '}';
    }

}

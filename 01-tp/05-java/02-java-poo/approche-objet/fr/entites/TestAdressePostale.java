package fr.entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale adr1 = new AdressePostale(15, "rue de la Paix",75000, "Paris");
        AdressePostale adr2 = new AdressePostale(752, "Baker street",4444, "London");
        System.out.println("adresse 1 " + adr1.numeroRue +  adr1.libelleRue + adr1.codePostal + adr1.ville );
    }
}

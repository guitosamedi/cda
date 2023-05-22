package general;

/**
 * Class mère
 */
public abstract class Mammifere {

    //  ATTRIBUTS
    private String adn;
    public String espece;

    // CONSTRUCTEUR
    public Mammifere (String adn, String espece){
        this.adn = adn;
        this.espece = espece;
    }

    @Override
    public String toString() {
        return "Mammifere{" +
                "adn='" + adn + '\'' +
                ", espece='" + espece + '\'' +
                '}';
    }

    // METHODES GETTER SETTER
    public String getAdn() {
        return adn;
    }

    public void setAdn(String adn) {
        this.adn = adn;
    }

    public String getEspece() {
        return espece;
    }

    public void setEspece(String espece) {
        this.espece = espece;
    }
    //System.out.println(" Je suis un mammifère !");

}

package entites;

import entites.Personne;
public class GeterSeterTest {
    public String matricule;
    public String reference;
    public Personne personne;
    // Constructor hors de la methode main(
    public void Personne(String matricule, String reference, Personne personne) {
        this.matricule = matricule;
        this.reference = reference;
        this.personne = personne;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public static void main(String[] args) {


    }
}

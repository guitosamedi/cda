package entite2;

import entites.AdressePostale;

public class Personne {

        public String prenom;
        public String nom;
        public AdressePostale adresse;

        public Personne(String prenom, String nom) {

                this.prenom = prenom;
                this.nom = nom;
                this.adresse = adresse;
        }
        public Personne(String prenom, String nom, AdressePostale adresse) {
                this.prenom = prenom;
                this.nom = nom;
                this.adresse = adresse;
        }

        public void afficherPersonne(){
                Personne p2 = new Personne("Clint", "Eastwood", adresse);
                String firstName = p2.prenom;
                String lastName = p2.nom.toUpperCase();
                System.out.println(firstName + " " + lastName);
        }

        public void modifierNom(String lastName){
                this.nom=lastName;
        }

        public void modifierPrenom(String firstName){
                this.nom=firstName;
                //afficherPersonne();
                //System.out.println(lastName);
        }

        public void modifierAdresse(String AdressePostale ){
                this.adresse = adresse;
        }


}

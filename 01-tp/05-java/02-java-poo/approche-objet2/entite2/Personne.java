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


}

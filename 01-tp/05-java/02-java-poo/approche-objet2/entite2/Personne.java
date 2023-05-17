package entite2;

import entites.AdressePostale;

public class Personne {

        public String nom;
        public String prenom;
        public AdressePostale address;

        public Personne(String prenom, String nom, AdressePostale address) {
                this.nom = nom;
                this.prenom = prenom;
                this.address = address;
        }


}

package fr.entites;

public class Personne {

        public String prenom;
        public String nom;
        public AdressePostale adresse;

        /*
        public Personne(String prenom, String nom) {

                this.prenom = prenom;
                this.nom = nom;
                this.adresse = adresse;
        }*/

        public Personne(String prenom, String nom, AdressePostale adresse) {
                this.prenom = prenom;
                this.nom = nom;
                this.adresse = adresse;
        }

        public void afficherPersonne(){
                Personne p = new Personne("Clint", "Eastwood", adresse);
                String firstName = p.prenom;
                String lastName = p.nom.toUpperCase();
                System.out.println(firstName + " " + lastName);
        }

        public void modifierNom(String lastName){
                this.nom=lastName;
        }

        public void modifierPrenom(String firstName){this.nom=firstName;}

        public void modifierAdresse(AdressePostale adresse){
                this.adresse = adresse;
        }

        public String getNom() {
                return this.nom;
        }

}

package general;

public class Ville implements Comparable<Ville>{
    private int nbHabitants;
    private String nom;

    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    public int compareTo(Ville autre){
        if(this.nbHabitants > autre.nbHabitants){
            return 1;
        }
        if(this.nbHabitants < autre.nbHabitants){
            return -1;
        }

        return 0;
    }
/*
    private int nbHabitants() {
        return nbHabitants;
    }*/
}

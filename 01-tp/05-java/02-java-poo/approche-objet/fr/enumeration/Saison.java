package fr.enumeration;

public enum Saison {
    PRINTEMPS(1, "Printemps"),
    ETE(2,"Eté"),
    AUTOMNE(3,"Automne"),
    HIVER(4,"Hiver");
    private String label;
    private int index;

    private Saison(int index, String label) {
        this.index =index;
        this.label =label;
    }

    static Saison rechercheSaison(String libelle) {
        Saison[] saisons = Saison.values();
        //String message = "Aucun résultat"; // à voir pour afficher message erreur
        for (Saison saison : saisons) {
            if (saison.getLabel().equalsIgnoreCase(libelle)) {
                return saison;
            }

        }
        return null;
    }

    @Override
    public String toString() {
        return "Saison{" +
                "label='" + label + '\'' +
                ", index=" + index +
                '}';
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public float getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}

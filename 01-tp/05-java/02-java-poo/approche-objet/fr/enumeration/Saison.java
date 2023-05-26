package fr.enumeration;

public enum Saison {
    PRINTEMPS(1, "Printemps"),
    ETE(2,"Eté"),
    AUTOMNE(3,"Automne"),
    HIVER(4,"Hiver");
    private String label;
    private float index;

    private Saison(float index, String label) {
        this.index =index;
        this.label =label;
    }

    static Saison rechercheSaison(String libelle) {
        Saison[] saisons = Saison.values();
        //String message = "Aucun résultat"; // à voir message erreur
        for (Saison saison : saisons) {
            if (saison.getLabel().equalsIgnoreCase(libelle)) {
                return saison;
            }

        }
        return null;
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

    public void setIndex(float index) {
        this.index = index;
    }
}

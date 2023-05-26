package fr.listes;

public enum Continent {
    EUROPE("Europe"),
    AMERIQUE("Amérique"),
    AFRIQUE("Afrique"),
    ASIE("Asie"),

    OCEANIE("Océanie");
    private String label;

    private Continent(String label){
        this.label =label;
    }
}

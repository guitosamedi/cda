package fr.tri;

import fr.listes.Villes;
import java.util.Comparator;

public class VilleNomComparator implements Comparator<Villes> {
    @Override
    public int compare(Villes o1, Villes o2) {
        return o1.getNom().compareTo(o2.getNom());
    }
}
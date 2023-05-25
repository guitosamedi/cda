package fr.maps;

import java.util.HashMap;

public class CreationMap {
    public static <Iterator> void main(String[] args) {
        Salaire s1 = new Salaire("Paul", 1750);
        Salaire s2 = new Salaire("Hicham", 1825);
        Salaire s3 = new Salaire("Yu", 2250);
        Salaire s4 = new Salaire("Ingrid", 2015);
        Salaire s5 = new Salaire("Chantal", 2418);

        HashMap<String, Salaire> mapSalaires = new HashMap<>();;

        mapSalaires.put("1", s1);
        mapSalaires.put("2", s2);
        mapSalaires.put("3", s3);
        mapSalaires.put("4", s4);
        mapSalaires.put("5", s5);

        System.out.println(mapSalaires.size());
        System.out.println(mapSalaires);
        for (Salaire salaire : mapSalaires.values()){
            System.out.println(salaire);
        }

    }
}

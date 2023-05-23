package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//https://www.techiedelight.com/fr/join-two-lists-java/

public class FusionListe {
    public static void main(String[] args) {
        ArrayList<String> web = new ArrayList<>();
        web.add("Rouge");
        web.add("Vert");
        web.add("Bleu");

        ArrayList<String> print = new ArrayList<>();
        print.add("Cyan");
        print.add("Magenta");
        print.add("Jaune");
        print.add("Noir");

        // List Avec Stream et Collector
        List<String> colors = Stream.concat(web.stream(), print.stream()).collect(Collectors.toList());

        Iterator<String> liste = colors.iterator();
        while(liste.hasNext()){
            String Col = liste.next();
            System.out.println(Col);
        }

    }
}

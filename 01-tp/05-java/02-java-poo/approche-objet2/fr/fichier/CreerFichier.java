package fr.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:/recensement.csv");
        List<String> AllLines = Files.readAllLines(path, StandardCharsets.UTF_8);
        List<String> lines = new ArrayList<>();
        lines.add(lines.toString());
        String l = null;
        for (int i = 0; i<= 100; i++){
            l = lines.get(i);
            System.out.println(l);
         }

    }
}

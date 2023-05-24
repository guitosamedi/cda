package fr.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LectureFichier {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:/recensement.csv");
        boolean exists = Files.exists(path);
        boolean estFichier = Files.isRegularFile(path);
        boolean estLisible = Files.isReadable(path);
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        System.out.println("existe: " + exists + "fichier: " + exists + "lecture: " + exists);
        System.out.println("**************************************");
        // System.out.println(lines);
    }
}

package fr.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {
    public static void main(String[] args) throws IOException {

        Path pathSource = Paths.get("D:/recensement.csv");
        // --> Pas de Droits en écriture sur lecteur C: --> D:
        Path pathDestination = Paths.get("D:/new-recensement.csv");
        // On verifie si le fichier de destination existe
        boolean exists = Files.exists(pathDestination);

        System.out.println("Copie du fichier ===>");

        if(!exists){
            // Sinon oui on écrase
            System.out.println("J'existe pas !");
            //Files.move(pathSource, pathDestination, StandardCopyOption.REPLACE_EXISTING);
            Files.copy(pathSource, pathDestination);
        }

        List<String> AllLines = Files.readAllLines(pathSource, StandardCharsets.UTF_8);
        ArrayList<String> lines = new ArrayList<>(AllLines);

        for (int i = 0 ; i < 101 ; i++){
            System.out.println(lines.get(i));
            lines.add(lines.get(i));
        }
        // On utilise pas le même fichier donc pas d'APPEND nécessaire
        Files.write(pathDestination, lines, StandardOpenOption.APPEND);
    }
}

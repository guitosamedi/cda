package fr;

import fr.listes.Ville;

@FunctionalInterface
public interface Consumer {

    void exec(Ville v);
}
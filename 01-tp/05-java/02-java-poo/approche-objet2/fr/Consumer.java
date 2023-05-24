package fr;

import fr.listes.Villes;

@FunctionalInterface
public interface Consumer {

    void exec(Villes v);
}
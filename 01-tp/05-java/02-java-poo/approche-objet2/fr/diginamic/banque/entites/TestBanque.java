package fr.diginamic.banque.entites;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte c = new Compte(4566.45, "D4588888");
        System.out.println(c);
    }
}

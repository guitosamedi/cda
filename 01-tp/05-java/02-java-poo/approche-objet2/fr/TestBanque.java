package fr;

import fr.banque.Compte;
import fr.banque.LivretA;
import fr.banque.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {

        Compte c = new Compte(4566.45, "D4588888");
        Compte cl = new LivretA(4566.45, "D4588888", 3.40);
        CompteTaux ct = new CompteTaux(4566.45, "B4588888", 88.75);

        Compte[] comptes = new Compte[3];
        comptes[0] = c;
        comptes[1] = cl;
        comptes[2] = ct;

        //System.out.println(c);
        //System.out.println(cl);
        //System.out.println(ct);

        for (int i = 0; i < comptes.length; i++) {
            System.out.println(comptes[i]);
        }
    }
}

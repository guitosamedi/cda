package fr.diginamic.jdbc;
import java.sql.*;
import java.util.ResourceBundle;

import static fr.diginamic.jdbc.entites.Fournisseur.supprimerFournisseur;

public class TestDelete {
    private static final String DB_URL;
    private static final String DB_LOGIN;
    private static final String DB_PWD;

    static {
        ResourceBundle bundle = ResourceBundle.getBundle("db");
        DB_URL = bundle.getString("db.url");
        DB_LOGIN = bundle.getString("db.user");
        DB_PWD = bundle.getString("db.pwd");
    }
    public static void main(String[] args) throws SQLException {

        supprimerFournisseur(6);
    }
}

package fr.diginamic.jdbc;
import java.sql.*;
import java.util.ResourceBundle;
//package fr.diginamic.jdbc.resource.ConnectionDB;

import static fr.diginamic.jdbc.entites.Fournisseur.creerFournisseur;


public class TestInsertion {

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

        creerFournisseur("La Maison de la Peintures");
    }
}

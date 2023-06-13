package fr.digi.m0323;

import java.sql.*;
import java.util.ResourceBundle;

public class TestProperties {

    private static final String DB_URL;
    private static final String DB_LOGIN;
    private static final String DB_PWD;

    private int[] tab;

    static {
        ResourceBundle bundle = ResourceBundle.getBundle("db");
        DB_URL = bundle.getString("db.url");
        DB_LOGIN = bundle.getString("db.user");
        DB_PWD = bundle.getString("db.pwd");
    }

    public static void main(String[] args) {

//        creerFournisseur("Toto");
//        creerFournisseur("Titi");
//        creerFournisseur();
//        creerFournisseur();
//        modifierFournisseur();
        listerFournisseurs();
    }

    private static void creerFournisseur(String nomFournisseur) {

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PWD);
             Statement st = connection.createStatement()) {

            int nb = st.executeUpdate("INSERT INTO FOURNISSEUR (NOM) VALUES ('"+nomFournisseur+"')");
            System.out.println(nb);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void modifierFournisseur() {

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PWD);
             Statement st = connection.createStatement()) {
            int nb = st.executeUpdate("UPDATE FOURNISSEUR SET NOM = 'Sebsy Corporation 2' WHERE NOM = 'Sebsy Corporation'");
            System.out.println(nb);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void listerFournisseurs() {

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PWD);
             Statement st = connection.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM FOURNISSEUR")) {
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " - " + rs.getString("NOM"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}

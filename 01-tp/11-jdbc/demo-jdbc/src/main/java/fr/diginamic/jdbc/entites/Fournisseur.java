package fr.diginamic.jdbc.entites;

import java.sql.*;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Fournisseur {
    private static final String DB_URL;
    private static final String DB_LOGIN;
    private static final String DB_PWD;

    //private int[] tab;

    static {
        ResourceBundle bundle = ResourceBundle.getBundle("db");
        DB_URL = bundle.getString("db.url");
        DB_LOGIN = bundle.getString("db.user");
        DB_PWD = bundle.getString("db.pwd");
    }

    private String nom;
    private int id;

    public Fournisseur(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Fournisseur{" + ", id=" + id +
                "nom='" + nom + '\'' +
                '}';
    }

    public static void main(String[] args) throws SQLException {

        listerFournisseurs();
    }
    private static void listerFournisseurs() throws SQLException {

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PWD);

            Statement st = connection.createStatement()) {
            ResultSet curseur = st.executeQuery("SELECT * FROM FOURNISSEUR");
            ArrayList<Fournisseur> fournisseurs = new ArrayList<>();

                while (curseur.next()) {
                    Integer id= curseur.getInt("ID");
                    String nom= curseur.getString("NOM");
                    Fournisseur fournisseur = new Fournisseur(id, nom);
                    //System.out.println(fournisseur);
                }

            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
    }
    public static void creerFournisseur(String nomFournisseur) {

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PWD);

             Statement st = connection.createStatement()) {

            int nb = st.executeUpdate("INSERT INTO FOURNISSEUR (NOM) VALUES ('"+nomFournisseur+"')");
            System.out.println(nb);

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    public static void modifierFournisseur(int idFournisseur, String nomFournisseur) {

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PWD);
             Statement st = connection.createStatement()) {
            int nb = st.executeUpdate("UPDATE FOURNISSEUR SET NOM = '"+nomFournisseur+"' WHERE ID = '"+idFournisseur+"'");
            System.out.println(nb);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    public static void supprimerFournisseur(int idFournisseur) {

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PWD);
             Statement st = connection.createStatement()) {
            int nb = st.executeUpdate("DELETE FROM FOURNISSEUR WHERE ID = '"+idFournisseur+"'");
            System.out.println(nb);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}

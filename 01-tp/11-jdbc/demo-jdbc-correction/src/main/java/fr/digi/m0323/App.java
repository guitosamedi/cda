package fr.digi.m0323;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Hello world!
 */
public class App {


    private static final String DB_URL = "";
    private static final String DB_LOGIN = "root";
    private static final String DB_PWD = "ssy";
    public static void main(String[] args) {

        /*Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/digi", "root", "ssy");
            System.out.println(connection);

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
*/

        try(Connection cnx = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PWD)){
            System.out.println(cnx);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}

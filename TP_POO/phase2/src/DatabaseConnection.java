import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class DatabaseConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/gestion_educative";
        String user = "root";
        String password = "";

        System.out.println("Connecting to database...");

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected successfully!");

            String sql = "INSERT INTO etudiants (Apogee, Nom_etd, Prenom_etd, Email_etd) VALUES (?, ?, ?, ?)";


            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

                preparedStatement.setString(1, "123456");

                preparedStatement.setString(2, "Idrissi");

                preparedStatement.setString(3, "Sofia");

                preparedStatement.setString(4, "idr.sof12@gmail.com");

                int rowsAffected = preparedStatement.executeUpdate();

                System.out.println(rowsAffected + " row(s) inserted.");

            } catch (SQLException e) {

                System.out.println("Error while inserting data: " + e.getMessage());

            }

        } catch (SQLException e) {
            System.out.println("Error connecting to database: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
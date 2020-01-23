package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteUsers {
    public void deleteTestUsers() throws SQLException {
        String testUser = DataGiven.getTestUser();
        String secondTestUser = DataGiven.getSecondTestUser();
        String dbUrl = DataGiven.getDbUrl();
        String dbUser = DataGiven.getDbUser();
        String dbPass = DataGiven.getDbPass();

        String deleteVasyaCards = "DELETE FROM app.cards\n" +
                "WHERE user_id=(SELECT id FROM app.users WHERE login='" + testUser + "');";
        String deleteVasya = "DELETE FROM app.users WHERE login='" + testUser + "';";
        String deletePetya = "DELETE FROM app.users WHERE login='" + secondTestUser + "';";
        String deleteVasyaCodes = "DELETE FROM app.auth_codes\n" +
                "WHERE user_id = (SELECT id FROM app.users WHERE login='" + testUser + "');";
        Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
        Statement statement = conn.createStatement();
        statement.executeUpdate(deleteVasyaCards);
        statement.executeUpdate(deleteVasyaCodes);
        statement.executeUpdate(deleteVasya);
        statement.executeUpdate(deletePetya);
        conn.close();
    }
}
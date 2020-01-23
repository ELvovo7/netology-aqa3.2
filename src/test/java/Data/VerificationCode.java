package Data;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class VerificationCode {

    private VerificationCode() {
    }

    public static String getVerificationCode() throws SQLException {

        try (Connection conn = DriverManager.getConnection(DataGiven.getDbUrl(), DataGiven.getDbUser(), DataGiven.getDbPass())){
            Statement statement = conn.createStatement();
            String selectCode = "SELECT code FROM app.auth_codes\n" +
                    "WHERE user_id = (SELECT id FROM app.users WHERE login='" + DataGiven.getTestUser() + "')  ORDER BY created DESC LIMIT 1;";
            try (ResultSet resultSet = statement.executeQuery(selectCode)) {
                String code = "";
                while (resultSet.next()) {
                    code = resultSet.getString(1);
                }
                return code;
            }
        }
    }
}
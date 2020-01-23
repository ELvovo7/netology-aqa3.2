package test;

import Data.DataGiven;
import Data.DeleteUsers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.VerificationPage;

import java.sql.SQLException;

import static com.codeborne.selenide.Selenide.open;

public class LoginTest {

    @Test
    @DisplayName("Логин с валидными данными")
    void loginWithValidData() throws SQLException, ClassNotFoundException {
        open(DataGiven.getTestSite());
        LoginPage loginPage = new LoginPage();
        loginPage.validLogin();
        VerificationPage verificationPage = new VerificationPage();
        verificationPage.validVerify();
        DeleteUsers deleteUsers = new DeleteUsers();
        deleteUsers.deleteTestUsers();
    }
}
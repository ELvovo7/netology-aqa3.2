package pages;

import Data.DataGiven;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private SelenideElement loginField = $("[data-test-id=login] input");
    private SelenideElement passwordField = $("[data-test-id=password] input");
    private SelenideElement loginButton = $("[data-test-id=action-login]");

    public void validLogin() {
        loginField.setValue(DataGiven.getTestUser());
        passwordField.setValue(DataGiven.getTestUserPass());
        loginButton.click();
    }
}
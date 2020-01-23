package pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import Data.VerificationCode;

import java.sql.SQLException;

import static com.codeborne.selenide.Selenide.$;

public class VerificationPage {
    private SelenideElement codeField = $("[data-test-id=code] input");
    private SelenideElement verifyButton = $("[data-test-id=action-verify]");

    public VerificationPage() {
        codeField.shouldBe(Condition.visible);
    }

    public void validVerify() throws SQLException {
        codeField.setValue(VerificationCode.getVerificationCode());
        verifyButton.click();
    }
}
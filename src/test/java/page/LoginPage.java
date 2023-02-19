package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import data.DataHelper;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(css = "[data-test-id=login] input")
    private SelenideElement loginField;
    @FindBy(css = "[data-test-id=password] input")
    private SelenideElement passwordField;
    @FindBy(css = "[data-test-id=action-login]")
    private SelenideElement loginButton;
    @FindBy(css = "[data-test-id='error-notification']")
    private SelenideElement errorNotification;

    public void verifyErrorNotificationVisibility() {
        errorNotification.shouldBe(Condition.visible);
    }

    public VerificationPage validLogin(DataHelper.AuthInfo info) {
        loginField.setValue();
    }
}
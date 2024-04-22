import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegisterPage {
    private SelenideElement signUp = $(By.xpath ("//p[@class=\"link\"]/a[@href=\"/registration\"][1]"));
    private SelenideElement emailInput = $("[name=\"email\"]");
    private SelenideElement passwordInput = $("[name=\"password\"]");
    private SelenideElement confirmPassword = $("[name=\"confirmPassword\"]");
    private SelenideElement registerSubmit = $("[data-test=\"submit\"]");
    private SelenideElement userTypeDropdown = $("[value=\"user\"]");
    private SelenideElement adminTypeDropdown = $("[value=\"admin\"]");
    private SelenideElement iconPassword = $(By.xpath ("//label[1]//span[1]//img[1]"));
    private SelenideElement iconConfirmPassword = $(By.xpath ("//label[2]//img"));
    private SelenideElement contactUs = $(By.xpath ("//div[@class=\"user-info\"]//a[@href=\"/contact\"]"));
    private SelenideElement aboutUs = $(By.xpath ("//div[@class=\"user-info\"]//a[@href=\"/about\"]"));
    private SelenideElement textError = $(By.xpath ("//div[@class=\"container\"]/div"));
    private SelenideElement textErrorEmail = $(By.xpath ("//div[normalize-space()='Email cannot be empty']"));
    private SelenideElement textErrorPassword = $(By.xpath ("//div[normalize-space()='Password cannot be empty']"));
    private SelenideElement textErrorConfirmPassword = $(By.xpath ("//div[normalize-space()='Confirm password cannot be empty']"));

    public SelenideElement getTextErrorConfirmPassword() {
        return textErrorConfirmPassword;
    }

    public SelenideElement getTextErrorEmail() {
        return textErrorEmail;
    }

    public SelenideElement getTextErrorPassword() {
        return textErrorPassword;
    }

    public SelenideElement getTextError() {
        return textError;
    }

    public SelenideElement getContactUs() {
        return contactUs;
    }

    public SelenideElement getAboutUs() {
        return aboutUs;
    }

    public SelenideElement getIconConfirmPassword() {
        return iconConfirmPassword;
    }

    public SelenideElement getIconPassword() {
        return iconPassword;
    }

    public SelenideElement getRegisterSubmit() {
        return registerSubmit;
    }

    public SelenideElement getUserTypeDropdown() {
        return userTypeDropdown;
    }

    public SelenideElement getAdminTypeDropdown() {
        return adminTypeDropdown;
    }

    public SelenideElement getEmailInput() {
        return emailInput;
    }

    public SelenideElement getPasswordInput() {
        return passwordInput;
    }

    public SelenideElement getConfirmPassword() {
        return confirmPassword;
    }

    public SelenideElement getSignUp() {
        return signUp;
    }
}

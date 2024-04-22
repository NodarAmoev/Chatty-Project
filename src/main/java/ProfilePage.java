import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {
    private SelenideElement name = $("[name=\"name\"]");
    private SelenideElement surname = $("[name=\"surname\"]");
    private SelenideElement birthdate = $(By.id ("birthDate"));
    private SelenideElement phoneNumber = $("[name=\"phone\"]");
    private SelenideElement gender = $("[id=\"gender\"]");
    private SelenideElement female = $("[value=\"FEMALE\"] ");
    private SelenideElement male = $("[value=\"MALE\"]");
    private SelenideElement passwordChange = $("[name=\"password\"]");
    private SelenideElement inputOldPassword = $("[placeholder=\"Old password\"]");
    private SelenideElement inputNewPassword = $("[placeholder=\"New password\"]");
    private SelenideElement inputConfirmNewPassword = $("[placeholder=\"Confirm new password\"]");
    private SelenideElement inputSaveButton = $("[class=\"PasswordModal_pass_btn__eGL9h\"]");
    private SelenideElement inputSave = $("[type=\"submit\"]");
    private SelenideElement editButton = $("[data-test=\"post-header__plus\"]");
    private SelenideElement addPicture = $(By.xpath ("//img[@alt='Uploaded']"));
    private SelenideElement submitSave = $("[type=\"submit\"]");
    private SelenideElement checkName = $(By.xpath ("//div[@class=\"sidebar__section\"]//p"));

    public SelenideElement getAddPicture() {
        return addPicture;
    }

    public SelenideElement getCheckName() {
        return checkName;
    }

    public void clickEditButton(){
        editButton.click ();
    }

    public SelenideElement getInputSave() {
        return inputSave;
    }

    public SelenideElement getInputSaveButton() {
        return inputSaveButton;
    }

    public SelenideElement getInputOldPassword() {
        return inputOldPassword;
    }

    public SelenideElement getInputNewPassword() {
        return inputNewPassword;
    }

    public SelenideElement getInputConfirmNewPassword() {
        return inputConfirmNewPassword;
    }

    public SelenideElement getName() {
        return name;
    }
    public SelenideElement getSurname() {
        return surname;
    }

    public SelenideElement getBirthdate() {
        return birthdate;
    }

    public SelenideElement getPhoneNumber() {
        return phoneNumber;
    }

    public SelenideElement getGender() {
        return gender;
    }

    public SelenideElement getFemale() {
        return female;
    }

    public SelenideElement getMale() {
        return male;
    }

    public SelenideElement getPasswordChange() {
        return passwordChange;
    }
}

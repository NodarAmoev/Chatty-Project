import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class RegisterTest extends BaseTest {
    @Feature("User Registration")
    @DisplayName("Register With Valid Data")
    @Test
    @Description("This test verifies the registration process with User valid user data.")
    public void RegisterWithValidData(){
        registerPage.getSignUp ().click ();
        registerPage.getEmailInput ().setValue (Username);
        registerPage.getPasswordInput ().setValue (Password);
        registerPage.getConfirmPassword ().setValue (Password);
        registerPage.getUserTypeDropdown ().click ();
        registerPage.getRegisterSubmit ().click ();
        sleep(5000);
    }
    @Feature("User Registration")
    @DisplayName("Icon Password Button Is Clickable")
    @Test
    @Description("In this test we check that the icon password button is clickable.")
    public void iconPasswordButtonIsClickable(){
        registerPage.getSignUp ().click ();
        registerPage.getUserTypeDropdown ().click ();
        registerPage.getPasswordInput ().setValue (Password);
        registerPage.getConfirmPassword ().setValue (Password);
        registerPage.getIconPassword ().click ();
        registerPage.getIconConfirmPassword ().click ();
        sleep(3000);
    }
    @Feature("User Navigation")
    @DisplayName("Contact Us Is Clickable")
    @Test
    @Description("Check the contact us is clickable")
    public void contactUsClick(){
        registerPage.getSignUp ().click ();
        registerPage.getUserTypeDropdown ().click ();
        registerPage.getContactUs ().click ();
    }
    @Feature("User Navigation")
    @DisplayName("About Us Is Clickable")
    @Test
    @Description("Check the about us is clickable")
    public void aboutUsClick(){
        registerPage.getSignUp ().click ();
        registerPage.getUserTypeDropdown ().click ();
        registerPage.getAboutUs ().click ();
    }
    @Feature("User Navigation")
    @DisplayName("Contact Us And About Us Are Displayed")
    @Test
    @Description("Check the contact us and about us is Displayed")
    public void contactUsAndAboutUsIsDisplayed(){
        registerPage.getSignUp ().click ();
        registerPage.getUserTypeDropdown ().click ();
        registerPage.getContactUs ().shouldHave (Condition.visible);
        registerPage.getAboutUs ().shouldHave (Condition.visible);
    }

    @Feature("User Registration")
    @DisplayName("Attempted Registration With Existing Name")
    @Test
    @Description("Attempted registration with an existing name")
    public void testRegistrationWithExistingName() {
        registerPage.getSignUp ().click ();
        registerPage.getEmailInput ().setValue (Username);
        registerPage.getPasswordInput ().setValue (Password);
        registerPage.getConfirmPassword ().setValue (Password);
        registerPage.getUserTypeDropdown ().click ();
        registerPage.getRegisterSubmit ().click ();
        registerPage.getTextError ().shouldHave (Condition.text ("Email already exists!"));
        sleep(5000);
    }
    @Feature("User Registration")
    @DisplayName("Registration With Empty Field")
    @Test
    @Description("Registr with empty field")
    public void successWithEmptyField(){
        registerPage.getSignUp ().click ();
        registerPage.getUserTypeDropdown ().click ();
        registerPage.getTextErrorEmail ().shouldHave (Condition.text ("Email cannot be empty"));
        registerPage.getTextErrorPassword ().shouldHave (Condition.text ("Password cannot be empty"));
        registerPage.getTextErrorConfirmPassword ().shouldHave (Condition.text ("Confirm password cannot be empty"));
        sleep(3000);
    }
    @Feature("User Registration")
    @DisplayName("Registration With Empty Password Field")
    @Test
    @Description("Registration with empty password")
    public void emptyPasswordField(){
        registerPage.getSignUp ().click ();
        registerPage.getUserTypeDropdown ().click ();
        registerPage.getEmailInput ().setValue (Username);
        registerPage.getTextErrorPassword ().shouldHave (Condition.text ("Password cannot be empty"));
        registerPage.getTextErrorConfirmPassword ().shouldHave (Condition.text ("Confirm password cannot be empty"));
    }
    @Feature("User Registration")
    @DisplayName("Registration With Empty Confirm Password Field")
    @Test
    @Description("Registration with empty confirm password")
    public void emptyConfirmPasswordField(){
        registerPage.getSignUp ().click ();
        registerPage.getUserTypeDropdown ().click ();
        registerPage.getEmailInput ().setValue (Username);
        registerPage.getPasswordInput ().setValue (Password);
        registerPage.getTextErrorConfirmPassword ().shouldHave (Condition.text ("Confirm password cannot be empty"));
    }

// -----------------------------------------------------------------------------------------------------------------------------------------
    @Feature("Admin Registration")
    @DisplayName("Register With Valid Data")
    @Test
    @Description("This test verifies the registration process with Admin valid user data.")
    public void RegisterWithValidDataAdmin(){
        registerPage.getSignUp ().click ();
        registerPage.getAdminTypeDropdown ().click ();
        registerPage.getEmailInput ().setValue (adminUsername);
        registerPage.getPasswordInput ().setValue (adminPassword);
        registerPage.getConfirmPassword ().setValue (adminPassword);
        registerPage.getRegisterSubmit ().click ();
            sleep(5000);
    }

    @Feature("Admin Registration")
    @DisplayName("Icon Password Button Is Clickable")
    @Test
    @Description("In this test we check that the icon password button is clickable.")
    public void iconPasswordButtonIsClickableAdmin(){
        registerPage.getSignUp ().click ();
        registerPage.getAdminTypeDropdown ().click ();
        registerPage.getPasswordInput ().setValue (adminPassword);
        registerPage.getConfirmPassword ().setValue (adminPassword);
        registerPage.getIconPassword ().click ();
        registerPage.getIconConfirmPassword ().click ();
        sleep(3000);
    }
    @Feature("Admin Navigation")
    @DisplayName("Contact Us Is Clickable")
    @Test
    @Description("Check the contact us is clickable")
    public void contactUsClickAdmin(){
        registerPage.getSignUp ().click ();
        registerPage.getAdminTypeDropdown ().click ();
        registerPage.getContactUs ().click ();
    }
    @Feature("Admin Navigation")
    @DisplayName("About Us Is Clickable")
    @Test
    @Description("Check the about us is clickable")
    public void aboutUsClickAdmin(){
        registerPage.getSignUp ().click ();
        registerPage.getAdminTypeDropdown ().click ();
        registerPage.getAboutUs ().click ();
    }
    @Feature("Admin Navigation")
    @DisplayName("Contact Us And About Us Are Displayed")
    @Test
    @Description("Check the contact us and about us is Displayed")
    public void contactUsAndAboutUsIsDisplayedAdmin(){
        registerPage.getSignUp ().click ();
        registerPage.getAdminTypeDropdown ().click ();
        registerPage.getContactUs ().shouldHave (Condition.visible);
        registerPage.getAboutUs ().shouldHave (Condition.visible);
    }

    @Feature("Admin Registration")
    @DisplayName("Attempted Registration With Existing Name")
    @Test
    @Description("Attempted registration with an existing name")
    public void testRegistrationWithExistingNameAdmin() {
        registerPage.getSignUp ().click ();
        registerPage.getAdminTypeDropdown ().click ();
        registerPage.getEmailInput ().setValue (adminUsername);
        registerPage.getPasswordInput ().setValue (adminPassword);
        registerPage.getConfirmPassword ().setValue (adminPassword);
        registerPage.getRegisterSubmit ().click ();
        registerPage.getTextError ().shouldHave (Condition.text ("Email already exists!"));
        sleep(5000);
    }
    @Feature("Admin Registration")
    @DisplayName("Registration With Empty Field")
    @Test
    @Description("Registr with empty field")
    public void successWithEmptyFieldAdmin(){
        registerPage.getSignUp ().click ();
        registerPage.getAdminTypeDropdown ().click ();
        registerPage.getTextErrorEmail ().shouldHave (Condition.text ("Email cannot be empty"));
        registerPage.getTextErrorPassword ().shouldHave (Condition.text ("Password cannot be empty"));
        registerPage.getTextErrorConfirmPassword ().shouldHave (Condition.text ("Confirm password cannot be empty"));
        sleep(3000);
    }
    @Feature("Admin Registration")
    @DisplayName("Registration With Empty Password Field")
    @Test
    @Description("Registration with empty password")
    public void emptyPasswordFieldAdmin(){
        registerPage.getSignUp ().click ();
        registerPage.getAdminTypeDropdown ().click ();
        registerPage.getEmailInput ().setValue (adminUsername);
        registerPage.getTextErrorPassword ().shouldHave (Condition.text ("Password cannot be empty"));
        registerPage.getTextErrorConfirmPassword ().shouldHave (Condition.text ("Confirm password cannot be empty"));
    }
    @Feature("Admin Registration")
    @DisplayName("Registration With Empty Confirm Password Field")
    @Test
    @Description("Registration with empty confirm password")
    public void emptyConfirmPasswordFieldAdmin(){
        registerPage.getSignUp ().click ();
        registerPage.getAdminTypeDropdown ().click ();
        registerPage.getEmailInput ().setValue (adminUsername);
        registerPage.getPasswordInput ().setValue (adminPassword);
        registerPage.getTextErrorConfirmPassword ().shouldHave (Condition.text ("Confirm password cannot be empty"));
    }


}

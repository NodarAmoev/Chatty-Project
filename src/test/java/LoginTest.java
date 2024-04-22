import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.sleep;


public class LoginTest extends BaseTest {

    @Feature("Admin Login")
    @DisplayName("Success Login")
    @Test
    @Description("Successful Authorization with Admin")
    public void successWithValidDataAdmin(){
        loginPage.enterUserName (adminUsername);
        loginPage.enterPassword (adminPassword);
        loginPage.clickLoginButton ();
        headerPage.getChattyLogoTitle ().shouldHave (Condition.visible);
    }


    @Test
    @Feature("Admin Login")
    @DisplayName("Empty Username and Password")
    @Description("Check if login fails with empty username and password for Admin")
    public void emptyUsernameAndPasswordAdmin(){
        loginPage.enterUserName ("");
        loginPage.enterPassword ("");
        loginPage.clickLoginButton ();
    }

    @Test
    @Feature("Admin Login")
    @DisplayName("Success with Invalid Password")
    @Description("Check if login fails with invalid password for Admin")
    public void successWithInvalidPasswordAdmin(){
        loginPage.enterUserName (adminUsername);
        loginPage.enterPassword (adminInvalidPassword);
        loginPage.clickLoginButton ();
        loginPage.getErrorMessage ().setValue ("User not found. Please register.");
        sleep(10000);
    }

    @Test
    @Feature("Admin Login")
    @DisplayName("Success with Empty Username")
    @Description("Check if login fails with empty username for Admin")
    public void successWithEmptyUsernameAdmin(){
        loginPage.enterUserName ("");
        loginPage.enterPassword (adminPassword);
        loginPage.clickLoginButton ();
    }

    @Test
    @Feature("Admin Login")
    @DisplayName("Password Icon Visibility")
    @Description("Check if password toggle icon is visible for Admin")
    public void passwordIconVisibilityAdmin(){
        loginPage.enterPassword (adminPassword);
        loginPage.clickPasswordToggleIcon ();
    }

    @Test
    @Feature("Admin Login")
    @DisplayName("Password Displayed")
    @Description("Check if password is displayed for Admin")
    public void passwordIsDisplayedAdmin(){
        loginPage.getDisplayedPassword ().setValue ("Password");
    }



    @Feature ("User Login")
    @DisplayName ("Success Login")
    @Test@Description("Successful Authorization with User")
    public void successWithValidDataUser(){

        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();
    }

    @Test
    @Feature("User Login")
    @DisplayName("Empty Username and Password")
    @Description("Check if login fails with empty username and password for User")
    public void emptyUsernameAndPasswordUser(){
        loginPage.enterUserName ("");
        loginPage.enterPassword ("");
        loginPage.clickLoginButton ();
    }

    @Test
    @Feature("User Login")
    @DisplayName("Success with Invalid Password")
    @Description("Check if login fails with invalid password for User")
    public void successWithInvalidPasswordUser(){
        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();
        loginPage.getErrorMessage ().setValue ("User not found. Please register.");
        sleep(3000);
    }

    @Test
    @Feature("User Login")
    @DisplayName("Success with Empty Username")
    @Description("Check if login fails with empty username for User")
    public void successWithEmptyUsernameUser(){
        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();
    }

    @Test
    @Feature("User Login")
    @DisplayName("Password Icon Visibility")
    @Description("Check if password toggle icon is visible for User")
    public void passwordIconVisibilityUser(){
        loginPage.enterPassword (Password);
        loginPage.clickPasswordToggleIcon ();
    }

    @Test
    @Feature("User Login")
    @DisplayName("Password Displayed")
    @Description("Check if password is displayed for User")
    public void passwordIsDisplayedUser(){
        loginPage.getDisplayedPassword ().setValue ("Password");
    }

}

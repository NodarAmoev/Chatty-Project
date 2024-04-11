import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.io.File;
import java.io.StringReader;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

@Category(Smoke.class)
public class LoginTest extends BaseTest {

    @Feature("Admin Login")
    @DisplayName("Success Login")
    @Test
    @Description("Successful Authorization with Admin")
    public void successWithValidDataAdmin(){
        String Username = "amoev.nodari@gmail.com";
        String Password = "Nodari234";

        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();
        sleep (3000);
    }

    @Test
    public void emptyUsernameAndPasswordAdmin(){
        String Username = "";
        String Password = "";

        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();
    }

    @Test
    public void successWithInvalidPasswordAdmin(){
        String Username = "amoev.nodari@gmail.com";
        String Password = "Nodari23";

        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();
        loginPage.getErrorMessage ().setValue ("User not found. Please register.");
        sleep(10000);
    }

    @Test
    public void successWithEmptyUsernameAdmin(){
        String Username = "";
        String Password = "Nodari234";

        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();
    }

    @Test
    public void passwordIconVisibilityAdmin(){
        String Password = "Nodari234";

        loginPage.enterPassword (Password);
        loginPage.clickPasswordToggleIcon ();
    }

    @Test
    public void passwordIsDisplayedAdmin(){
        loginPage.getDisplayedPassword ().setValue ("Password");
    }



    @Feature ("User Login")
    @DisplayName ("Success Login")
    @Test@Description("Successful Authorization with User")
    public void successWithValidDataUser(){
        String Username = "nodari.amoev2@gmail.com";
        String Password = "Nodari234";

        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();
    }

    @Test
    public void emptyUsernameAndPasswordUser(){
        String Username = "";
        String Password = "";

        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();
    }

    @Test
    public void successWithInvalidPasswordUser(){
        String Username = "nodari.amoev@2gmail.com";
        String Password = "Nodari23";

        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();
        loginPage.getErrorMessage ().setValue ("User not found. Please register.");
        sleep(3000);
    }

    @Test
    public void successWithEmptyUsernameUser(){
        String Username = "";
        String Password = "Nodari234";

        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();
    }

    @Test
    public void passwordIconVisibilityUser(){
        String Password = "Nodari234";

        loginPage.enterPassword (Password);
        loginPage.clickPasswordToggleIcon ();
    }

    @Test
    public void passwordIsDisplayedUser(){
        loginPage.getDisplayedPassword ().setValue ("Password");
    }

}

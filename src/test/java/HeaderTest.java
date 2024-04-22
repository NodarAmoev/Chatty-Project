import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class HeaderTest extends BaseTest {

    @Test
    @Feature("Header Dropdown")
    @DisplayName("Click 'Your Profile'")
    @Description("Click 'Your Profile' from the header dropdown menu")
    public void clickTheYourProfile(){
        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        headerPage.clickHeaderUser ();
        headerPage.dropdownMenuYourProfileClick ();
        sleep(3000);
    }

    @Test
    @Feature("Header Dropdown")
    @DisplayName("Click 'My Drafts'")
    @Description("Click 'My Drafts' from the header dropdown menu")
    public void clickTheMyDrafts(){
        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        headerPage.clickHeaderUser ();
        headerPage.dropdownMenuMyDraftsClick ();
        sleep(3000);
    }

    @Test
    @Feature("Header Dropdown")
    @DisplayName("Click 'Logout'")
    @Description("Click 'Logout' from the header dropdown menu")
    public void clickTheLogout(){
        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        headerPage.clickHeaderUser ();
        headerPage.dropdownMenuLogoutClick ();
        sleep(3000);
    }


    @Test
    @Feature("Header Dropdown")
    @DisplayName("Click 'Your Profile' with Admin credentials")
    @Description("Click 'Your Profile' from the header dropdown menu with Admin credentials")
    public void clickTheYourProfileWithAdmin(){
        loginPage.enterUserName (adminUsername);
        loginPage.enterPassword (adminPassword);
        loginPage.clickLoginButton ();

        headerPage.clickHeaderUser ();
        headerPage.dropdownMenuYourProfileClick ();
        sleep(3000);
    }

    @Test
    @Feature("Header Dropdown")
    @DisplayName("Click 'My Drafts' with Admin credentials")
    @Description("Click 'My Drafts' from the header dropdown menu with Admin credentials")
    public void clickTheMyDraftsWithAdmin(){
        loginPage.enterUserName (adminUsername);
        loginPage.enterPassword (adminPassword);
        loginPage.clickLoginButton ();

        headerPage.clickHeaderUser ();
        headerPage.dropdownMenuMyDraftsClick ();
        sleep(3000);
    }

    @Test
    @Feature("Header Dropdown")
    @DisplayName("Click 'Admin Panel' with Admin credentials")
    @Description("Click 'Admin Panel' from the header dropdown menu with Admin credentials")
    public void clickTheAdminPanel(){
        loginPage.enterUserName (adminUsername);
        loginPage.enterPassword (adminPassword);
        loginPage.clickLoginButton ();


        headerPage.clickHeaderUser ();
        headerPage.getDropdownAdminPanel ().click ();
    }

    @Test
    @Feature("Header Dropdown")
    @DisplayName("Click 'Logout' with Admin credentials")
    @Description("Click 'Logout' from the header dropdown menu with Admin credentials")
    public void clickTheLogoutWithAdmin(){
        loginPage.enterUserName (adminUsername);
        loginPage.enterPassword (adminPassword);
        loginPage.clickLoginButton ();

        headerPage.clickHeaderUser ();
        headerPage.dropdownMenuLogoutClick ();
        sleep(3000);
    }
}

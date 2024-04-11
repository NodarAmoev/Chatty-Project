import org.junit.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class HeaderTest extends BaseTest {

    @Test
    public void clickTheYourProfile(){
        String Username = "nodari.amoev2@gmail.com";
        String Password = "Nodari234";

        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        headerPage.clickHeaderUser ();
        headerPage.dropdownMenuYourProfileClick ();
        sleep(3000);
    }

    @Test
    public void clickTheMyDrafts(){
        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        headerPage.clickHeaderUser ();
        headerPage.dropdownMenuMyDraftsClick ();
        sleep(3000);
    }

    @Test
    public void clickTheLogout(){
        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        headerPage.clickHeaderUser ();
        headerPage.dropdownMenuLogoutClick ();
        sleep(3000);
    }


    @Test
    public void clickTheYourProfileWithAdmin(){
        loginPage.enterUserName (adminUsername);
        loginPage.enterPassword (adminPassword);
        loginPage.clickLoginButton ();

        headerPage.clickHeaderUser ();
        headerPage.dropdownMenuYourProfileClick ();
        sleep(3000);
    }

    @Test
    public void clickTheMyDraftsWithAdmin(){
        loginPage.enterUserName (adminUsername);
        loginPage.enterPassword (adminPassword);
        loginPage.clickLoginButton ();

        headerPage.clickHeaderUser ();
        headerPage.dropdownMenuMyDraftsClick ();
        sleep(3000);
    }

    @Test
    public void clickTheAdminPanel(){
        loginPage.enterUserName (adminUsername);
        loginPage.enterPassword (adminPassword);
        loginPage.clickLoginButton ();


        headerPage.clickHeaderUser ();
        headerPage.getDropdownAdminPanel ().click ();
    }

    @Test
    public void clickTheLogoutWithAdmin(){
        loginPage.enterUserName (adminUsername);
        loginPage.enterPassword (adminPassword);
        loginPage.clickLoginButton ();

        headerPage.clickHeaderUser ();
        headerPage.dropdownMenuLogoutClick ();
        sleep(3000);
    }
}

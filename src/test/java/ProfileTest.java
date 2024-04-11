import org.junit.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class ProfileTest extends BaseTest {

    @Test
    public void changeProfileData(){
        String Username = "nodari.amoev2@gmail.com";
        String Password = "Nodari234";

        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        headerPage.clickHeaderUser ();
        headerPage.dropdownMenuYourProfileClick ();
        profilePage.clickEditButton ();
        profilePage.getName ().setValue ("Makarov");
        profilePage.getSurname ().setValue ("Kalashnikov");
        profilePage.getBirthdate ().click ();
        profilePage.getBirthdate ().setValue ("23.03.2001");
        profilePage.getPhoneNumber ().click ();
        profilePage.getPhoneNumber ().setValue ("4917631659655");
        profilePage.getGender ().click ();
        profilePage.getMale ().click ();
        profilePage.getInputSave ().click ();
        sleep(3000);
    }

    @Test
    public void emptyChangingProfile(){
        String Username = "nodari.amoev2@gmail.com";
        String Password = "Nodari234";

        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        headerPage.clickHeaderUser ();
        headerPage.dropdownMenuYourProfileClick ();
        profilePage.clickEditButton ();
        profilePage.getInputSave ().click ();
    }

    @Test
    public void passwordChange(){
        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        headerPage.clickHeaderUser ();
        headerPage.dropdownMenuYourProfileClick ();
        profilePage.clickEditButton ();
        profilePage.getPasswordChange ().click ();
        profilePage.getInputOldPassword ().setValue ("Nodari2345");
        profilePage.getInputNewPassword ().setValue ("Nodari234");
        profilePage.getInputConfirmNewPassword ().setValue ("Nodari234");
    }

    @Test
    public void logout(){
        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        headerPage.clickHeaderUser ();
        headerPage.dropdownMenuLogoutClick ();
    }



    @Test
    public void changeProfileDataWithAdmin(){
        loginPage.enterUserName (adminUsername);
        loginPage.enterPassword (adminPassword);
        loginPage.clickLoginButton ();

        headerPage.clickHeaderUser ();
        headerPage.dropdownMenuYourProfileClick ();
        profilePage.clickEditButton ();
        profilePage.getName ().setValue ("Makarov");
        profilePage.getSurname ().setValue ("Kalashnikov");
        profilePage.getBirthdate ().click ();
        profilePage.getBirthdate ().setValue ("23.03.2001");
        profilePage.getPhoneNumber ().click ();
        profilePage.getPhoneNumber ().setValue ("4917631659655");
        profilePage.getGender ().click ();
        profilePage.getMale ().click ();
        profilePage.getInputSave ().click ();
        sleep(3000);
    }
    @Test
    public void emptyChangingProfileWithAdmin(){
        loginPage.enterUserName (adminUsername);
        loginPage.enterPassword (adminPassword);
        loginPage.clickLoginButton ();

        headerPage.clickHeaderUser ();
        headerPage.dropdownMenuYourProfileClick ();
        profilePage.clickEditButton ();
        profilePage.getInputSave ().click ();
    }

    @Test
    public void passwordChangeWithAdmin(){
        loginPage.enterUserName (adminUsername);
        loginPage.enterPassword (adminPassword);
        loginPage.clickLoginButton ();

        headerPage.clickHeaderUser ();
        headerPage.dropdownMenuYourProfileClick ();
        profilePage.clickEditButton ();
        profilePage.getPasswordChange ().click ();
        profilePage.getInputOldPassword ().setValue ("Nodari2345");
        profilePage.getInputNewPassword ().setValue ("Nodari234");
        profilePage.getInputConfirmNewPassword ().setValue ("Nodari234");
    }

    @Test
    public void logoutWithAdmin(){
        loginPage.enterUserName (adminUsername);
        loginPage.enterPassword (adminPassword);
        loginPage.clickLoginButton ();

        headerPage.clickHeaderUser ();
        headerPage.dropdownMenuLogoutClick ();
    }


}

import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.Assert.assertEquals;
import static org.openqa.selenium.remote.tracing.EventAttribute.setValue;


public class HomePageTest extends BaseTest {

    @Feature("Success User with Login ")
    @DisplayName("Check if Home is displayed")
    @Test
    @Description("Check if it is present on the homepage")
    public void homeButtonIsDisplayed(){
        String Username = "nodari.amoev2@gmail.com";
        String Password = "Nodari234";

        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        homePage.getHomeButton ().isDisplayed ();
        sleep(3000);
    }

    @Test
    public void clickTheHomeButton(){
        String Username = "nodari.amoev2@gmail.com";
        String Password = "Nodari234";

        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        homePage.clickOnMyPost ();
        homePage.getHomeButton ().click ();
    }

    @Test
    public void aboutButtonIsDisplayed(){
        String Username = "nodari.amoev2@gmail.com";
        String Password = "Nodari234";


        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        homePage.getAboutButton ().shouldHave (Condition.visible);
    }

    @Test
    public void clickTheAboutButton(){
        String Username = "nodari.amoev2@gmail.com";
        String Password = "Nodari234";


        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        homePage.getAboutButton ().click ();
        homePage.getTextAboutChatty ().shouldHave (Condition.text ("About Chatty"));
    }

    @Test
    public void clickTheContactButton() {
        String Username = "nodari.amoev2@gmail.com";
        String Password = "Nodari234";

        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        homePage.getContactButton ().click ();
        homePage.contactUsIsDisplayed ();
    }

    @Test
    public void contactIsDisplayed(){
        String Username = "nodari.amoev2@gmail.com";
        String Password = "Nodari234";


        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        homePage.getContactButton ().shouldHave (Condition.visible);
    }

    @Test
    public void chattyLogoIsDisplayed(){
        String Username = "nodari.amoev2@gmail.com";
        String Password = "Nodari234";


        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        headerPage.getChattyLogoTitle ().shouldHave (Condition.visible);
    }

    @Test
    public void feedbackEmptyName(){
        String Username = "nodari.amoev2@gmail.com";
        String Password = "Nodari234";


        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        homePage.getContactButton ().click ();
        homePage.getEmailField ().setValue ("nodari.amoev2@gmail.com");
        homePage.getMessageField ().setValue ("Я обнаружил один баг ...");
        homePage.clickSendMessage ();
        assertEquals ("Заполните это поле.",homePage.getNameField ().getAttribute ("validationMessage"));
    }

    @Test
    public void feedbackEmptyEmail(){
        String Username = "nodari.amoev2@gmail.com";
        String Password = "Nodari234";


        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        homePage.getContactButton ().click ();
        homePage.getNameField ().setValue ("Amoev");
        homePage.getMessageField ().setValue ("Я обнаружил один баг ...");
        homePage.clickSendMessage ();
        assertEquals ("Заполните это поле.",homePage.getEmailField ().getAttribute ("validationMessage"));
    }
    @Test
    public void feedbackEmptyMessage(){
        String Username = "nodari.amoev2@gmail.com";
        String Password = "Nodari234";

        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        homePage.getContactButton ().click ();
        homePage.getNameField ().setValue ("Amoev");
        homePage.getEmailField ().setValue ("nodari.amoev2@gmail.com");
        homePage.clickSendMessage ();
        assertEquals ("Заполните это поле.",homePage.getMessageField ().getAttribute ("validationMessage"));
    }

    @Test
    public void feedbackFieldIsEmpty(){
        String Username = "nodari.amoev2@gmail.com";
        String Password = "Nodari234";

        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        homePage.getContactButton ().click ();
        homePage.getNameField ().setValue ("");
        homePage.getEmailField ().setValue ("");
        homePage.clickSendMessage ();
        assertEquals ("Заполните это поле.",homePage.getNameField ().getAttribute ("validationMessage"));
    }
    @Test
    public void feedbackFillInTheFields() {
        String Username = "nodari.amoev2@gmail.com";
        String Password = "Nodari234";


        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        homePage.getContactButton ().click ();
        homePage.contactUsIsDisplayed ();
        homePage.getNameField ().setValue ("Amoev");
        homePage.getEmailField ().setValue ("nodari.amoev2@gmail.com");
        homePage.getMessageField ().setValue ("кнопка Home не работает пожалуйста исправьте эту ошибку.");
        homePage.clickSendMessage ();
        homePage.getSuccessMessage ().shouldHave (Condition.text ("Feedback submitted successfully!"));
        sleep(3000);
    }

    @Feature("Success Admin with Login ")
    @DisplayName("Check if Home is displayed")
    @Test
    @Description("Check if it is present on the homepage")
    public void homeButtonIsDisplayedAdmin(){
        String Username = "amoev.nodari@gmail.com";
        String Password = "Nodari234";

        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        homePage.getHomeButton ().isDisplayed ();

    }

    @Test
    public void clickTheHomeButtonAdmin(){
        String Username = "amoev.nodari@gmail.com";
        String Password = "Nodari234";

        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();
        sleep(3000);
        homePage.getHomeButton ().click ();
    }

    @Test
    public void aboutButtonIsDisplayedAdmin(){
        String Username = "amoev.nodari@gmail.com";
        String Password = "Nodari234";


        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        homePage.getAboutButton ().shouldHave (Condition.visible);
    }

    @Test
    public void clickTheAboutButtonAdmin(){
        String Username = "amoev.nodari@gmail.com";
        String Password = "Nodari234";


        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        homePage.getAboutButton ().click ();
        homePage.getTextAboutChatty ().shouldHave (Condition.text ("About Chatty"));
    }

    @Test
    public void clickTheContactButtonAdmin() {
        String Username = "amoev.nodari@gmail.com";
        String Password = "Nodari234";


        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        homePage.getContactButton ().click ();
        homePage.contactUsIsDisplayed ();
        sleep(3000);
    }

    @Test
    public void contactIsDisplayedAdmin(){
        String Username = "amoev.nodari@gmail.com";
        String Password = "Nodari234";


        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        homePage.getContactButton ().shouldHave (Condition.visible);
    }

    @Test
    public void chattyLogoIsDisplayedAdmin(){
        String Username = "amoev.nodari@gmail.com";
        String Password = "Nodari234";


        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        headerPage.getChattyLogoTitle ().shouldHave (Condition.visible);
    }

    @Test
    public void feedbackEmptyNameAdmin(){
        String Username = "amoev.nodari@gmail.com";
        String Password = "Nodari234";


        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        homePage.getContactButton ().click ();
        homePage.getEmailField ().setValue ("amoev.nodari@gmail.com");
        homePage.getMessageField ().setValue ("Я обнаружил один баг ...");
        homePage.clickSendMessage ();
        assertEquals ("Заполните это поле.",homePage.getNameField ().getAttribute ("validationMessage"));
    }

    @Test
    public void feedbackEmptyEmailAdmin(){
        String Username = "amoev.nodari@gmail.com";
        String Password = "Nodari234";


        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        homePage.getContactButton ().click ();
        homePage.getNameField ().setValue ("Amoev");
        homePage.getMessageField ().setValue ("Я обнаружил один баг ...");
        homePage.clickSendMessage ();
        assertEquals ("Заполните это поле.",homePage.getEmailField ().getAttribute ("validationMessage"));
    }
    @Test
    public void feedbackEmptyMessageAdmin(){
        String Username = "amoev.nodari@gmail.com";
        String Password = "Nodari234";

        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        homePage.getContactButton ().click ();
        homePage.getNameField ().setValue ("Amoev");
        homePage.getEmailField ().setValue ("amoev.nodari@gmail.com");
        homePage.clickSendMessage ();
        assertEquals ("Заполните это поле.",homePage.getMessageField ().getAttribute ("validationMessage"));
    }

    @Test
    public void feedbackFieldIsEmptyAdmin(){
        String Username = "amoev.nodari@gmail.com";
        String Password = "Nodari234";

        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        homePage.getContactButton ().click ();
        homePage.getNameField ().setValue ("");
        homePage.getEmailField ().setValue ("");
        homePage.clickSendMessage ();
        assertEquals ("Заполните это поле.",homePage.getNameField ().getAttribute ("validationMessage"));
    }
    @Test
    public void feedbackFillInTheFieldsAdmin() {
        String Username = "amoev.nodari@gmail.com";
        String Password = "Nodari234";


        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        homePage.getContactButton ().click ();
        homePage.contactUsIsDisplayed ();
        homePage.getNameField ().setValue ("Amoev");
        homePage.getEmailField ().setValue ("amoev.nodari@gmail.com");
        homePage.getMessageField ().setValue ("кнопка Home не работает пожалуйста исправьте эту ошибку.");
        homePage.clickSendMessage ();
        homePage.getSuccessMessage ().shouldHave (Condition.text ("Feedback submitted successfully!"));
        sleep(3000);
    }

}

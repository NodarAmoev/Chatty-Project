import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.Assert.assertEquals;



public class HomePageTest extends BaseTest {

    @Feature("Success User with Login ")
    @DisplayName("Check if Home is displayed")
    @Test
    @Description("Check if it is present on the homepage")
    public void homeButtonIsDisplayed(){
        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        homePage.getHomeButton ().isDisplayed ();
        sleep(3000);
    }

    @Test
    @Feature("Success User with Login")
    @DisplayName("Click 'Home' button")
    @Description("Click 'Home' button from the homepage")
    public void clickTheHomeButton(){
        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        homePage.clickOnMyPost ();
        homePage.getHomeButton ().click ();
    }

    @Test
    @Feature("Success User with Login")
    @DisplayName("Check if 'About' button is displayed")
    @Description("Check if 'About' button is displayed on the homepage")
    public void aboutButtonIsDisplayed(){
        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        homePage.getAboutButton ().shouldHave (Condition.visible);
    }

    @Test
    @Feature("Success User with Login")
    @DisplayName("Click 'About' button")
    @Description("Click 'About' button from the homepage")
    public void clickTheAboutButton(){
        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        homePage.getAboutButton ().click ();
        homePage.getTextAboutChatty ().shouldHave (Condition.text ("About Chatty"));
    }

    @Test
    @Feature("Success User with Login")
    @DisplayName("Click 'Contact' button")
    @Description("Click 'Contact' button from the homepage")
    public void clickTheContactButton() {
        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        homePage.getContactButton ().click ();
        homePage.contactUsIsDisplayed ();
    }

    @Test
    @Feature("Success User with Login")
    @DisplayName("Check if 'Contact' button is displayed")
    @Description("Check if 'Contact' button is displayed on the homepage")
    public void contactIsDisplayed(){
        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        homePage.getContactButton ().shouldHave (Condition.visible);
    }

    @Test
    @Feature("Success User with Login")
    @DisplayName("Check if Chatty logo is displayed")
    @Description("Check if Chatty logo is displayed on the homepage")
    public void chattyLogoIsDisplayed(){
        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        headerPage.getChattyLogoTitle ().shouldHave (Condition.visible);
    }

    @Test
    @Feature("Success User with Login")
    @DisplayName("Feedback form validation: Empty Name")
    @Description("Check if feedback form shows validation message for empty Name field")
    public void feedbackEmptyName(){
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
    @Feature("Success User with Login")
    @DisplayName("Feedback form validation: Empty Email")
    @Description("Check if feedback form shows validation message for empty Email field")
    public void feedbackEmptyEmail(){
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
    @Feature("Success User with Login")
    @DisplayName("Feedback form validation: Empty Message")
    @Description("Check if feedback form shows validation message for empty Message field")
    public void feedbackEmptyMessage(){
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
    @Feature("Success User with Login")
    @DisplayName("Feedback form validation: Empty Fields")
    @Description("Check if feedback form shows validation message when all fields are empty")
    public void feedbackFieldIsEmpty(){
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
    @Feature("Success User with Login")
    @DisplayName("Feedback form submission")
    @Description("Check if feedback form can be submitted successfully")
    public void feedbackFillInTheFields() {
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



    @Feature("Success Admin with Login")
    @DisplayName("Check if Home is displayed for Admin")
    @Test
    @Description("Check if Home is displayed for Admin on the homepage")
    public void homeButtonIsDisplayedAdmin(){
        loginPage.enterUserName (adminUsername);
        loginPage.enterPassword (adminPassword);
        loginPage.clickLoginButton ();

        homePage.getHomeButton ().isDisplayed ();

    }

    @Test
    @Feature("Success Admin with Login")
    @DisplayName("Click 'Home' button")
    @Description("Click 'Home' button from the homepage")
    public void clickTheHomeButtonAdmin(){
        loginPage.enterUserName (adminUsername);
        loginPage.enterPassword (adminPassword);
        loginPage.clickLoginButton ();
        sleep(3000);
        homePage.getHomeButton ().click ();
    }

    @Test
    @Feature("Success Admin with Login")
    @DisplayName("Check if 'About' button is displayed")
    @Description("Check if 'About' button is displayed on the homepage")
    public void aboutButtonIsDisplayedAdmin(){
        loginPage.enterUserName (adminUsername);
        loginPage.enterPassword (adminPassword);
        loginPage.clickLoginButton ();

        homePage.getAboutButton ().shouldHave (Condition.visible);
    }

    @Test
    @Feature("Success Admin with Login")
    @DisplayName("Click 'About' button")
    @Description("Click 'About' button from the homepage")
    public void clickTheAboutButtonAdmin(){
        loginPage.enterUserName (adminUsername);
        loginPage.enterPassword (adminPassword);
        loginPage.clickLoginButton ();

        homePage.getAboutButton ().click ();
        homePage.getTextAboutChatty ().shouldHave (Condition.text ("About Chatty"));
    }

    @Test
    @Feature("Success Admin with Login")
    @DisplayName("Click 'Contact' button")
    @Description("Click 'Contact' button from the homepage")
    public void clickTheContactButtonAdmin() {
        loginPage.enterUserName (adminUsername);
        loginPage.enterPassword (adminPassword);
        loginPage.clickLoginButton ();

        homePage.getContactButton ().click ();
        homePage.contactUsIsDisplayed ();
        sleep(3000);
    }

    @Test
    @Feature("Success Admin with Login")
    @DisplayName("Check if 'Contact' button is displayed")
    @Description("Check if 'Contact' button is displayed on the homepage")
    public void contactIsDisplayedAdmin(){
        loginPage.enterUserName (adminUsername);
        loginPage.enterPassword (adminPassword);
        loginPage.clickLoginButton ();

        homePage.getContactButton ().shouldHave (Condition.visible);
    }

    @Test
    @Feature("Success Admin with Login")
    @DisplayName("Check if Chatty logo is displayed")
    @Description("Check if Chatty logo is displayed on the homepage")
    public void chattyLogoIsDisplayedAdmin(){
        loginPage.enterUserName (adminUsername);
        loginPage.enterPassword (adminPassword);
        loginPage.clickLoginButton ();

        headerPage.getChattyLogoTitle ().shouldHave (Condition.visible);
    }

    @Test
    @Feature("Success Admin with Login")
    @DisplayName("Feedback form validation: Empty Name")
    @Description("Check if feedback form shows validation message for empty Name field")
    public void feedbackEmptyNameAdmin(){
        loginPage.enterUserName (adminUsername);
        loginPage.enterPassword (adminPassword);
        loginPage.clickLoginButton ();

        homePage.getContactButton ().click ();
        homePage.getEmailField ().setValue ("amoev.nodari@gmail.com");
        homePage.getMessageField ().setValue ("Я обнаружил один баг ...");
        homePage.clickSendMessage ();
        assertEquals ("Заполните это поле.",homePage.getNameField ().getAttribute ("validationMessage"));
    }

    @Test
    @Feature("Success Admin with Login")
    @DisplayName("Feedback form validation: Empty Email")
    @Description("Check if feedback form shows validation message for empty Email field")
    public void feedbackEmptyEmailAdmin(){
        loginPage.enterUserName (adminUsername);
        loginPage.enterPassword (adminPassword);
        loginPage.clickLoginButton ();

        homePage.getContactButton ().click ();
        homePage.getNameField ().setValue ("Amoev");
        homePage.getMessageField ().setValue ("Я обнаружил один баг ...");
        homePage.clickSendMessage ();
        assertEquals ("Заполните это поле.",homePage.getEmailField ().getAttribute ("validationMessage"));
    }
    @Test
    @Feature("Success Admin with Login")
    @DisplayName("Feedback form validation: Empty Message")
    @Description("Check if feedback form shows validation message for empty Message field")
    public void feedbackEmptyMessageAdmin(){
        loginPage.enterUserName (adminUsername);
        loginPage.enterPassword (adminPassword);
        loginPage.clickLoginButton ();

        homePage.getContactButton ().click ();
        homePage.getNameField ().setValue ("Amoev");
        homePage.getEmailField ().setValue ("amoev.nodari@gmail.com");
        homePage.clickSendMessage ();
        assertEquals ("Заполните это поле.",homePage.getMessageField ().getAttribute ("validationMessage"));
    }

    @Test
    @Feature("Success Admin with Login")
    @DisplayName("Feedback form validation: Empty Fields")
    @Description("Check if feedback form shows validation message when all fields are empty")
    public void feedbackFieldIsEmptyAdmin(){
        loginPage.enterUserName (adminUsername);
        loginPage.enterPassword (adminPassword);
        loginPage.clickLoginButton ();

        homePage.getContactButton ().click ();
        homePage.getNameField ().setValue ("");
        homePage.getEmailField ().setValue ("");
        homePage.clickSendMessage ();
        assertEquals ("Заполните это поле.",homePage.getNameField ().getAttribute ("validationMessage"));
    }
    @Test
    @Feature("Success Admin with Login")
    @DisplayName("Feedback form submission")
    @Description("Check if feedback form can be submitted successfully")
    public void feedbackFillInTheFieldsAdmin() {
        loginPage.enterUserName (adminUsername);
        loginPage.enterPassword (adminPassword);
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

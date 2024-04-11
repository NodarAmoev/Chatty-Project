import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    // Просмотр чужого контента
    private SelenideElement viewPost = $("[data-test=\"post\"]:first-child");

    // Просмотр своих постов
    private SelenideElement myPostsFilterButton = $("[for=\"myPostsId\"]");

    // Редактирование постов
    private SelenideElement editButton = $("[data-test=\"edit-button\"]");


    // Посты на главно странице
    private SelenideElement post = $("[data-test=\"post\"]");

    // Удаления постов
    private SelenideElement deleteButton = $("[data-test=\"delete-button\"]");

    private SelenideElement homeButton = $("//a[normalize-space()='Home']");

    private SelenideElement aboutButton = $("[href=\"/about\"]");
    private SelenideElement textAboutChatty = $(By.xpath ("//h1[normalize-space()='About Chatty']"));
    private SelenideElement contactButton = $("[href=\"/contact\"]");
    private SelenideElement textContactUs = $(By.xpath ("//h1"));
    private SelenideElement nameField = $(By.id ("name"));
    private SelenideElement emailField = $(By.id ("email"));
    private SelenideElement messageField = $(By.id ("content"));
    private SelenideElement sendMessage = $("[type=\"submit\"]");
    private SelenideElement successMessage = $("[class=\"success-message\"]");



    public SelenideElement getSuccessMessage() {
        return successMessage;
    }

    public void clickSendMessage(){
        sendMessage.click ();
    }

    public SelenideElement getMessageField() {
        return messageField;
    }

    public SelenideElement getEmailField() {
        return emailField;
    }

    public SelenideElement getNameField() {
        return nameField;
    }

    public void contactUsIsDisplayed(){
        textContactUs.isDisplayed ();
    }


    public SelenideElement getContactButton() {
        return contactButton;
    }

    public SelenideElement getTextAboutChatty() {
        return textAboutChatty;
    }

    public SelenideElement getAboutButton() {
        return aboutButton;
    }

    public SelenideElement getHomeButton() {
        return homeButton;
    }

    public void clickDeleteButton(){
        deleteButton.click ();
    }

    public void clickOnPost(){
        post.click ();
    }



    public void clickEditButton(){
        editButton.click ();
    }
    public void clickOnMyPost(){
        myPostsFilterButton.click ();
    }

    public SelenideElement getViewPost() {
        return viewPost;
    }
}

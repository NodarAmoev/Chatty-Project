import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class PostPage {

    // Редактировать посты
    private SelenideElement createPostButton = $("[data-test=\"post-header__plus\"]");

    // Заголовок поста
    private SelenideElement titleInput = $("[placeholder=\"Title\"");

    // Описание поста
    private SelenideElement descriptionInput = $("[placeholder=\"Description\"]");

    // Комментарии поста
    private SelenideElement commentInput = $("[rows=\"3\"]");

    // Сохранить пост
    private SelenideElement submitButton =$("[type=\"submit\"]");

    // Добавить фотографии для поста
    private SelenideElement addPicture = $("[class=\"post_uploaded_image__7qSWV\"]");

    // Добавиления файла
    private SelenideElement fileInput = $("[type='file']");

    // Админ удаляет посты у Пользователей
    private SelenideElement adminDeleteUserPostButton =$(By.xpath ("//tbody/tr[2]/td[5]/span[2]/*[1]"));

    // Админ редактирует посты у Пользователей
    private SelenideElement adminEditingUserPostButton = $(By.xpath ("//table//tr[1]//span[1]"));


    // Админ меня Фамилию пользователя
    private SelenideElement editNamePost = $("[placeholder=\"Name\"]");

    // Админ меняет Имя пользователя
    private SelenideElement editSurnamePost = $("[placeholder=\"Surname\"]");

    // Сохраняет изменения постов у пользовате
    private SelenideElement saveButton = $("[data-test=\"profileSaveButton\"]");
    // Недавно Онлайн Пользователи Раздел
    private SelenideElement recentlyOnlineUsersSection = $(".suggestions__items");


    public SelenideElement getRecentlyOnlineUsersSection() {
        return recentlyOnlineUsersSection;
    }



    public void clickSaveButton(){
        saveButton.click ();
    }

    public SelenideElement getEditNamePost() {
        return editNamePost;
    }

    public SelenideElement getEditSurnamePost() {
        return editSurnamePost;
    }

    public void adminEditingUserPost(){
        adminEditingUserPostButton.click ();
    }
    public void adminDeletePostByUser(){
        adminDeleteUserPostButton.click ();
    }

    public void uploadAvatar (String filePath){
        fileInput.uploadFile(new File (filePath));
    }

    public void clickAddPicture(){
        addPicture.click ();
    }

    public void submit(){
        submitButton.click ();
    }

    public SelenideElement getCommentInput() {
        return commentInput;
    }

    public SelenideElement getDescriptionInput() {
        return descriptionInput;
    }

    public SelenideElement getTitleInput() {
        return titleInput;
    }

    public void clickCreatePost(){
        createPostButton.click ();
    }
}

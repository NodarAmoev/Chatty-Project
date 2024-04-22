import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import java.io.File;

import static com.codeborne.selenide.Selenide.sleep;

public class PostTest extends BaseTest{


    @Test
    @Description("Successful Post Creation after User Login")
    public void postCreate(){
        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        postPage.clickCreatePost ();
        postPage.getTitleInput ().setValue ("Этой мой первый пост");
        postPage.getDescriptionInput ().setValue ("В этом посте я хотел бы обсудить плюсы и минусы...");
        postPage.getCommentInput ().setValue ("Хочу на море очень хочу");
        homePage.clickOnMyPost ();
        postPage.submit ();
        homePage.getViewPost ().shouldHave (Condition.visible);
        sleep(3000);

    }

    @Test
    public void uploadAnImageInPngFormat(){
        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        postPage.clickCreatePost ();
        postPage.getTitleInput ().setValue ("Этой мой первый пост");
        postPage.getDescriptionInput ().setValue ("В этом посте я хотел бы обсудить плюсы и минусы...");
        postPage.getCommentInput ().setValue ("Хочу на море очень хочу");

        File avatarFile = new File ("C:\\Users\\NODO\\Downloads\\bafb763a54d1cd106a9493c2862ad757.png");
        postPage.clickAddPicture();
        postPage.uploadAvatar(avatarFile.getPath ());
        postPage.submit ();

    }

    @Test
    public void uploadAnImageInJPGFormat(){
        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        postPage.clickCreatePost ();
        postPage.getTitleInput ().setValue ("Этой мой первый пост");
        postPage.getDescriptionInput ().setValue ("В этом посте я хотел бы обсудить плюсы и минусы...");
        postPage.getCommentInput ().setValue ("При тестирование обязательно надо выпить Узбагоин он очень сильно узбагаивает");

        File avatarFile = new File ("C:\\Users\\NODO\\Downloads\\1380835674_706975784.jpg");
        postPage.clickAddPicture();
        postPage.uploadAvatar(avatarFile.getPath ());
        postPage.submit ();

    }

    @Test
    public void uploadAnImageInJPEGFormat(){
        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        postPage.clickCreatePost ();
        postPage.getTitleInput ().setValue ("Этой мой первый пост");
        postPage.getDescriptionInput ().setValue ("В этом посте я хотел бы обсудить плюсы и минусы...");
        postPage.getCommentInput ().setValue ("При тестирование обязательно надо выпить Узбагоин он очень сильно узбагаивает");

        File avatarFile = new File ("C:\\Users\\NODO\\Downloads\\yyGgeeQ4Wdo.jpeg");
        postPage.clickAddPicture();
        postPage.uploadAvatar(avatarFile.getPath ());
        postPage.submit ();

    }

    @Test
    public void addImageTwoMb(){
        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        postPage.clickCreatePost ();
        postPage.getTitleInput ().setValue ("Этой мой первый пост");
        postPage.getDescriptionInput ().setValue ("В этом посте я хотел бы обсудить плюсы и минусы...");
        postPage.getCommentInput ().setValue ("При тестирование обязательно надо выпить Узбагоин он очень сильно узбагаивает");

        File avatarFile = new File ("C:\\Users\\NODO\\Downloads\\imresizer-1711627607467.jpg");
        postPage.clickAddPicture();
        postPage.uploadAvatar(avatarFile.getPath ());
        postPage.submit ();
    }

    @Test
    public void viewSomeoneElsePost(){
        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        homePage.getViewPost ().click ();
        sleep (3000);
    }

    @Test
    public void EditingPost(){
        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();

        postPage.clickCreatePost ();
        postPage.getTitleInput ().setValue ("Этой мой первый пост");
        postPage.getDescriptionInput ().setValue ("В этом посте я хотел бы обсудить плюсы и минусы...");
        postPage.getCommentInput ().setValue ("При тестирование обязательно надо выпить Узбагоин он очень сильно узбагаивает");
        postPage.submit ();
        sleep(2000);
        homePage.clickOnMyPost ();
        homePage.clickOnPost ();
        homePage.clickEditButton ();

        postPage.getTitleInput ().setValue ("Этой мой первый пост");
        postPage.getDescriptionInput ().setValue ("Этой мой первый пост");
        postPage.getCommentInput ().setValue ("При sdsadsaтестирование обязательно надо выпить Узбагоин он очень сильно узбагаивает");
        postPage.submit ();
        sleep(6000);
    }
    @Test
    public void deletePost(){
        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();
        postPage.clickCreatePost ();
        postPage.getTitleInput ().setValue ("Этой мой первый пост");
        postPage.getDescriptionInput ().setValue ("В этом посте я хотел бы обсудить плюсы и минусы...");
        postPage.getCommentInput ().setValue ("При тестирование обязательно надо выпить Узбагоин он очень сильно узбагаивает");
        postPage.submit ();

        sleep (2000);
        homePage.clickOnMyPost ();
        homePage.getViewPost ().click ();
        homePage.clickDeleteButton ();

    }

    @Test
    public void uploadAnImageInPdfFormat(){
        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();
        postPage.clickCreatePost ();

        File avatarFile = new File ("C:\\Users\\NODO\\Downloads\\Dokument_24_03_2024_07_57_56.pdf");
        postPage.clickAddPicture();
        postPage.uploadAvatar(avatarFile.getPath ());
        postPage.submit ();
        sleep (3000);
    }

    @Test
    public void uploadAnImageInGifFormat(){
        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();
        postPage.clickCreatePost ();

        File avatarFile = new File ("C:\\Users\\NODO\\Downloads\\2GU.gif");
        postPage.uploadAvatar(avatarFile.getPath ());
        postPage.submit ();
        sleep (3000);
    }
    @Test
    public void selectAnImageLargerThan2MB(){
        loginPage.enterUserName (Username);
        loginPage.enterPassword (Password);
        loginPage.clickLoginButton ();
        postPage.clickCreatePost ();

        File avatarFile = new File ("C:\\Users\\NODO\\Downloads\\service_165276956603316991.jpg");
        postPage.uploadAvatar(avatarFile.getPath ());
        postPage.submit ();
        sleep (3000);
    }

    @Feature("View posts")
    @DisplayName("Prompting other people's posts")
    @Test
    @Description("Checking if other users' posts have been successfully viewed with Admin")
    public void viewSomeoneElsePostAdmin(){
        loginPage.enterUserName(adminUsername);
        loginPage.enterPassword(adminPassword);
        loginPage.clickLoginButton();

        headerPage.getChattyLogoTitle ().click ();
        homePage.getViewPost ().click ();

        sleep(3000);
    }

    @Test
    public void deletePostByUser(){
        loginPage.enterUserName(adminUsername);
        loginPage.enterPassword(adminPassword);
        loginPage.clickLoginButton();
        postPage.adminDeletePostByUser ();
    }
    @Test
    public void editingPostByUser(){
        loginPage.enterUserName(adminUsername);
        loginPage.enterPassword(adminPassword);
        loginPage.clickLoginButton();
        postPage.adminEditingUserPost ();
        profilePage.clickEditButton ();
        postPage.getEditNamePost ().setValue ("Filipp");
        postPage.getEditSurnamePost ().setValue ("Kirkorov");
        postPage.clickSaveButton ();
        sleep(3000);
    }

    @Test
    public void recentlyOnlineUsersSection(){
        loginPage.enterUserName(adminUsername);
        loginPage.enterPassword(adminPassword);
        loginPage.clickLoginButton();

        headerPage.getChattyLogoTitle ().click ();
        postPage.getRecentlyOnlineUsersSection ().shouldHave (Condition.visible);

        sleep (3000);
    }
}

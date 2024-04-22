import org.checkerframework.checker.units.qual.A;
import org.junit.After;
import org.junit.Before;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;


public class BaseTest {

    @Before
    public void setUp(){
        open("http://chatty.telran-edu.de:8089/login");
    }
    @After
    public void tearDown(){
        closeWebDriver ();
    }
    LoginPage loginPage = new LoginPage ();
    PostPage postPage = new PostPage ();
    HomePage homePage = new HomePage ();
    HeaderPage headerPage = new HeaderPage ();
    ProfilePage profilePage = new ProfilePage ();
    RegisterPage registerPage = new RegisterPage ();



    String Username = "nodari.amoev2@gmail.com";
    String Password = "Nodari234";
    String adminUsername = "amoev.nodari@gmail.com";

    String adminPassword = "Nodari234";

    String adminInvalidPassword = "Nodari23";


}

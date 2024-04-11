import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private SelenideElement userName = $("[data-test=\"email\"]");
    private SelenideElement password = $("[name=\"password\"]");
    private SelenideElement loginButton = $("[data-test=\"submit\"]");
    private SelenideElement clickIconPassword = $("[class=\"password-toggle-icon\"]");
    private SelenideElement displayedPassword = $("[class=\"input-password\"]");
    private SelenideElement errorMessage = $("class=\"text-error\"");

    // Отображаетс текст ошибки
    public SelenideElement getErrorMessage() {
        return errorMessage;
    }

    // Возвращает отображаемый элемент пароля
    public SelenideElement getDisplayedPassword() {
        return displayedPassword;
    }

    // Кликает по иконке "показать пароль"
    public void clickPasswordToggleIcon(){
        clickIconPassword.click ();
    }

    // Кликает по кнопке "Войти"
    public void clickLoginButton (){
        loginButton.click ();
    }

    // Вводит пароль
    public void enterPassword(String passwordValue){
        password.setValue (passwordValue);
    }

    // Вводит Логин
    public void enterUserName(String userNameValue){
        userName.setValue (userNameValue);
   }
}

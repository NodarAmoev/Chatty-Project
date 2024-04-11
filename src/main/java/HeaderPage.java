import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HeaderPage {

    // На странице присутсвует Header "Hello, nodari.amoev...! ▼"
    private SelenideElement headerUser = $("[class=\"header__user header__menu\"]");
    // dropdownMenuYourProfile, представляющей выпадающее меню "Your Profile"
    private SelenideElement dropdownMenuYourProfile = $(By.xpath ("//a[normalize-space()='Your Profile']"));
    // dropdownMenuMyDrafts, представляющей выпадающий пункт меню "My Drafts"
    private SelenideElement dropdownMenuMyDrafts = $(By.xpath ("//a[normalize-space()='My Drafts']"));
    // dropdownMenuLogout, представляющей выпадающий пункт меню "Logout"
    private SelenideElement dropdownMenuLogout = $(By.xpath ("//a[normalize-space()='Logout']"));
    //dropdownAdminPanel, представляющей элемент выпадающего меню для панели администратора
    private SelenideElement dropdownAdminPanel = $("[href=\"/users\"]");
    // chattyLogoTitle, представляющей заголовок логотипа Chatty
    private SelenideElement chattyLogoTitle = $("[class=\"header__logo\"]");


    public SelenideElement getDropdownAdminPanel() {
        return dropdownAdminPanel;
    }

    public SelenideElement getChattyLogoTitle() {
        return chattyLogoTitle;
    }



    public void dropdownMenuLogoutClick(){
        dropdownMenuLogout.click ();
    }
    public void dropdownMenuMyDraftsClick(){
        dropdownMenuMyDrafts.click ();
    }
    public void dropdownMenuYourProfileClick (){
        dropdownMenuYourProfile.click ();
    }

    public void clickHeaderUser(){
        headerUser.click ();
    }
}

package litecart.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class AdminMainPaige {

    public AdminMainPaige open() {
        Selenide.open("/admin");
        return this;
    }

    public AdminPage logout(){
        $(".fa.fa-sign-out.fa-lg").click();
        return new AdminPage();
    }

    public boolean logoutButtonIsDisplayed(){
        WebElement element  = $(".fa.fa-sign-out.fa-lg");
        element.getText();
        return element.isDisplayed();
    }

}

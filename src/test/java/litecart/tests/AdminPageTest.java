package litecart.tests;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import litecart.pages.AdminMainPaige;
import litecart.pages.AdminPage;
import litecart.pages.domain.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.title;
import static com.codeborne.selenide.WebDriverRunner.url;

public class AdminPageTest {

    @BeforeMethod
    public void setUp()  {
        ChromeDriverManager.getInstance().setup();
        Configuration.browser = "chrome";
        Configuration.baseUrl = "http://localhost/litecart";
    }

    @Test
    public void testLoginWithValidCredential(){
        User user  = new User("admin", "admin");
        Assert.assertTrue(
                new AdminPage()
                .open()
                .login(user)
                        .logoutButtonIsDisplayed());


    }

    @Test
    public void testLogoutFromMainAdminPage(){
        User user = new User("admin", "admin");
        new AdminMainPaige()
                .open()
                .logout();
    }


    @Test
    public void testAlertMessageTextOnIncorrectSignin(){
        Assert.assertEquals(new AdminPage().open()
                .getAlertText(),"×" + "\n" +"You must provide a username");
    }


}

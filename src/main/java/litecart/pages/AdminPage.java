package litecart.pages;

import com.codeborne.selenide.Selenide;
import litecart.pages.domain.User;

import static com.codeborne.selenide.Selenide.$;

public class AdminPage {



    public AdminPage open() {
        Selenide.open("/admin");
        return this;
    }

    public AdminMainPaige login(User user ){
        $("[name='username']").val(user.getLogin());
        $("[name='password']").val(user.getPassword());
        $("[type='submit']").click();
        return new AdminMainPaige();
    }

    public String getAlertText(){
        submitButtonClick();
        String alertText  = $(".alert.alert-danger").getText();
        return alertText;
    }

    public void submitButtonClick(){
        $("[type='submit']").click();
    }


}

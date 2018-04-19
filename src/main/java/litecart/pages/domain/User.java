package litecart.pages.domain;


import lombok.Data;

@Data
public class User {
    String login;
    String password;

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
}

package Mail;

import User.User;

import java.util.List;

/**
 * @author KAWAIISHY
 * @project Classes
 * @created 27.11.2022
 */
public class Recipient {
    private long id;

    private List<User> users;
    private String mail;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}

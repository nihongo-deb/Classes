package User;

import DataSource.DatabaseSource;
import DataSource.DatabaseTable;
import Mail.SendingMail;
import Securuty.Registration;

import java.util.List;

/**
 * @author KAWAIISHY
 * @project Classes
 * @created 15.02.2023
 */
public class Admin {
    private long admin_id;
    private String login;
    private char[] passwordHash;

    private Registration registration;

    private String name;
    private String surname;

    private List<User> users;
    private List<SendingMail> sendingMails;
    private List<DatabaseSource> databaseSources;
    private List<DatabaseTable> databaseTables;

    public boolean registerNewUser(String login, char[] password){
        return true;
    }

    public boolean addMailToUser(SendingMail newMail, long user_id){
        return true;
    }

    public boolean addDatabaseSourceAccessToUser(long database_source_id, long user_id){
        return true;
    }

    public boolean banUser(long user_id){
        return true;
    }
    public boolean deleteUser(long user_id){
        return true;
    }

    public boolean takeMailFromUer(long mail_id, long user_id){
        return true;
    }

    public boolean takeDatabaseSourceAccessFromUser(long database_source_id, long user_id){
        return true;
    }

    public List<SendingMail> getSendingMails() {
        return sendingMails;
    }

    public void setSendingMails(List<SendingMail> sendingMails) {
        this.sendingMails = sendingMails;
    }
}

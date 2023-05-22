package Securuty;
import Database.DAO;
import Database.UserDAO;

/**
 * @author KAWAIISHY
 * @project Classes
 * @created 15.02.2023
 */
public class Registration {
    private DAO database;
    private HashGenerator hashGenerator;

    public boolean register(String login, char[] password) {
        this.database = new UserDAO();
        char[] hash = this.hashGenerator.getHash(password);
        return false;
    }
}

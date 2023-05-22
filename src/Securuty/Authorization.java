package Securuty;

import Database.DAO;
import Database.UserDAO;

/**
 * @author KAWAIISHY
 * @project Classes
 * @created 15.02.2023
 */
public class Authorization {
    private DAO database;
    private HashGenerator hashGenerator;

    public boolean authorize(String login, char[] password) {
        this.database = new UserDAO();
        char[] hash = this.hashGenerator.getHash(password);
        if (this.database.get(hash) != null && this.database.get(login) != null)
            if (this.database.get(hash) == this.database.get(login))
                return true;

        return false;
    }
}

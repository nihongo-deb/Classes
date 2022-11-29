package Database;

import DataSource.DatabaseSource;
import DataSource.FileSource;
import Mail.MailBody;
import Mail.MailSubject;
import Mail.Recipient;
import User.User;
import User.TimeSettings;

import java.util.ArrayList;
import java.util.List;

/**
 * @author KAWAIISHY
 * @project Classes
 * @created 27.11.2022
 */
public class DatabaseAdapter implements Database{

    @Override
    public Object get(int id) {
        return null;
    }

    @Override
    public List<Object> getAll(Class c) {
        return null;
    }

    @Override
    public boolean put(Object entity) {
        return false;
    }

    @Override
    public boolean putList(List<Object> listOfEntities) {
        return false;
    }

    @Override
    public boolean update(Object entity) {
        return false;
    }

    @Override
    public boolean updateList(List<Object> listOfEntities) {
        return false;
    }

    @Override
    public boolean delete(Object entity) {
        return false;
    }

    @Override
    public boolean deleteList(List<Object> listOfEntities) {
        return false;
    }
}

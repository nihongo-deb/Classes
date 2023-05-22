package Database;

import User.User;

import java.util.List;

/**
 * @author KAWAIISHY
 * @project Classes
 * @created 15.02.2023
 */
public class UserDAO  implements DAO {
    @Override
    public User get(long id) {
        return null;
    }

    @Override
    public Object get(Object obj) {
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

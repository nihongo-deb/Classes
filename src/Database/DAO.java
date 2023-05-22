package Database;

import java.util.List;

/**
 * @author KAWAIISHY
 * @project Classes
 * @created 30.11.2022
 */
public interface DAO {
    Object get(long id);
    Object get(Object obj);
    List<Object> getAll(Class c);

    boolean put(Object entity);
    boolean putList(List<Object> listOfEntities);

    boolean update(Object entity);
    boolean updateList(List<Object> listOfEntities);

    boolean delete(Object entity);
    boolean deleteList(List<Object> listOfEntities);
}

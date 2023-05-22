package DataSource;

import java.util.List;

/**
 * @author KAWAIISHY
 * @project Classes
 * @created 27.11.2022
 */
public class DatabaseTable {
    private DatabaseSource databaseSource;

    private List<List<Object>> fields;

    public DatabaseSource getDatabaseSource() {
        return databaseSource;
    }

    public List<List<Object>> getFields() {
        return fields;
    }

    public void parse(){
    }
}

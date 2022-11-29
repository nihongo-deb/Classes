package DataSource;

import java.util.List;

/**
 * @author KAWAIISHY
 * @project Classes
 * @created 27.11.2022
 */
public class DatabaseSource {
    private long id;

    private String databaseUrl;
    private String databaseLogin;
    private String databasePassword;

    private List<DatabaseTable> databaseTables;
}

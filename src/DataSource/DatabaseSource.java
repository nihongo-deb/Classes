package DataSource;

import java.util.List;

/**
 * @author KAWAIISHY
 * @project Classes
 * @created 27.11.2022
 */
public class DatabaseSource {
    private long database_source_id;

    private String databaseUrl;
    private String databaseLogin;
    private String databasePassword;
    private String name;

    private List<DatabaseTable> databaseTables;

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }

    public String getDatabaseLogin() {
        return databaseLogin;
    }

    public void setDatabaseLogin(String databaseLogin) {
        this.databaseLogin = databaseLogin;
    }

    public String getDatabasePassword() {
        return databasePassword;
    }

    public void setDatabasePassword(String databasePassword) {
        this.databasePassword = databasePassword;
    }

    public void setDatabaseTables(List<DatabaseTable> databaseTables) {
        this.databaseTables = databaseTables;
    }

    public List<DatabaseTable> getDatabaseTables() {
        return databaseTables;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

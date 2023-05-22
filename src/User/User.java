package User;

import DataSource.DatabaseSource;
import DataSource.FileSource;
import Mail.SendingMail;
import Mail.Recipient;

import java.util.List;

/**
 * @author KAWAIISHY
 * @project Classes
 * @created 27.11.2022
 */
public class User {
    private long user_id;
    private String login;
    private char[] passwordHash;
    private String name;
    private String surname;
    private String position;

    private Sender senderSettings;

    private List<TimeSettings> timeSettings;
    private List<DatabaseSource> databaseSources;
    private List<FileSource> fileSources;
    private List<Recipient> recipients;
    private List<SendingMail> mails;

    public Sender getSenderSettings() {
        return senderSettings;
    }

    public void setSenderSettings(Sender senderSettings) {
        this.senderSettings = senderSettings;
    }

    public List<TimeSettings> getTimeSettings() {
        return timeSettings;
    }

    public void setTimeSettings(List<TimeSettings> timeSettings) {
        this.timeSettings = timeSettings;
    }

    public List<DatabaseSource> getDatabaseSources() {
        return databaseSources;
    }

    public void setDatabaseSources(List<DatabaseSource> databaseSources) {
        this.databaseSources = databaseSources;
    }

    public List<FileSource> getFileSources() {
        return fileSources;
    }

    public void setFileSources(List<FileSource> fileSources) {
        this.fileSources = fileSources;
    }

    public List<Recipient> getRecipients() {
        return recipients;
    }

    public void setRecipients(List<Recipient> recipients) {
        this.recipients = recipients;
    }

    public List<SendingMail> getMail() {
        return mails;
    }

    public void setMail(List<SendingMail> mails) {
        this.mails = mails;
    }
}

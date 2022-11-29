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
public class DatabaseAdapter {
    public boolean registerNewUser(User user){
        return false;
    }
    public boolean authorisation(User user){
        return false;
    }

    public DatabaseSource getDatabaseSource(User user){
        return new DatabaseSource();
    }

    public List<FileSource> getFileSource(User user){
        return new ArrayList<>();
    }
    public boolean addFileSource(FileSource fileSource){
        return false;
    }
    public boolean removeFileSource(FileSource fileSource){
        return false;
    }
    public boolean updateFileSource(FileSource fileSource){
        return false;
    }

    public List<MailBody> getMailBodiesByUser(User user){
        return new ArrayList<>();
    }
    public boolean addMailBody(MailBody mailBody){
        return false;
    }
    public boolean removeMailBody(MailBody mailBody){
        return false;
    }
    public boolean updateMailBody(MailBody mailBody){
        return false;
    }

    public List<MailBody> getMailSubjectsByUser(User user){
        return new ArrayList<>();
    }
    public boolean addMailSubject(MailSubject mailSubject){
        return false;
    }
    public boolean removeMailSubject(MailSubject mailSubject){
        return false;
    }
    public boolean updateMailSubject(MailSubject mailSubject){
        return false;
    }

    public List<Recipient> getRecipients(User user){
        return new ArrayList<>();
    }
    public boolean addRecipient(Recipient recipient){
        return false;
    }
    public boolean removeRecipient(Recipient recipient){
        return false;
    }
    public boolean updateRecipient(Recipient recipient){
        return false;
    }

    public List<TimeSettings> getTimeSettings(User user){
        return new ArrayList<>();
    }
    public boolean addTimeSettings(TimeSettings timeSettings){
        return false;
    }
    public boolean removeTimeSettings(TimeSettings timeSettings){
        return false;
    }
    public boolean updateTimeSettings(TimeSettings timeSettings){
        return false;
    }
}

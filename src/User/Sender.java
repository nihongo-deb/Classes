package User;

import Database.DatabaseAdapter;
import Mail.MailMessage;
import Validation.DateValidator;
import Validation.MailSettingsValidator;
import Validation.MailValidator;

/**
 * @author KAWAIISHY
 * @project Classes
 * @created 27.11.2022
 */
public class Sender {
    private User user;
    private DatabaseAdapter databaseAdapter;
    private ReportCreator reportCreator;
    private MailValidator mailValidator;
    private MailSettingsValidator mailSettingsValidator;
    private DateValidator dateValidator;
    private MailMessage mailMessage;

    public void send(){

    }
}

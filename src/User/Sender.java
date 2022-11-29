package User;

import Mail.Recipient;
import Validation.TimeSettingsValidator;
import Validation.MailValidator;

import java.util.List;

/**
 * @author KAWAIISHY
 * @project Classes
 * @created 27.11.2022
 */
public class Sender {
    private TimeSettingsValidator timeSettingsValidator;
    private MailValidator mailValidator;

    public boolean send(User user, List<Recipient> recipients, ReportCreator reportCreator){
        validateAll(user, recipients);
        return true;
    }

    private boolean validateAll(User user, List<Recipient> recipients){
        return true;
    }
}

package Mail;

/**
 * @author KAWAIISHY
 * @project Classes
 * @created 27.11.2022
 */
public class MailMessage {
    private long mail_massage_id;

    private MailBody mailBody;
    private MailSubject mailSubject;

    public MailBody getMailBody() {
        return mailBody;
    }

    public void setMailBody(MailBody mailBody) {
        this.mailBody = mailBody;
    }

    public MailSubject getMailSubject() {
        return mailSubject;
    }

    public void setMailSubject(MailSubject mailSubject) {
        this.mailSubject = mailSubject;
    }
}

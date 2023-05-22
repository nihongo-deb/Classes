package Mail;

import java.util.Properties;

/**
 * @author KAWAIISHY
 * @project Classes
 * @created 30.11.2022
 */
public class SendingMail {
    private long mail_id;
    private String mailAddress;
    private String host;
    private Properties properties;

    public SendingMail(String mailAddress, String host, Properties properties) {
        this.mailAddress = mailAddress;
        this.host = host;
        this.properties = properties;
    }
}

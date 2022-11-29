package Mail;

import java.util.Map;

/**
 * @author KAWAIISHY
 * @project Classes
 * @created 30.11.2022
 */
public class Mail {
    private String mailAddress;

    private Map<String, String> additionalParameters;

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public Map<String, String> getAdditionalParameters() {
        return additionalParameters;
    }

    public void setAdditionalParameters(Map<String, String> additionalParameters) {
        this.additionalParameters = additionalParameters;
    }
}

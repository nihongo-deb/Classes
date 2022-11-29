package Validation;

import Mail.Mail;

import java.text.DateFormat;
import java.util.Date;
import java.util.Map;

/**
 * @author KAWAIISHY
 * @project Classes
 * @created 27.11.2022
 */
public class TimeSettingsValidator implements Validator<Date, DateFormat>{
    private static Map<Date, DateFormat> validatingPatterns;

    @Override
    public boolean validate(Map<Date, DateFormat> validatingPatterns, Map<Date, DateFormat> validatedParams) {
        return false;
    }
}

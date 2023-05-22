package Validation;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author KAWAIISHY
 * @project Classes
 * @created 27.11.2022
 */
public class TimeSettingsValidator implements Validator<DateFormat, Date>{
    private static Map<DateFormat, Date> validatingPatterns;

    @Override
    public boolean validate(Map<DateFormat, Date> validatingPatterns, List<Date> validatedParams) {
        return false;
    }
}

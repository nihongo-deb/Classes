package Validation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author KAWAIISHY
 * @project Classes
 * @created 27.11.2022
 */
public class MailValidator implements Validator<String, String>{
    private static Map<String, String> validatingPatterns = new HashMap<>();
    private static void readKeysValuesFromProp(){

    }

    @Override
    public boolean validate(Map<String, String> validatingPatterns, List<String> validatedParams) {
        return false;
    }
}

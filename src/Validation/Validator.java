package Validation;

import Mail.Mail;

import java.util.Map;

/**
 * @author KAWAIISHY
 * @project Classes
 * @created 27.11.2022
 */
public interface Validator <K, V>{
    boolean validate(Map<K, V> validatingPatterns, Map<K, V> validatedParams);
}

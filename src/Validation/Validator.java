package Validation;

import java.util.List;
import java.util.Map;

/**
 * @author KAWAIISHY
 * @project Classes
 * @created 27.11.2022
 */
public interface Validator <K, V>{
    boolean validate(Map<K, V> validatingPatterns, List<V> validatedParams);
}

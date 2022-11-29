package User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author KAWAIISHY
 * @project Classes
 * @created 27.11.2022
 */
public class ReportCreator {
    public String createReport(User user, int timeSettingsId){
        TimeSettings userTimeSettings = user.getTimeSettings().get(timeSettingsId);
        findRows(userTimeSettings);
        return "";
    }

    private List<String> findRows(TimeSettings timeSettings){
        return new ArrayList<>();
    }
}

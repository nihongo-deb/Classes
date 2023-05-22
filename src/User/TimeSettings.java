package User;

import java.text.DateFormat;
import java.util.Date;

/**
 * @author KAWAIISHY
 * @project Classes
 * @created 27.11.2022
 */
public class TimeSettings {
    private long time_settings_id;
    private User user;

    private Date sendingTime;
    private Date period;
    private Date actuality;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getSendingTime() {
        return sendingTime;
    }

    public void setSendingTime(Date sendingTime) {
        this.sendingTime = sendingTime;
    }

    public Date getPeriod() {
        return period;
    }

    public void setPeriod(Date period) {
        this.period = period;
    }

    public Date getActuality() {
        return actuality;
    }

    public void setActuality(Date actuality) {
        this.actuality = actuality;
    }
}

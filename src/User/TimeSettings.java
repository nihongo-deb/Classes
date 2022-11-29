package User;

import java.text.DateFormat;
import java.util.Date;

/**
 * @author KAWAIISHY
 * @project Classes
 * @created 27.11.2022
 */
public class TimeSettings {
    private long id;
    private User user;

    private Date sendingTime;
    private DateFormat period;
    private DateFormat actuality;

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

    public DateFormat getPeriod() {
        return period;
    }

    public void setPeriod(DateFormat period) {
        this.period = period;
    }

    public DateFormat getActuality() {
        return actuality;
    }

    public void setActuality(DateFormat actuality) {
        this.actuality = actuality;
    }
}

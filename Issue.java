import java.util.Calendar;

public class Issue extends task {
    private String ment;
        public Issue(int duration, Calendar deadlineDate, String priority, String them, String responsible,
        String descroption, boolean isNotificationDeadline, String ment) {
        super(duration, deadlineDate, priority, them, responsible, descroption, isNotificationDeadline);
        this.ment = ment;
    }
    
}

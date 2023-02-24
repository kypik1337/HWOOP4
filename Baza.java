import java.util.Calendar;

public class Baza extends task {
    private String backSteps;
    public Baza(int duration, Calendar deadlineDate, String priority, String them, String responsible,
            String descroption, boolean isNotificationDeadline, String backSteps) {
        super(duration, deadlineDate, priority, them, responsible, descroption, isNotificationDeadline);
        this.backSteps = backSteps;
    }

}

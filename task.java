import java.util.Calendar;

public class task {
    private int duration;
    private Calendar deadlineDate;
    private String priority;
    private String them;
    private String responsible;
    private String descroption;
    private boolean isNotificationDeadline;
    public task(int duration, Calendar deadlineDate, String priority, String them, String responsible,
            String descroption, boolean isNotificationDeadline) {
        this.duration = duration;
        this.deadlineDate = deadlineDate;
        this.priority = priority;
        this.them = them;
        this.responsible = responsible;
        this.descroption = descroption;
        this.isNotificationDeadline = isNotificationDeadline;
    }

    public void setNotificationDeadline(){
        isNotificationDeadline = true;
        System.out.println("уведомление о дедлайне " + them + " ВКЛ");
    }
    public void setNotificationDeadlineOff(){
        isNotificationDeadline = false;
        System.out.println("уведомление о дедлайне " + them + " ВыКЛ");
    }

    public Calendar getCalendarDate(){
        return deadlineDate;
    }

    public String getThem(){
        return them;
    }

    public void deadlineNotification(Calendar date2) {
        if (isNotificationDeadline) {
            String[] differentDate = getDifference(date2);
            int day = Integer.parseInt(differentDate[0]);
            int month = Integer.parseInt(differentDate[1]);
            int year = Integer.parseInt(differentDate[2]);
            if (month <= 0 && year <= 0) {
                if (day == 3) {
                    System.out.println("Внимание! По задаче \"" + them + "\" дедлайн через 3 дня.");
                } else if (day == 2) {
                    System.out.println("Внимание! По задаче \"" + them + "\" дедлайн через 2 дня.");
                } else if (day == 1) {
                    System.out.println("Внимание! По задаче \"" + them + "\" дедлайн через 1 день.");
                } else if (day == 0) {
                    System.out.println("Внимание! По задаче \"" + them + "\" дедлайн сегодня.");
                } else if (day < 0) {
                    System.out.println("Внимание! По задаче \"" + them + "\" дедлайн просрочен на "
                            + day * -1 + " дня(дней).");
                }
            }
        }
    }


    private String[] getDifference(Calendar date2) {
        Calendar date1 = this.deadlineDate;
        String stringBuilder = (date1.get(Calendar.DATE) - date2.get(Calendar.DATE)) +
                "/" +
                (date1.get(Calendar.MONTH) - date2.get(Calendar.MONTH)) +
                "/" +
                (date1.get(Calendar.YEAR) - date2.get(Calendar.YEAR));
        return stringBuilder.split("/");
    }

	public Object getDeadlineDate() {
		return null;
	}

    
}

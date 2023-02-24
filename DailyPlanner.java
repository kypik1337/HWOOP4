import java.util.LinkedList;
import java.util.Scanner;

public class DailyPlanner {
    Scanner scanner = new Scanner(System.in);
    private LinkedList<task> taskList = new LinkedList<>();

    public DailyPlanner() {
    }

    // Добавляет новую задачу если она не пересекается по времени иначе выдает сообщение и спрашивает продолжение
    public void addTask(task task) {
        if (taskList.isEmpty()) {
            taskList.add(task);
        } else {
            for (int i = 0; i < taskList.size(); i++) {
                if (taskList.get(i).getDeadlineDate().equals(task.getDeadlineDate())) {
                    System.out.println("Внимание! " + taskList.get(i).getThem()
                            + " пересекается по времени с текущей!");
                }
            }
            System.out.println("Вы уверены что хотите продолжить? Введите Y для продолжения N для отмены.");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                taskList.add(task);
            } else {
                System.out.println("Задача не была добавлена в список.");
            }
        }
    }

    // удаляет задачу из списка
    public void removeTask(task task) {
        taskList.remove(task);
    }
}

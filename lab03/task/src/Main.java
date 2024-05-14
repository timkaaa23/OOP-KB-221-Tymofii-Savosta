import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserStory userStory1 = new UserStory(1, 1, "Реєстрація користувача", new ArrayList<>());
        UserStory userStory2 = new UserStory(2, 3, "Вхід користувача", new ArrayList<>());
        UserStory userStory3 = new UserStory(3, 1, "Реєстрация користувача", new ArrayList<>());

        Bug bug1 = Bug.createBug(1, "Помилка валідації паролю", 2, userStory1);
        Bug bug2 = Bug.createBug(2, "Неправильний пароль", 2, userStory2);
        Bug bug3 = Bug.createBug(3, "Електронна адреса вже використовуюється", 1, userStory3);

        Sprint sprint = new Sprint(10, 5);

        sprint.addUserStory(userStory1);
        sprint.addUserStory(userStory2);
        sprint.addBug(bug3);
        sprint.addBug(bug1);
        sprint.addBug(bug2);

        List<Ticket> sprintTickets = sprint.getTickets();
        System.out.println("Тікети у спринті:");
        for (Ticket ticket : sprintTickets) {
            if (ticket instanceof UserStory) {
                System.out.println("User Story: " + ticket.getName());
            } else if (ticket instanceof Bug) {
                System.out.println("Bug: " + ticket.getName());
            }
        }

        System.out.println("Загальна оцінка часу виконання: " + sprint.getTotalEstimate() + " год.");
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Уведіть рахунок: ");
        double bill = scanner.nextDouble();
        System.out.print("Уведіть кількість друзів: ");
        double friend = scanner.nextDouble();

        if(friend <= 0 || bill <= 0)
            System.out.printf("Ви ввели неправильне число!");

        else{
            double result = (bill / friend) + ((bill /friend) * 0.1);
            result = Math.round(result * 100.0) / 100.0;
            System.out.printf("Рахунок: " + bill + "\nКількість друзів: " + friend + "\nРезультат: " + result);
        }
    }
}
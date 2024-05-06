import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter numbers: ");
        String nums = scanner.nextLine();

        if (nums.length() != 0){
            String[] numsList = nums.split("\\s+");

            double sum = 0;
            double counter = 0;

            for (String num : numsList) {
                double number = Double.parseDouble(num);
                if (number == 0)
                    break;
                counter += 1;
                sum += number;

            }
            double result = sum / counter;
            System.out.printf("Average: " + result);
        }
        else
            System.out.println("You have not entered any numbers!");
    }
}

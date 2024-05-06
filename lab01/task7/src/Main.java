import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter numbers: ");
        String nums = scanner.nextLine();

        if (nums.length() != 0){
            String[] numsList = nums.split("\\s+0\\s+");
            int max = Integer.MIN_VALUE;

            for (String num : numsList) {
                int number = Integer.parseInt(num);

                if (number == 0)
                    break;

                if (number > max)
                    max = number;
            }
            System.out.printf("Max number: " + max);
        }
        else
            System.out.println("You have not entered any numbers!");
    }
}

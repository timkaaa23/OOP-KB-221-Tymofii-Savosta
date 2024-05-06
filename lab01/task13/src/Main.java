import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter numbers: ");
        String[] numbers = scanner.nextLine().split("\\s+");
        System.out.print(removeLocalMaxima(numbers));
    }
    public static List<Integer> removeLocalMaxima(String[] nums) {
        List<Integer> numbersList = new ArrayList<>();
        for (int i = 0; i <= nums.length - 1; i++) {
            int current = Integer.parseInt(nums[i]);
            int prev;
            int next;

            if ( i == 0)
                prev = current;
            else
                prev = Integer.parseInt(nums[i - 1]);
            if (i == nums.length - 1)
                next = current;
            else
                next = Integer.parseInt(nums[i + 1]);

            if((current <= prev || current <= next) && (i != 0 || i == nums.length - 1))
                numbersList.add(current);
        }
        return numbersList;
    }
}
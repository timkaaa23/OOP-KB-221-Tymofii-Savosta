import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numbers: ");
        String nums = scanner.nextLine();
        String[] strNumsList = nums.split(" ");
        int[] numList = new int[strNumsList.length];

        for (int i = 1; i < strNumsList.length; i++) {
            numList[i] = Integer.parseInt(strNumsList[i]);
        }

        int maxValue = max(numList);
        System.out.println(maxValue);
    }

    public static int max(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
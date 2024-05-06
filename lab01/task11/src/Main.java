import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numbers: ");
        String nums = scanner.nextLine();
        String[] strNumsList = nums.split(" ");
        int[] numList = new int[strNumsList.length];

        if (!strNumsList[0].equals("")){
            for (int i = 0; i < strNumsList.length; i++) {
                numList[i] = Integer.parseInt(strNumsList[i]);
            }
        }
        else {
            System.out.println(0);
            return;
        }
        
        int sum = sum(numList);
        System.out.println(sum);
    }

    public static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
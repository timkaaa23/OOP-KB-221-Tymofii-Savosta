import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter numbers: ");
        String numbers = scanner.nextLine();

        String[] numList = numbers.split(" ");
        int[] intNumList = new int[numList.length];
        String[] resultList = new String[numList.length];

        for (int i = 0; i < numList.length; i++) {
            intNumList[i] = Integer.parseInt(numList[i]);
        }

        for (int i = 2; i < intNumList.length; i++) {
            if(intNumList[i - 2] + intNumList[i - 1] == intNumList[i]) {
                resultList[i] = "True";
            }
        }
        for(int i = 0; i < resultList.length; i++){
            if(resultList[i] != "True")
                resultList[i] = "False";
        }
        System.out.printf(Arrays.toString(resultList));
    }
}
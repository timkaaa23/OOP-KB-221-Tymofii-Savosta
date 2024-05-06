import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanncer = new Scanner(System.in);

        System.out.printf("Enter numbers: ");
        String nums = scanncer.nextLine();
        String[] numsList = nums.split(" ");

        if(numsList.length == 3) {
            double a = Double.parseDouble(numsList[0]);
            double b = Double.parseDouble(numsList[1]);
            double c = Double.parseDouble(numsList[2]);

            double D = b * b - 4 * a * c;

            if (D < 0)
                System.out.println("no roots");
            else if(D == 0){
                double result = -b / (2 * a);
                System.out.println("Result: "+ result);
            }

            else{
                double result1 = (-b - Math.pow(D, 0.5)) / (2 * a);
                double result2 = (-b + Math.pow(D, 0.5)) / (2 * a);
                System.out.print("Result: " + result1 + ", " + result2);
            }
        }
    }
}
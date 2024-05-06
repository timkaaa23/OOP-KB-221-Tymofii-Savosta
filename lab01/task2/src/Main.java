import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int second = scanner.nextInt();
        int hour = 0;
        int minute = 0;
        while(second >= 60){
            if(second >= 60){
                second -= 60;
                minute += 1;
            }
            if(minute >= 60) {
                minute -= 60;
                hour += 1;
            }
            if(hour >= 24)
                hour = 0;
        }
        System.out.println(hour + ":" + minute + ":" + second);
    }
}
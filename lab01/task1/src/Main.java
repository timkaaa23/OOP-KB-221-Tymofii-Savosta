import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String text = scanner.nextLine();
        System.out.printf("Hello, " + text + ".");
    }
}
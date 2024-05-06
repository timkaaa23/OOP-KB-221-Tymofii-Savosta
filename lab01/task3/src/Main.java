import java.util.Scanner;

public class Main {
    final static int password = 1234;

    public static void main(String[] argv){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the password: ");
        int code = scanner.nextInt();
        if(code == password)
            System.out.println("Welcome, Agent 007");
        else
            System.out.println("Access denied. We are calling the police");
    }
}

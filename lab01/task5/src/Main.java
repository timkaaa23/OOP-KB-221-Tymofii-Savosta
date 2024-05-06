import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many feet it will rise: ");
        int a = scanner.nextInt();
        System.out.print("Enter how many feet it will go down: ");
        int b = scanner.nextInt();
        System.out.print("Enter the height of the tree: ");
        int h = scanner.nextInt();

        int way = 0;
        int counter = 0;

        if(a <= b && a <= h){
            System.out.println("Impossible");
        }
        else {
            while (true) {
                counter += 1;
                way += a;
                if (way >= h) {
                    System.out.println("The snail reached the tree in " + counter + " days.");
                    return;
                }
                way -= b;
            }
        }
    }
}
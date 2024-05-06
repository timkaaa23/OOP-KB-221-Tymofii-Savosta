import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Write the number of people, which you are going to meet: ");

        int number = scanner.nextInt();

        if(number > 0){
            scanner.nextLine();
            for(int i = 0; i < number; i++){
                System.out.print("Enter stranger`s name: ");
                String name = scanner.nextLine();
                nameList.add(name);
            }
        }
        else
            System.out.println("Error: wrong number");

        if(nameList.size() > 0){
            for(int i = 0; i < nameList.size(); i++) {
                System.out.println("Hello, " + nameList.get(i));
            }
        }
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter numbers: ");
        String[] numbers = scanner.nextLine().split(" ");
        int[] numList = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numList[i] = (Integer.parseInt(numbers[i]));
        }
        System.out.printf("Enter shift: ");
        Integer shift = scanner.nextInt();

        main.cycleSwap1(numList);
        System.out.println(Arrays.toString(numList));
        main.cycleSwap2(numList, shift);
        System.out.println(Arrays.toString(numList));
    }
    public void cycleSwap1(int[] array){
        List<Integer> newList = new ArrayList<>(Collections.nCopies(array.length, 0));
        for(int i = 0; i < array.length; i++){
            if(i == array.length-1){
                newList.set(0, array[i]);
            }
            else
                newList.set(i + 1, array[i]);
        }
        for (int i = 0; i < array.length; i++)
            array[i] = newList.get(i);
    }

    public void cycleSwap2(int[] array, int shift) {
        List<Integer> newList = new ArrayList<>(Collections.nCopies(array.length, 0));
        for(int i = 0; i < array.length; i++){
            int newIndex = (i + shift) % array.length;
            if(newIndex < 0){
                newIndex += array.length;
            }
            newList.set(newIndex, array[i]);
        }
        for (int i = 0; i < array.length; i++)
            array[i] = newList.get(i);

    }
}




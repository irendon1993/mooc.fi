
import java.util.Scanner;

public class Swap {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");
        
        // After the first printing, the program should ask for two indices from the user. 
        System.out.println("Give two indices to swap:");
        int firstIndexToSwap = Integer.valueOf(scanner.nextLine());
        int secondIndexToSwap = Integer.valueOf(scanner.nextLine());
        
        System.out.println("");
        
        // The values in these two indices should be swapped
        int valueHolder = array[firstIndexToSwap];
        array[firstIndexToSwap] = array[secondIndexToSwap];
        array[secondIndexToSwap] = valueHolder;
        
        
        // In the end the values of the array should be printed once again.    
        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        
    }

}

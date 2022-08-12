

import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        // Implement the search functionality here
        // Ask the user for a number to search in the array. 
        System.out.print("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());

        // If the array contains the given number
        int index = 0;
        int searchFail  = 0;
        while(index < array.length) {
            if(array[index] == searching) {
                int indexNumber = array[index] + 1;
                // The program tells the index containing the number.
                System.out.println(searching + " is at index " + indexNumber);
                break;
            }
            index++;
            searchFail ++;
        }
        // If the array doesn't contain the given number,  
        // The program will advise that the number wasn't found.
        if(searchFail == array.length) {
        System.out.println(searching + " was not found");
        }
    }

}

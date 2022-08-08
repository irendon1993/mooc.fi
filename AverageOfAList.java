
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        while(true) {
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1) {
                break;
            }
            list.add(input);
            
        }
        System.out.println("");
        
        int average = 0;
        for(int number: list) {
            average += number;
        }
        System.out.println("Average: " + average/(list.size()* 1.0));
        
    }
}

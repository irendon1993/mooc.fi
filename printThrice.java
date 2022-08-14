
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a word:");
        // Reads a string from the user and then prints it three times.
        String input = scanner.nextLine();
        System.out.print(input + input + input);
       
        
    }
}

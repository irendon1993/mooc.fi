
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //  Write a program that reads strings from the user.
        while (true) {
            String input = scanner.nextLine();
            if (input.equals(" ")) {
                break;
            }
            String[] splitInput = input.split(" ");
            for(String piece: splitInput){
                System.out.println(piece);
            }
            
        }
        System.out.println("Halted");
        //  For each non-empty input it splits the string input by whitespaces 
        //  and prints each part of the string on a new line.



    }
}


import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        
//        System.out.print("Name: ");
        while(true){
            String input = scanner.nextLine();
            
            if(input.isEmpty()){
                break;
            }
            items.add(new Item(input));
        }    
        for(Item item:items){
            System.out.println(item);
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while(true){
            System.out.println("Title: ");
            String titleInput = scanner.nextLine();
            
            if(titleInput.isEmpty()){
                break;
            }
            
            System.out.println("Pages: ");
            int pagesInput = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Publication Year: ");
            int yearInput = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(titleInput,pagesInput,yearInput));
        }
        
        System.out.println("What Ingformation will be printed?");
        String infoInput = scanner.nextLine();
        
        if(infoInput.toLowerCase().equals("everything")){
            for(Book book: books){
                System.out.println(book);
            }
        } else if(infoInput.toLowerCase().equals("name")){
            for(Book book: books){
                System.out.println(book.getTitle());
            }
        }
    }
}

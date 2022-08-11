
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }
    public static void removeLast(ArrayList<String> strings) {
        // If the list is empty, the method does nothing.
        if(strings.size() == 0){
            return;
        }
        // Remove the last value in the list it receives as a parameter.
        int lastInStrings = strings.size() - 1;
        strings.remove(lastInStrings);
    }

}

public class AdvancedAstrology {

    public static String printStars(int number) {
        String stars = "";
        for(int i = 0; i < number; i++) {
            stars += "*";
        }
        return stars;
    }

    public static String printSpaces(int number) {
        String spaces = "";
        for(int i = 0; i < number; i++) {
            spaces += " ";
        }
        return spaces;
    }

    public static void printTriangle(int size) {
        for(int i = 1; i <= size; i++) {
            System.out.println(printSpaces((size - i)) + printStars(i) );
        }
    }

    public static void christmasTree(int height) {
        for (int i = 0; i < height; i++) {
            System.out.println(printSpaces((height - (i + 1))) + printStars((i * 2)+ 1) + printSpaces(height - (i + 1)));
        }
//        System.out.println(printStars(2 * height - 1));
        System.out.println(printSpaces(height - 2)+ "***" + printSpaces(height - 2));
        System.out.println(printSpaces(height - 2)+ "***" + printSpaces(height - 2));
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}

public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Print a row of stars for each number in the array.
        for(int index:array){
            String starLine = "";
            int starsAmount = 0;
            
            while(starsAmount < index){
                starLine += "*";
                starsAmount++;
            }
            System.out.println(starLine);
        }    
        
        // The amount of stars on each row is defined by 
        // The corresponding number in the array.
        
        
    }

}

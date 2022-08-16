    public static void main(String[] args) {
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        
        Statistics statistics = new Statistics();
        Statistics oddStatistics = new Statistics();
        Statistics evenStatistics = new Statistics();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter numbers:");
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1){
                
                System.out.println("Sum: " + statistics.sum());
                System.out.println("Sum of even numbers: " + evenStatistics.sum());
                System.out.println("Sum of odd numbers: " + oddStatistics.sum());
 
            } else if(input % 2 == 0){
                statistics.addNumber(input);
                evenStatistics.addNumber(input); 
                
            } else if(input % 2 != 0) {
                statistics.addNumber(input);
                oddStatistics.addNumber(input);
            }
        } 
    }
}

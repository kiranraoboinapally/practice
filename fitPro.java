import java.util.Scanner;

class fitPro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double totalCalories = 0.0;
        int choice = 0;
        
        System.out.println("Welcome to the Fitness Tracker!");
        
        while (choice != 5) {
            System.out.println("Please select an activity:");
            System.out.println("1. Walking - 4 calories per minute");
            System.out.println("2. Running - 10 calories per minute");
            System.out.println("3. Swimming - 7 calories per minute");
            System.out.println("4. Cycling - 6 calories per minute");
            System.out.println("5. Exit and Show Total Calories Burned");
            
            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextInt();
            
            int duration = 0;
            switch (choice) {
                case 1:
                    System.out.print("You chose Walking. Enter the duration in minutes: ");
                    duration = scanner.nextInt();
                    totalCalories += 4.00 * duration;
                    System.out.println("You walked for " + duration + " minute(s).");
                    break;
                case 2:
                    System.out.print("You chose Running. Enter the duration in minutes: ");
                    duration = scanner.nextInt();
                    totalCalories += 10.00 * duration;
                    System.out.println("You ran for " + duration + " minute(s).");
                    break;
                case 3:
                    System.out.print("You chose Swimming. Enter the duration in minutes: ");
                    duration = scanner.nextInt();
                    totalCalories += 7.00 * duration;
                    System.out.println("You swam for " + duration + " minute(s).");
                    break;
                case 4:
                    System.out.print("You chose Cycling. Enter the duration in minutes: ");
                    duration = scanner.nextInt();
                    totalCalories += 6.00 * duration;
                    System.out.println("You cycled for " + duration + " minute(s).");
                    break;
                case 5:
                    System.out.println("Exiting the tracker...");
                    break;
                default:
                    System.out.println("Invalid choice, please select a valid option (1-5).");
                    continue;
            }
            
            if (choice != 5) {
                System.out.print("Would you like to track more activities? (yes/no): ");
                String continueTracking = scanner.next();
                
                if (continueTracking.equalsIgnoreCase("no")) {
                    choice = 5;
                    System.out.println("Thank you for using the fitness tracker! Goodbye.");
                }
            }
        }
        
        //System.out.printf("Your total calories burned: %.2f\n", totalCalories);
        System.out.println("Your total calories burned: " + totalCalories);

        
        scanner.close();
    }
}

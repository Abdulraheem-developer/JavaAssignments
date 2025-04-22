import java.util.Scanner;

public class MaxNumberCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter integers one by one. Enter 0 to end input.");
        
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
       
        int maxNum = number;
        int count = 1;
        

        int endLoop = 1;  
        while (endLoop != 0) {
            System.out.print("Enter a number (0 to end): ");
            number = scanner.nextInt();

                        if (number == 0) {
                endLoop = 0;  
            } else {
               
                if (number > maxNum) {
                  
                    maxNum = number;
                    count = 1;
                } else if (number == maxNum) {
                    
                    count++;
                }
            }
        }
       
        System.out.println("The largest number is " + maxNum);
        System.out.println("The occurrence count of the largest number is " + count);
        
     
    }
}
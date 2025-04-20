import java.util.Scanner;

public class FiveNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input five numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();
	
	int smallest = 0;
	int largest = 0;	  

        if (num2 > largest)
	 largest = num2;
        if (num3 > largest) 
	largest = num3;
        if (num4 > largest) 
	largest = num4;
        if (num5 > largest) 
	largest = num5;

        if (num2 < smallest) 
	smallest = num2;
        if (num3 < smallest) 
	smallest = num3;
        if (num4 < smallest) 
	smallest = num4;
        if (num5 < smallest) 
	smallest = num5;


        int evenSum = 0;
        int evenCount = 0;

        if (num1 % 2 == 0) {
            evenSum += num1;
            evenCount++;
        }
        if (num2 % 2 == 0) {
            evenSum += num2;
            evenCount++;
        }
        if (num3 % 2 == 0) {
            evenSum += num3;
            evenCount++;
        }
        if (num4 % 2 == 0) {
            evenSum += num4;
            evenCount++;
        }
        if (num5 % 2 == 0) {
            evenSum += num5;
            evenCount++;
        }

        System.out.println("Sum of even numbers: " + evenSum);

        if (evenCount > 0) {
            double average =  evenSum / evenCount;
            System.out.println("Average of even numbers: " + average);
        } 
    }
}


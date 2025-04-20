import java.util.Scanner;

public class ScannerPractice {
	public static void main (String[] args) {
	Scanner input1 = new Scanner (System.in);

	System.out.print("Enter First Integer: ");
	int number1 = input1.nextInt();

	System.out.print("Enter Second number: ");
	int number2 = input1.nextInt();

	int sum = number1 + number2;
	System.out.printf("Sum is %d%n", sum);
	}
}
		
	
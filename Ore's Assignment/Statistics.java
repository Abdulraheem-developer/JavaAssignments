import java.util.Scanner;

public class Statistics{
	public static void main (String[] args){
	
	Scanner input = new Scanner(System.in);

		System.out.println("Input the first Integer: ");
		int input1 = input.nextInt();
	
	System.out.println("Input the second Integer: ");
	int input2 = input.nextInt();

	int sum = 0;
	sum = input1 + input2;
	System.out.println("Sum of the two integers: "+ sum);

	int product = 0;
	 product = input1 * input2;
	System.out.println("Product of the two integers: "+ product);

	float Average = 0;
	 Average = input1 + input2 / 2;
	System.out.println("Average of the two numbers "+ Average);

	int Distance = 0;
	 Distance = input2 - input1;
	System.out.println("Enter the distance of the two numbers: "+ Distance);

	int minNumber = 0;
	minNumber = Math.min(input1, input2);
	System.out.println("The minimum number is "+ minNumber);

	int maxNumber = 0;
	 maxNumber = Math.max(input1, input2);
	System.out.println("The maximum number is " + maxNumber);

	
		
}
}
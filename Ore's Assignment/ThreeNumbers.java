import java.util.Scanner;

public class ThreeNumbers{
  public static void main (String[] args){
	
	Scanner input = new Scanner (System.in);

	System.out.println("Input first number: ");
	int firstNumber = input.nextInt();

	System.out.println("Input second number: ");
	int secondNumber = input.nextInt();

	System.out.println("Input third number :");
	int thirdNumber = input.nextInt();


	if (secondNumber > firstNumber || thirdNumber > secondNumber){
		System.out.println("true");
	}
}
	
}
	
	
import java.util.Scanner;

public class LargestValue{
	public static void main (String[] args){
     Scanner input = new Scanner(System.in);

     System.out.println("Input the first number: ");
	int firstNumber = input.nextInt();

	System.out.println("Input the second number: ");
	     int secondNumber = input.nextInt();


	if (firstNumber == secondNumber){
	 System.out.println(0);
	}
	else if(firstNumber % 6 == secondNumber % 6){
		if(firstNumber < secondNumber){
			System.out.println(firstNumber);
		}
		else{
			System.out.println(secondNumber);
		}

	}
		else{
			if(firstNumber > secondNumber){
				System.out.println(firstNumber);
			} else {
                              System.out.println(secondNumber);

	}
}
}}
import java.util.Scanner;

public class PositiveInteger{
 public static void main(String[] args){
	
	Scanner input = new Scanner (System.in);
	
	System.out.println("Enter a positive number: ");
	int userInput = input.nextInt();
	
	int positive = 0;
	int positiveNumber = 0;

	
	if(userInput > 0){
	 positiveNumber = userInput;  
	} else if(isPrime(positiveNumber)){
	  System.out.println("The number is a prime number...");

}

}

	
	
	

	
	
	

}
import java.util.Scanner;

public class NumberSumLoop{
   public static void main (String[] args){
	
	Scanner input = new Scanner (System.in);
	boolean continueLoop = true;

	do{
	System.out.println("Enter your first number: ");
	double num1 = input.nextDouble();


	System.out.println("Enter your second number: "); 
	double num2 = input.nextDouble();

	double sum = num1 + num2;

	System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum ); 

	input.nextLine();

	System.out.println(" Do you want to perform another addition (yes/no)");

	String response = input.nextLine();

	if(!response.equalsIgnoreCase("yes")){

	continueLoop = false;

}

	}while(continueLoop);

	System.out.println("Program Terminated");
}
}

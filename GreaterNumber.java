import java.util.Scanner;

public class GreaterNumber{
	public static void main (String[] args){
	     Scanner input = new Scanner (System.in);

	
	System.out.print("Enter your first number: ");
	int input1 = input.nextInt();

	System.out.print("Enter your second number: ");
	int input2 = input.nextInt(); 


	int result = 0;

	if (input1 > input2){
	result = input1;

}
	System.out.println("The greater number is: " + result);
}
}

	
	

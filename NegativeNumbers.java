import java.util.Scanner;

public class NegativeNumbers{
     public static void main (String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.println("Input 1: ");
	int firstInput = input.nextInt();

	System.out.println("Input 2: ");
	int secondInput = input.nextInt();


	if ((firstInput < 0 && secondInput < 0) || (firstInput  > 0 && secondInput > 0)){
		System.out.println(firstInput * secondInput);
	}
		else{
		System.out.println("firstInput + secondInput");

}
}
}
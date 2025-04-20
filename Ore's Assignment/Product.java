import java.util.Scanner;

public class Product{
	public static void main (String[] args){

    Scanner input = new Scanner (System.in);

	System.out.println("Input First Integer: ");
		int firstInteger = input.nextInt();

	System.out.println("Input the second Integer: ");
		int secondInteger = input.nextInt();

	int sum = firstInteger * secondInteger;
	System.out.println("The sum of the two numbers "+ sum);
}
}

	


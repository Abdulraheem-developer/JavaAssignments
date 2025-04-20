import java.util.Scanner;

public class CostOfShipping{
	public static void main (String[] args){
	
	Scanner input = new Scanner (System.in);

	
	double cost = 0;
	

	System.out.println("Enter the weight: ");
	double weight = input.nextDouble();

	if (weight < 1){
	cost = 3.5;
	System.out.println("Cost is " + cost);
}

	if (weight <= 1 && weight <= 3 ){
	cost = 5.5;
	System.out.println("Cost is " + cost);
}

	if (weight >= 3 && weight <= 10){
	cost = 8.5;
	System.out.println("Cost is " + cost);

}

	if (weight < 10 && weight <= 20){
	cost = 10.5;
	System.out.println("Cost is " + cost);
}
	if (weight > 20 || weight > 50){
		System.out.println("Package cannot be shipped");
}
}
}
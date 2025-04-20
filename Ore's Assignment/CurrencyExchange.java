import java.util.Scanner;

public class CurrencyExchange{
	public static void main(String args[]){

Scanner input = new Scanner(System.in);

System.out.println("Enter the exchange rate from Dollars to RMB");
	double ExchangeRate = input.nextDouble();

System.out.println("Enter 0 to convert dollars to RMB and 1 to convert RMB TO dollar ");
	double convertRate = input.nextDouble();

if(convertRate == 0){
  System.out.println("Enter your Dollar Amount: ");
  double DollarAmount = input.nextDouble();
  RMBAmount = DollarAmount * ExchangeRate;
	System.out.printf("$%.1f is %.1f yuan%n", DollarAmount, RMBAmount);
}
else if (convertRate == 1){
 System.out.println("Enter the RMB Amount: ");
 double RMBAmount = input.nextDouble();
 double DollarAmount = RMBAmount / ExchangeRate;
System.out.printf("%.1f yuan is $%.2f%n", RMBAmount, DollarAmount);
}
else{
	System.out.println("Invalid option is entered. Please Enter 0 or 1");
    }
}
}



	   

			
		
	
		

	

	
	
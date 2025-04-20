import java.util.Scanner;

public class NumberOfYears{
	public static void main (String[] args){

		Scanner input = new Scanner(System.in);
			System.out.println("Enter the number of minutes);
				double minutes = input.nextDouble();
					
				double minutesInaDay = 24 * 60;
				double 	minutesInaYear = 365 * minutesInaDay;

				double years =  minutes / minutesInaDay;
				double remainingMinutes = minutes % minutesInaYear;
				double days = remainingMinutes / minutesInaDay;

			System.out.println("minutes +  minutes is approximately " + years " years and " + days + "days.");
};
};
				
		
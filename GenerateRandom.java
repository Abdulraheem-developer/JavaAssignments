import java.util.Scanner;
import java.util.Random;

	 public class GenerateRandom{
	public static void main(String[] args){
	
	Scanner input = new Scanner (System.in);
	Random random = new Random();


	int numberToGuess = random.nextInt(10) + 1;
	int userInput = 0;
	int attempts = 0;

	while(userInput != numberToGuess){
	System.out.println("Enter your guess: ");
	userInput= input.nextInt();
	attempts++;

	if (userInput < numberToGuess){
	System.out.println("The number is higher than " + userInput + ". Try again.");
       }else if(userInput > numberToGuess){
	System.out.println(""The number is lower than " + userInput + ". Try again."");
	}else {
	 System.out.println("Oil dey your head! You guessed the number " + numberToGuess + " in " + attempts + " attempts.");
	
	}
}

}
}





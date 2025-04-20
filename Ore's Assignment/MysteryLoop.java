import java.util.Scanner;
import java.util.Random;



public class MysteryLoop{
	public static void main(String[] args){

  Scanner input = new Scanner(System.in);
  Random random = new Random();

    int numberToGuess = random.nextInt(10) + 1;
   int userInput;
    int attempts = 0;

    System.out.println("Enter a number between 1 - 10: ");
	

	
   while (numberToGuess != userInput){
     userInput = input.nextInt();
       attempts++; 

    if (userInput == numberToGuess){
    System.out.println("Congratulations! You guessed it right");
    System.out.println("It took you " + attempts + " attempts ");

} else {
	System.out.println("Wrong guess, Keep trying, my brother");
}
}
}

	
}

	
}
}	

}
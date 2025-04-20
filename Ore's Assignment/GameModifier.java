import java.util.Scanner;
import java.util.Random;

public class GameModifier{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
	
        System.out.println("Scissor(0), Rock(1), Paper(2): ");

	for(int i = 0; i <= 2; i++ ){
        int userChoice = input.nextInt();
        int compChoice = random.nextInt(2) + 1;
        
	  System.out.println("The Computer Choice is " + compChoice + ". The User's Choice is " + userChoice);
        

        
        if (userChoice == compChoice) {
            System.out.println("It is a draw.");
        } else if ((userChoice == 0 && compChoice == 2) || 
                  (userChoice == 1 && compChoice == 0) || 
                  (userChoice == 2 && compChoice == 1)) {
            System.out.println("You won!");
        } else {
            System.out.println("Computer won!");
        }
    }
    }
}
	

	

	
		
	




	

	
	
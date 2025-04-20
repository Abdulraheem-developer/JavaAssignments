import java.util.Scanner;
import java.util.Random;

public class Game{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	Random  myRandom = new Random();

	int CompuerChoice = myRandom.nextInt();
	


     System.out.println("Scissor(0), rock(1), paper(2)");
	int userChoice = input.nextInt();

   System.out.println("The computer is "  + userChoice);
	if (ComputerChoice == 0){
	System.out.println("Scissors");
}
	else if(ComputerChoice == 1){
	System.out.println("Rock");
}
	else if(ComputerChoice == 2){
		System.out.println("Paper");
}

 if(userChoice == ComputerChoice){
	System.out.println("draw");
} else if((userChoice == 0 && ComputerChoice == 2)) || ((userChoice == 1 && ))
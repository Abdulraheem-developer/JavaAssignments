import java.util.Scanner;
import java.util.Random;
 public class RandomNumbers{
	public static void main(String[] args){

	Scanner input = new Scanner (System.in);
	System.out.println("Enter a random number between 1 - 10 :");
	int userInput = input.nextInt();


	Random rn  = new Random();
	int  randomNumber = rn.nextInt(10) + 1;


	if(userInput == 1){
	System.out.println("One");
	} else if (userInput == 2){
		System.out.println("Two");
	} else if(userInput == 3){
		System.out.println("Three");
	}else if(userInput == 4) {
		System.out.println("Four");
	}else if(userInput == 5){
		System.out.println("Five");
 	}else if(userInput == 6){
		System.out.println("Six");
	}else if(userInput == 7){
		System.out.println("Seven");
	}else if(userInput == 8){
		System.out.println("Eight");
	}else if(userInput == 9){
		System.out.println("Nine");
	}else if(userInput == 10){
		System.out.println("Ten");
	}
		}
	}

	
	
		
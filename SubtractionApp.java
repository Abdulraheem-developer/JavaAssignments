import java.util.Scanner;
import java.util.Random;

public class SubtractionApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int totalQuestions = 10;
        int correctAnswers = 0;

        for (int questionNumber = 1; questionNumber <= totalQuestions; questionNumber++) {
           
            int num1 = rand.nextInt(100) + 1;
            int num2 = rand.nextInt(100) + 1;

       
            if (num1 < num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }

            int correctResult = num1 - num2;
            boolean isCorrect = false;

            System.out.println("Question " + questionNumber + ": What is " + num1 + " - " + num2 + "?");

            for (int attempt = 1; attempt <= 2; attempt++) {
          
                int userAnswer = input.nextInt();

                if (userAnswer == correctResult) {
                    correctAnswers++;
                    isCorrect = true;
                    break;
                } else {
                    System.out.println("Incorrect.");
                    if (attempt == 2) {
                        System.out.println("The correct answer was: " + correctResult + "\n");
                    }
                }
            }
        }

        System.out.println("Quiz Over! You got " + correctAnswers + " out of " + totalQuestions + " correct.");
       
    }
}

import java.util.Scanner;

public class UberApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many copies do you want?: ");

        int copiesNum = input.nextInt();

        if (copiesNum >= 1 && copiesNum <= 4) {
            System.out.println("You would be charged " + copiesNum * 2000 + " for " + copiesNum + " copies");

        } else if (copiesNum >= 5 && copiesNum <= 9) {
            System.out.println("You would be charged " +  copiesNum * 1800 + " for " + copiesNum + " copies");

        } else if (copiesNum >= 10 && copiesNum <= 29) {
            System.out.println("You would be charged " + copiesNum * 1600 + " for " + copiesNum + " copies");

        } else if (copiesNum >= 30 && copiesNum <= 49) {
            System.out.println("You would be charged " + copiesNum * 1500 + " for " + copiesNum + " copies");

        } else if (copiesNum >= 50 && copiesNum <= 99) {
            System.out.println("You would be charged " + copiesNum * 1300 + " for " + copiesNum + " copies");

        } else if (copiesNum >= 100 && copiesNum <= 199) {
            System.out.println("You would be charged " + copiesNum * 1200 + " for " + copiesNum + " copies");

        } else if (copiesNum >= 200 && copiesNum <= 499) {
            System.out.println("You would be charged " + copiesNum * 1100 + " for " + copiesNum + " copies");

        } else if (copiesNum >= 500) {
            System.out.println("You be charged " + copiesNum * 1000 + " for " + copiesNum + " copies");
        }

       
    }
}

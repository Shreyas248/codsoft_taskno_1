import java.util.Random;
import java.util.Scanner;

public class random{

    public static void main(String[] args) {

        Random rand = new Random();

        int randomNumber = rand.nextInt(100)+1;

        // System.out.println("Random number is "+ randomNumber);
        int NumberofTries=0;
        while(true){
        System.out.println("Enter your number from 1 - 100");

        Scanner scanner = new Scanner(System.in);
        int Guess = scanner.nextInt();
        NumberofTries++;

        if(Guess==randomNumber){
            System.out.println("You won!");
            System.out.println("It took you "+NumberofTries + " tries");
            break;
        }
        else if(randomNumber > Guess) {
            System.out.println("Uh oh! It's wrong (hint -- The number is higher.)");
        }
        else
        {
            System.out.println("Uh oh! It's wrong (hint -- The number is lower.)");
        }
    }

    }
}
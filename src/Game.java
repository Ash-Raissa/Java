import java.util.Scanner;
import java.util.Random;
public class Game {
    public static void main(String[]args){
        //MAD LIBS GAME

        Scanner scanner = new Scanner (System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.println("Enter adjective (description);");
        adjective1 = scanner.nextLine();

        System.out.println("Enter a noun (animal or person);");
        noun1 = scanner.nextLine();

        System.out.println("Enter adjective (description);");
        adjective2 = scanner.nextLine();

        System.out.println("Enter a verb end with -ing (action)");
        verb1 = scanner.nextLine();

         System.out.println("Enter adjective (description);");
        adjective3 = scanner.nextLine();


        System.out.println("\nToday I went to a " + adjective1 + " zoo");
        System.out.println("in an exhibit, I saw a " + noun1 + ",");
        System.out.println( noun1 + "was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        Random random = new Random();

        int secretNumber = random.nextInt(5) + 1;
        System.out.println("Welcome to Guess the Number!");
        System.out.println("I am thinking of a number between 1 and 10");
        System.out.println("Enter your guess ");

        int guess = scanner.nextInt();

        if(guess == secretNumber){
            System.out.println("You guessed correctly!");

        }else if (guess > secretNumber){
            System.out.println("Too high, the secret number is " + secretNumber);
        } else {
            System.out.println("Too low, the secret number is " + secretNumber);
        }









        scanner.close();


    }
}


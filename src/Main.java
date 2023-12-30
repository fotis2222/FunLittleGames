import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("""
                play:
                (1) dice
                (2) guess the number
                more coming soon...""");
        String mode = scanner.nextLine();
        if (mode.equals("1")) {
            int userRoll = 0;
            int enemyRoll = 0;
            int userScore = 0;
            int enemyScore = 0;
            while (userScore < 4 || enemyScore < 4) {
                System.out.println("press enter to roll");
                scanner.nextLine();
                userRoll = rd.nextInt(6) + 1;
                System.out.println("you rolled " + userRoll);
                enemyRoll = rd.nextInt(6) + 1;
                System.out.println("enemy rolled " + enemyRoll);
                if (userRoll > enemyRoll) {
                    System.out.println("you win!");
                    userScore++;
                    System.out.println("you: " + userScore + ", enemy: " + enemyScore);
                } else if (userRoll < enemyRoll) {
                    System.out.println("you lose");
                    enemyScore++;
                    System.out.println("you: " + userScore + ", enemy: " + enemyScore);
                } else if (userRoll == enemyRoll) {
                    System.out.println("draw");
                    System.out.println("you: " + userScore + ", enemy: " + enemyScore);
                } else {
                    System.out.println("idk what happened but something went really wrong");
                }
                if (userScore == 3) {
                    System.out.println("you have won the game, press enter to exit");
                    scanner.nextLine();
                    break;
                }
                if (enemyScore == 3) {
                    System.out.println("my friend, you have lost the game, press enter to exit");
                    scanner.nextLine();
                    break;
                }
            }
        } else if (mode.equals("2")) {
            int secretNumber = rd.nextInt(10) + 1;;
            int numOfGuesses = 0;
            int guess = 0;
            System.out.println("try to guess a number between 1 and 10 in five guesses!");
            while (numOfGuesses < 5 && guess != secretNumber) {
                System.out.println("guess: ");
                guess = scanner.nextInt();
                numOfGuesses ++;
            }
            if (guess == secretNumber) {
                System.out.println("you win! secret number was" + secretNumber + ", press enter to exit");
            } else if (numOfGuesses == 5) {
                System.out.println("you lose, the secret number was " + secretNumber + ", press enter to exit");
            }
        } else {
            System.out.println("press the number left to the game you want to play");
        }
    }
}
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {

        int secretNum = (int) (Math.random() * (10)) + 1;
        int numGuesses = 0;
        int guess = 0;

        Scanner scan = new Scanner(System.in);

        while (guess != secretNum)   {

            guess = scan.nextInt();
            numGuesses += 1;
            if (guess < secretNum) {
                System.out.println("Your guess is too low.");
            } else if (guess > secretNum) {
                System.out.println("Your guess is too high.");
            } else {
                System.out.println("You got it!!");
            }

        }

        System.out.println("It took you " + numGuesses + " guesses");
        scan.close();
    }
}
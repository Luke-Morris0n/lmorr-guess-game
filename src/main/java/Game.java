import java.util.Scanner;

public class Game {

    void main() {

        int randomNum = (int) (Math.random() * 51);
        System.out.println(randomNum);

        Scanner guesses = new Scanner(System.in);
        System.out.println("Enter First Guess");
        int guessOne = guesses.nextInt();
        if (guessOne == randomNum){
            System.out.println("Victory!");
        } else if (guessOne > randomNum){
            System.out.println("Too High!");
            System.out.println("Enter Second Guess");
        } else {
            System.out.println("Too Low!");
            System.out.println("Enter Second Guess");

        }

    }
}
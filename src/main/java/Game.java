import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Game {

    void main() {

        int countdown = 4;

        int randomNum = (int) (Math.random() * 51);
        System.out.println(randomNum);

        while (countdown > 0) {
            Scanner guesses = new Scanner(System.in);
            System.out.println("Enter Guess");
            int guessedNum = guesses.nextInt();

            if (guessedNum > randomNum) {
                System.out.println("Too High!");
            } else if (guessedNum < randomNum) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Victory!");
                countdown = 0;
            }
            countdown--;
        }
    }
}
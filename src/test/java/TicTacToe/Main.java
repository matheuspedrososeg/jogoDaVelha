package TicTacToe;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Main main = new Main();
        main.startGame();


        // 1 / 2 / 3
        // 4 / 5 / 6
        // 7 / 8 / 9
    }

    // startGame method is in the main class because for some reason it doesnt work when located in game class.
    // while endGame hasnt returned true, the program continues to ask the player for a position
    public void startGame() throws IOException {

        System.out.println("To place a letter, input the number which corresponds to the desired position.");
        System.out.println("1 / 2 / 3\n4 / 5 / 6\n7 / 8 / 9 \n");
        Scanner scanner = new Scanner(System.in);
        game game = new game();
        game.fillWithHyphens();
        game.print(game.pos);

        while (!game.endGame()) {
            System.out.println("Where do you wish to place?");
            int opt = scanner.nextInt();
            game.place(opt);

            game.print(game.pos);
        }
        System.exit(0);

    }
}

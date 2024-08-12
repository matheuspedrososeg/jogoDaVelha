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
    public void startGame() throws IOException {
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

package TicTacToe;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // methods to place X or O // FINISHED
        // methods to make the player win // partially finished
        // methods to make players have turns // FINISHED
        // methods to start, end game // FINISHED
        // method to print the table // FINISHED

        Main main = new Main();
        main.startGame();



//        game.fillWithHyphens();
//        game.place(1);
//        game.place(4);
//        game.place(2);
//        game.place(6);
//        game.place(9);
//        game.place(5);
//        game.print(game.pos);
//        game.endGame();
//        game.place(9);
//        game.print(game.pos);


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

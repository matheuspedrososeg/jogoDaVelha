package TicTacToe;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // methods to place X or O // need method to not allow postions to be taken again
        // methods to make the player win
        // methods to make players have turns // FINISHED
        // methods to start, end game
        // method to print the table

        game game = new game();
        game.fillWithHyphens();
        game.place(1);
        game.place(4);
        game.place(2);
        game.place(6);
        game.place(9);
        game.place(5);
        game.print(game.pos);
        game.endGame();
        game.place(9);
        game.print(game.pos);


        // 1 / 2 / 3
        // 4 / 5 / 6
        // 7 / 8 / 9
    }
}

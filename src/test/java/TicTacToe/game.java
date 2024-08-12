package TicTacToe;

import java.io.*;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class game {
    String[][] pos = new String[3][3];
    int turn;
    List<Integer> posList = new ArrayList<>();
    List<String> xMovements = new ArrayList<>();
    List<String> yMovements = new ArrayList<>();

    public void fillWithHyphens() {
        for (int i = 0; i < pos.length; i++) {
            for (int j = 0; j < pos.length; j++) {
                pos[i][j] = "-";
            }
        }
    }

    public boolean equalsToList(String s, List<String> list) {
        int cnt = 0;
        for (int i = 0; i < list.size(); i++) {
            if (s.contains(list.get(i))) {
                cnt++;
            }
            if (cnt >= 3) {
                return true;
            }
        }
        return false;
    }

    public List<String> caseWinForX() {
        return xMovements.stream().sorted().toList();
    }

    public List<String> caseWinForY() {
        return yMovements.stream().sorted().toList();
    }

    public boolean endGame() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/test/java/winCases.csv"));
        String s = br.readLine();
        for (int i = 0; i < 8; i++) {
            if (equalsToList(s, caseWinForX())) {
                System.out.println("X won the game");
                return true;
            } else if (equalsToList(s, caseWinForY())) {
                System.out.println("O won the game.");
                return true;
            }
            s = br.readLine();
        }
        return false;
    }

    public void place(int position) {
        Scanner scanner = new Scanner(System.in);
        turn++;
        if (position > 0 && position < 4 && !posList.contains(position)) {
            if (player()) {
                pos[0][position - 1] = "X";
                posList.add(position);
                xMovements.add(String.valueOf(position));
            } else {
                pos[0][position - 1] = "O";
                posList.add(position);
                yMovements.add(String.valueOf(position));
            }
        } else if (position > 3 && position < 7 && !posList.contains(position)) {
            if (player()) {
                pos[1][position - 4] = "X";
                posList.add(position);
                xMovements.add(String.valueOf(position));

            } else {
                pos[1][position - 4] = "O";
                posList.add(position);
                yMovements.add(String.valueOf(position));

            }
        } else if (position > 6 && position < 10 && !posList.contains(position)) {
            if (player()) {
                pos[2][position - 7] = "X";
                posList.add(position);
                xMovements.add(String.valueOf(position));

            } else {
                pos[2][position - 7] = "O";
                posList.add(position);
                yMovements.add(String.valueOf(position));

            }
        } else {

            System.out.println("Position invalid or position has already been taken.");
            turn--;
            int newPos = scanner.nextInt();
            place(newPos);
        }
    }

    public void print(String[][] table) {
        for (int i = 0; i < table.length; i++) {
            System.out.print("[");
            for (int j = 0; j < table.length; j++) {
                System.out.print(table[i][j] + ", ");
            }
            System.out.print("]");
            System.out.println();
        }
    }


    // if player = true, then the player is one, which corresponds to "X"'s turn
    //  else, then player 2 which corresponds to "O"
    public boolean player() {
        if (turn % 2 == 1) {
            return true;
        }
        return false;
    }

}

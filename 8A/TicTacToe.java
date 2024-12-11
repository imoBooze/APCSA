import java.util.Scanner;

public class TicTacToe {
  String grid[][];
  int round = 2;
  boolean Xwin = false;
  boolean Owin = false;

  public void game() {
    grid = new String[3][3];
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        grid[i][j] = " ";
      }
    }

    Scanner input = new Scanner(System.in);
    printBoard();
    narration();

    while (!Xwin && !Owin) {
      String inputted = input.nextLine();
      int row = Integer.parseInt(inputted.substring(0, 1));
      int column = Integer.parseInt(inputted.substring(2, 3));
      if (round % 2 == 0) {
        grid[row][column] = "X";
        Xwin = checkWin("X");
      } else {
        grid[row][column] = "O";
        Owin = checkWin("O");
      }
      round++;
      printBoard();
      narration();
    }
    input.close();
  }

  // Prints the current state of the board
  public void printBoard() {
    System.out.println();
    // By dividing by 2, the printed round only increments after both X and O have taken their turn.
    System.out.println("Round: " + round / 2);
    for (int i = 0; i < grid.length; i++) {
      System.out.print("[" + grid[i][0] + "]");
      for (int j = 1; j < grid[i].length; j++) {
        System.out.print("[" + grid[i][j] + "]");
      }
      System.out.println();
    }
  }

  public void narration() {
    if (!Xwin && !Owin) {
      if (round % 2 != 0) {
        System.out.println("Turn: X");
      } else {
        System.out.println("Turn: O");
      }
      System.out.print("Input desired coordinates row,column: ");
    } else {
      if (Xwin) System.out.println("X wins!");
      if (Owin) System.out.println("O wins!");
    }
  }

  public boolean checkWin(String str) {
    // Horizontal win
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length && grid[i][j].equals(str); j++) {
        if (j == grid[i].length - 1 && grid[i][j].equals(str)) return true;
      }
    }

    // Vertical win
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length && grid[j][i].equals(str); j++) {
        if (j == grid[i].length - 1 && grid[j][i].equals(str)) return true;
      }
    }

    // Downwards diagonal win
    for (int i = 0; i < grid.length && grid[i][i].equals(str); i++) {
      if (i == grid[i].length - 1 && grid[i][i].equals(str)) return true;
    }

    // Upwards diagonal win
    for (int i = 0; i < grid.length && grid[grid.length - 1 - i][i].equals(str); i++) {
      if (i == grid[i].length - 1 && grid[grid.length - 1 - i][i].equals(str)) return true;
    }

    return false;
  }
}

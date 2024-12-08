import java.util.Scanner;

public class TicTacToe {
  String grid[][];
  int round = 1;
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

    while (!Xwin || !Owin) {
      printBoard();
      int row = Integer.parseInt(input.nextLine().substring(0, 1));
      int column = Integer.parseInt(input.nextLine().substring(2, 3));
      if (round / 2 == 0) {
        grid[row][column] = "X";
      } else {
        grid[row][column] = "O";
      }
      round++;
    }
    input.close();
  }

  // Prints the current state of the board
  public void printBoard() {
    System.out.println();
    System.out.println("Round: " + round);
    for (int i = 0; i < grid.length; i++) {
      System.out.print("[" + grid[i][0] + "]");
      for (int j = 1; j < grid[i].length; j++) {
        System.out.print("[" + grid[i][j] + "]");
      }
      System.out.println();
    }
    if (round / 2 == 0) {
      System.out.println("Turn: X");
    } else {
      System.out.println("Turn: O");
    }
    System.out.print("Input desired coordinates row,column: ");
  }
}

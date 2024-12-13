import java.util.Scanner;

public class TicTacToe {
  String grid[][];
  int round;
  boolean Xwin;
  boolean Owin;
  Scanner input = new Scanner(System.in);

  public void game() {
    boolean playAgain = true;
    do {
      grid = new String[3][3];
      for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[i].length; j++) {
          grid[i][j] = " ";
        }
      }

      // Initialize
      round = 2;
      Xwin = Owin = false;

      printBoard();
      narration();

      while (!Xwin && !Owin) {
        if (round % 2 == 0) {
          setMove("X");
          Xwin = checkWin("X");
        } else {
          setMove("O");
          Owin = checkWin("O");
        }
        round++;
        printBoard();
        narration();
      }
      roundEnd();
    } while (playAgain);
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

  public void setMove(String player) {
    boolean notValid = true;
    do {
      String inputted = input.nextLine();
      int row = Integer.parseInt(inputted.substring(0, 1));
      int column = Integer.parseInt(inputted.substring(2, 3));
      if (row < grid[0].length && column < grid[0].length && grid[row][column].equals(" ")) {
        grid[row][column] = player;
        notValid = false;
      } else {
        System.out.println("Try again");
      }
    } while (notValid);
  }

  // Display information
  public void narration() {
    if (!Xwin && !Owin) {
      if (round % 2 == 0) {
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

  // Play new round or end game
  public void roundEnd() {
    System.out.println("Play again? Y/N");
    if (input.nextLine().equals("Y")) {
      System.out.println("Starting new game...");
    } else if (input.nextLine().equals("N")) {
      input.close();
    } else {
      System.out.println("Play again? Y/N");
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

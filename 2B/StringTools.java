// Silly string

class StringTools {
  public String lastLetter(String str) {
    return str.substring(str.length() - 1);
  }

  public String formatPhoneNumber(String str) {
    String str0 = str.substring(0, 3);
    String str1 = str.substring(3, 6);
    String str2 = str.substring(6, 9);
    return "(" + str0 + ")" + " " + str1 + "-" + str2;
  }

  public String middleThree(String str) {
    int mid =
        str.length()
            / 2; // Middle of the string. Somehow works out in the end thanks to integer division.
    int midMinus1 = mid - 1;
    int midPlus1 = mid + 1;
    return str.substring(midMinus1, midPlus1 + 1);
  }

  public String swapLastTwo(String str) {
    int last = str.length() - 1; // Index of last character in string
    String lastChar = str.substring(last);

    int lastMinus1 = last - 1;
    String lastMinus1Char = str.substring(lastMinus1, lastMinus1 + 1);

    int remain =
        str.length()
            - 2; // Subtract 2 to remove 2 characters. Index can be safely ignored due to the second
                 // integer of substring being exclusive.
    return str.substring(0, remain) + lastChar + lastMinus1Char;
  }

  public boolean frontAgain(String str, int n) {
    String first = str.substring(0, n); // Check from first character to n-th character.
    String last = str.substring(str.length() - n, str.length()); // More index woes

    return (first.compareTo(last) == 0);
  }
}

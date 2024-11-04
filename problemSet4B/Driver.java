// sameStarChar

class Driver {
  public static void main(String[] arg) {
    System.out.println(sameStarChar("*xa*a*b"));
  }

  public static boolean sameStarChar(String str) {
    // str = str + "\n";
    int starIndex = -1;
    for (int i = 0; i <= str.length(); i++) {
      starIndex = str.indexOf("*", str.length() - i);
      System.out.println(starIndex);
      if (starIndex > 0 && starIndex < str.length() - 1) {
        System.out.println(str.substring(starIndex - 1, starIndex));
        System.out.println(str.substring(starIndex + 1, starIndex + 2));
        if (str.substring(starIndex - 1, starIndex)
                .equals(str.substring(starIndex + 1, starIndex + 2))
            == false) {
          return false;
        }
      }
    }
    return true;
  }
}

class Driver {
  public static void main(String[] args) {
    drawRect(3, 4);
  }

  static void drawRect(int w, int h) {
    for (int a = 0; a < w; a++) {
      for (int b = 0; b < h; b++) {
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }
}

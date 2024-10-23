class Canvas {
  static int width = 1500;
  static int height = 1500;
  public static void main(String[] args) {
    StdDraw.setCanvasSize(width, height);
    StdDraw.setScale(0, 1500);
    circles();
  }

  static void grid(int spacing) {
    for (int i = 0; i <= width; i += spacing) {
      StdDraw.line(i, 0, i, height);
      StdDraw.line(0, i, width, i);
    }
  }

  static void warp(int spacing) {
    for (int i = 0; i <= width; i += spacing) {
      StdDraw.line(0, i, i + spacing, height);
      StdDraw.line(i, 0, width, i + spacing);
    }
  }

  static void circles() {
    for (int i = width; i >= 20; i -= 20) {
      StdDraw.setPenRadius(0.03);
      StdDraw.circle(width / 2, height / 2, i);
    }
  }

  static void sierpinski() {
    OrderedPair op0 = new OrderedPair();
    for (int i = 0; i < 10; i++) {
    }
  }
}

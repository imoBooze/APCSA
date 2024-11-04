class Canvas {
  static int width = 1500;
  static int height = 1500;

  public static void main(String[] args) {
    StdDraw.setCanvasSize(width, height);
    StdDraw.setScale(0, 1500);
    sierpinski(width - 300, height - 300, 500);
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

  //x and y for where to place the triangle from the leftmost point, w for vertex length
  static void sierpinski(double x, double y, double w) {
    OrderedPair op0 = new OrderedPair(x, y); // Leftmost
    OrderedPair op1 = new OrderedPair(w, y); // Rightmost
    OrderedPair op2 =
        new OrderedPair(
            (x + w) / 2, y - Math.sqrt(Math.pow(w, 2) - Math.pow(w / 2, 2))); // Bottommost
    StdDraw.setPenRadius(0.01);

    // Plot down the three vertexes
    StdDraw.point(op0.getX(), op0.getY());
    StdDraw.point(op1.getX(), op1.getY());
    StdDraw.point(op2.getX(), op2.getY());

    // Pick leftmost vertex as initial (doesn't really matter which)
    OrderedPair chosen = op0;

    // Infinitely draw
    while (true) {
      int n = (int) (Math.random() * 3);

      OrderedPair sel = new OrderedPair(); // Choose a random vertex

      if (n == 0) {
        sel = op0;
      } else if (n == 1) {
        sel = op1;
      } else if (n == 2) {
        sel = op2;
      }

      chosen = Formula.findMidpoint(sel, chosen);
      StdDraw.point(chosen.getX(), chosen.getY()); // Draw!
    }
  }
}

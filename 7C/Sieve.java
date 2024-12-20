import java.util.ArrayList;

class Sieve {
  // Find primes using Sieve of Eratosthenes
  static ArrayList<Integer> ertt(int n) {
    ArrayList<Integer> result = new ArrayList<Integer>();

    for (int i = 2; i <= n; i++) {
      result.add(i);
    }

    for (int p = 2; p <= n; p++) {
      for (int i = result.indexOf(p) + 1; i < result.size() && i > -1; i++) {
        if (result.get(i) % p == 0) result.remove(i);
      }
    }

    return result;
  }

  // Goldback Conjecture
  static String gdbh(int n) {
    ArrayList<Integer> list = ertt(n);
    for (int m : list) {
      if (list.contains(n - m)) {
        return m + " + " + (n - m) + " = " + n;
      }
    }
    return "HOW???";
  }
}

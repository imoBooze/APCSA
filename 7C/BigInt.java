import java.util.ArrayList;
import java.util.Arrays;

class BigInt {
  ArrayList<Integer> list;

  public BigInt() {
    list = new ArrayList<Integer>();
  }

  public BigInt(String num) {
    list = new ArrayList<Integer>();
    for (int i = 0; i < num.length(); i++) {
      list.add(Integer.parseInt(num.substring(i, i + 1)));
    }
  }

  public static String toBetterString(ArrayList<Integer> ext) {
    return ext.toString().replace("[", "").replace("]", "").replace(", ", "");
  }

  public String toString() {
    return Arrays.toString(list.toArray());
  }

  public ArrayList<Integer> toArrayList() {
    return list;
  }

  public int getLength() {
    return list.size();
  }

  public int getPlaceVal(int n) {
    return list.get(n);
  }

  public static ArrayList<Integer> add(BigInt a, BigInt b) {
    ArrayList<Integer> result = new ArrayList<Integer>();
    int trueLength =
        Math.max(a.getLength(), b.getLength()) + (a.getPlaceVal(0) + b.getPlaceVal(0)) / 10;
    int carry = 0;
    for (int i = 1; i <= trueLength; i++) {
      if (a.getLength() >= i && b.getLength() >= i) {
        result.add(0, a.getPlaceVal(a.getLength() - i) + b.getPlaceVal(b.getLength() - i));
      } else if (a.getLength() >= i) {
        result.add(0, a.getPlaceVal(a.getLength() - i));
      } else if (b.getLength() >= i) {
        result.add(0, b.getPlaceVal(a.getLength() - i));
      }
      result.set(0, result.get(0) + carry);
      carry = 0;
      if (result.get(0) >= 10) {
        result.set(0, result.get(0) - 10);
        carry = 1;
        if (trueLength - i == 1) result.add(0, 0);
      }
    }
    return result;
  }
}

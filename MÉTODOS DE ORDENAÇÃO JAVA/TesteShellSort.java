public class TesteShellSort {
  public static void main(String args[]) {
    int v[] = { 45, 56, 12, 43, 95, 19, 8, 67 };
    final int k = 2;
    int i, j, h = 1, value;

    do {
      h = k * h + 1;
    } while (h < v.length);

    do {
      h = h / k;
      for (i = h; i < v.length; i++) {
        value = v[i];
        j = i - h;
        while (j >= 0 && value < v[j]) {
          v[j + h] = v[j];
          j = j - h;
        }
        v[j + h] = value;
      }
    } while (h != 1);
    for (int c = 0; c < v.length; c++) {
      System.out.println("" + v[c]);
    }
  }
}
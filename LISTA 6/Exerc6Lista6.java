import java.util.Scanner;

public class Exerc6Lista6 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int[] v = new int[8];
    int v1[] = { 45, 56, 12, 43, 95, 19, 8, 67 };
    int v2[] = { 8, 12, 19, 43, 45, 56, 67, 95 };
    int v3[] = { 95, 67, 56, 45, 43, 19, 12, 8 };
    int v4[] = { 19, 12, 8, 45, 43, 56, 67, 95 };

    final int k = 3;
    int i, j, h = 1, value, movim = 0, comp = 0;
    for (int m = 1; m < 5; m++) {
      for (int l = 0; l < v.length; l++) {
        if (m == 1)
          v[l] = v1[l];
        else if (m == 2)
          v[l] = v2[l];
        else if (m == 3)
          v[l] = v3[l];
        else
          v[l] = v4[l];
      }

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
            comp++;
            j = j - h;

          }
          v[j + h] = value;
          movim++;

          for (int c = 0; c < v.length; c++) {
            System.out.print(" " + v[c]);
          }
          System.out.printf("\n____________________________\n");
        }

      } while (h != 1);

      System.out.printf("Vetor %d ordenado: ", m);
      for (int c = 0; c < v.length; c++) {
        System.out.print(" " + v[c]);
      }
      System.out.printf("\nMovimentações: %d \n", movim);
      movim = 0;
      System.out.printf("Comparações: %d\n", comp);
      comp = 0;
    }
  }
}
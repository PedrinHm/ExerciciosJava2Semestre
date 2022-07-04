public class shellsort {
  public static void main(String args[]) {
    int vetor[] = { 45, 56, 12, 43, 95, 19, 8, 67 };
    final int k = 2;
    int i, j, h = 1, value;

    do {
      h = k * h + 1;
    } while (h < vetor.length);

    do {
      h = h / k;
      for (i = h; i < vetor.length; i++) {
        value = vetor[i];
        j = i - h;
        while (j >= 0 && value < vetor[j]) {
          vetor[j + h] = vetor[j];
          j = j - h;
        }
        vetor[j + h] = value;
      }
    } while (h != 1);

    for (int c = 0; c < vetor.length; c++) {

      System.out.print(" \t " + vetor[c]);

    }

  }
}
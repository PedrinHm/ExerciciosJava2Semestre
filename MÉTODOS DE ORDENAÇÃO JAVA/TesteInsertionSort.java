import java.util.Scanner;

public class TesteInsertionSort {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int vetor[] = { 56, 446, 389, 18, 446, 17, 493, 186, 455, 94, 374, 119, 81, 250, 496, 84, 129, 73, 414, 156, 199,
        84, 17, 16, 56 };
    int i, j, chave;

    System.out.println("Vetor inicial: ");
    for (i = 0; i < vetor.length; i++) {
      System.out.printf("\t " + vetor[i]);
    }

    for (i = 1; i < vetor.length; i++) {
      chave = vetor[i];
      j = i - 1;
      while (j >= 0 && chave < vetor[j]) {
        vetor[j + 1] = vetor[j];
        j--;
      }
      vetor[j + 1] = chave;

    }

    System.out.println("\n Vetor ordenado: ");

    for (i = 0; i < vetor.length; i++) {
      System.out.printf("\t " + vetor[i]);
    }
  }
}

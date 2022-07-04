import java.util.Scanner;

public class Exercicio6Lista5 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int vetor[] = { 82, 50, 71, 63, 85, 43, 39, 97, 14 };
    int i, chave, j, k, aux2 = 0;

    System.out.println("Vetor inicial: ");
    for (i = 0; i < vetor.length; i++) {
      System.out.printf("\t " + vetor[i]);
    }

    for (i = 1; i < vetor.length; i++) {
      chave = vetor[i];
      j = i - 1;
      while (j >= 0 && chave > vetor[j]) {
        vetor[j + 1] = vetor[j];
        j--;
      }
      vetor[j + 1] = chave;
      System.out.printf("\n-----------------------------\n");
      aux2++;
      System.out.printf("\n%d\t", aux2);
      for (k = 0; k < vetor.length; k++) {
        System.out.print(" " + vetor[k]);
      }
    }

    System.out.println("\n Vetor ordenado: ");

    for (i = 0; i < vetor.length; i++) {
      System.out.printf(" " + vetor[i]);
    }
  }
}
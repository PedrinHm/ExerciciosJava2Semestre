import java.util.Scanner;

public class TesteBubbleSort {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int vetor[] = { 1, 8, 2, 9, 15, 20 };

    int aux = 0, troca = 0, comp = 0;

    int i = 0;

    System.out.println("Vetor desordenado: ");
    for (i = 0; i < vetor.length; i++) {

      System.out.println(vetor[i]);
    }

    for (i = 1; i < vetor.length; i++) {

      for (int j = 0; j < vetor.length - 1; j++) {
        comp++;
        if (vetor[j] > vetor[j + 1]) {
          aux = vetor[j];
          vetor[j] = vetor[j + 1];
          vetor[j + 1] = aux;
          troca++;
        }
        if (i == 1) {
          for (int k = 0; k < vetor.length; k++) {
            System.out.printf(" %d ", vetor[k]);
          }
        }

      }

    }

    System.out.println("");
    System.out.println("Vetor Ordenado: ");
    for (i = 0; i < vetor.length; i++) {
      System.out.println("" + vetor[i]);
    }
    System.out.printf("Trocas: %d \nComparações: %d", troca, comp);

  }
}

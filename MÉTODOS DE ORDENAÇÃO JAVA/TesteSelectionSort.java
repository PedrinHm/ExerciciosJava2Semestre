import java.util.Scanner;

public class TesteSelectionSort {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int vetor[] = { 15, 11, 16, 18, 23, 5, 10, 22, 21, 12 };
    int min, aux, i;

    System.out.println("Vetor de entrada: ");

    for (i = 0; i < vetor.length; i++) {
      System.out.println(vetor[i]);
    }

    for (i = 0; i < vetor.length - 1; i++) {
      min = i;
      for (int j = i + 1; j < vetor.length; j++) {
        if (vetor[j] < vetor[min]) {
          min = j;
        }
      }
      aux = vetor[min];
      vetor[min] = vetor[i];
      vetor[i] = aux;
      if (i == 4) {
        for (int k = 0; k < vetor.length; k++) {
          System.out.printf(" %d ", vetor[k]);
        }
      }
    }

    System.out.println("Vetor ordenado: ");

    for (i = 0; i < vetor.length; i++) {
      System.out.println(vetor[i]);
    }

  }
}
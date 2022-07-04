
import java.util.Scanner;

public class Exercicio2Lista5 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int vetor[] = { 92, 80, 71, 63, 55, 41, 39, 27, 14 };

    int aux = 0;

    int i = 0;

    int k = 0;

    int aux2 = 0;

    System.out.println("Vetor desordenado: ");
    for (i = 0; i < vetor.length; i++) {

      System.out.print(" " + vetor[i]);
    }

    for (i = 1; i < vetor.length; i++) {
      for (int j = 0; j < vetor.length - 1; j++) {
        if (vetor[j] < vetor[j + 1]) {
          aux = vetor[j];
          vetor[j] = vetor[j + 1];
          vetor[j + 1] = aux;
          System.out.printf("\n-----------------------------\n");
          aux2++;
          System.out.printf("\n%d\t", aux2);
          for (k = 0; k < vetor.length; k++) {
            System.out.print(" " + vetor[k]);
          }
        }
      }
    }

    System.out.println("");
    System.out.println("Vetor Ordenado: ");
    for (i = 0; i < vetor.length; i++) {
      System.out.print(" " + vetor[i]);
    }

  }
}/*
  * Adapte o método bubblesort de modo que o vetor seja ordenado de forma
  * decrescente.
  */
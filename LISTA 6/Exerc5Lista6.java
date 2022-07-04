import java.util.Scanner;

public class Exerc5Lista6 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int[] vetor = new int[20];
    int i, j, chave, vetorN, teste_ordenacao = 0, aux;

    System.out.printf("\nEscolha o vetor para ser ordenado: \n(1, 2 ou 3)");
    vetorN = sc.nextInt();

    switch (vetorN) {
    case 1:
      int[] vet_a = { 7, 13, 3, 4, 20, 5, 8, 9, 12, 10, 8, 7, 5, 2, 2, 3, 6, 1 };
      vetor = vet_a;
      break;
    case 2:
      int[] vet_b = { 20, 18, 14, 13, 12, 10, 9, 8, 7, 4, 3, 2, 1 };
      vetor = vet_b;
      break;
    case 3:
      int[] vet_c = { 1, 2, 3, 4, 7, 8, 9, 10, 12, 13, 15, 18, 20 };
      vetor = vet_c;
      break;
    }

    System.out.println("Vetor inicial: ");
    for (i = 0; i < vetor.length; i++) {
      System.out.printf("\t " + vetor[i]);
    }

    for (j = 1; j < vetor.length; j++) {
      if (vetor[j] < vetor[j - 1]) {
        for (i = 0; i < j; i++) {
          if (vetor[j] < vetor[i]) {
            aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
          }
        }
      }
    }

    System.out.println("\n Vetor ordenado: ");

    for (i = 0; i < vetor.length; i++) {
      System.out.printf("\t" + vetor[i]);
    }

  }
}
/*
 * Altere a implementação do algoritmo InsertionSort para usar o laço for ao
 * invés do laço while.
 */
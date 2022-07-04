import java.util.Scanner;

public class Exerc4Lista6 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int[] vetor = new int[20];
    int i, j, chave, troca = 0, comp = 0, vetorN, teste_ordenacao = 0;

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

    for (i = 1; i < vetor.length; i++) {
      chave = vetor[i];
      j = i - 1;
      while (j >= 0 && chave < vetor[j]) {
        vetor[j + 1] = vetor[j];
        j--;
        comp++;
        troca++;
      }

      if (j >= 0) {
        comp++;
      }
      vetor[j + 1] = chave;

    }

    System.out.println("\n Vetor ordenado: ");

    for (i = 0; i < vetor.length; i++) {
      System.out.printf("\t" + vetor[i]);
    }
    System.out.println("");
    System.out.println("Trocas: " + troca);
    System.out.println("Comparações: " + comp);
  }
}
/*
 * Dadas as sequências do ex. 02, implemente o algoritmo InsertionSort mostrando
 * quantas trocas e quantas comparações são feitas durante a ordenação, compare
 * e analise os resultados com os algoritmos de seleção e bolha.
 */
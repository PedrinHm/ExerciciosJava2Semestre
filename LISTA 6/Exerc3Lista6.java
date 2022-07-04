import java.util.Scanner;

public class Exerc3Lista6 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int teste_ordenacao = 0, min, aux, comp = 0, troca = 0, i = 0, vetor_N;
    int[] vetor = new int[20];

    System.out.printf("\nEscolha o vetor para ser ordenado: \n(1, 2 ou 3)");
    vetor_N = sc.nextInt();

    switch (vetor_N) {
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

    System.out.println("Vetor de entrada: ");

    for (i = 0; i < vetor.length; i++) {
      System.out.println(vetor[i]);
    }

    for (i = 0; i < vetor.length - 1; i++) {
      if (vetor[i] > vetor[i + 1]) {
        teste_ordenacao++;
      }
    }

    if (teste_ordenacao != 0) {
      for (i = 0; i < vetor.length - 1; i++) {
        min = i;
        for (int j = i + 1; j < vetor.length; j++) {
          comp++;
          if (vetor[j] < vetor[min]) {
            troca++;
            min = j;
          }
        }
        aux = vetor[min];
        vetor[min] = vetor[i];
        vetor[i] = aux;
      }
    } else {
      System.out.println("O vetor já está ordenado!!!");
    }

    System.out.println("");
    System.out.println("Vetor Ordenado: ");
    for (i = 0; i < vetor.length; i++) {
      System.out.println("" + vetor[i]);
    }
    System.out.println("Trocas: " + troca);
    System.out.println("Comparações: " + comp);
  }
}
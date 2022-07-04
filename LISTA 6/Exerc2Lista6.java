import java.util.Scanner;

public class Exerc2Lista6 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int[] vet_t = new int[18];
    int vetor_N, teste_ordenacao = 0;

    System.out.printf("\nEscolha o vetor para ser ordenado: \n(1, 2 ou 3)");
    vetor_N = sc.nextInt();

    switch (vetor_N) {
    case 1:
      int[] vet_a = { 7, 13, 3, 4, 20, 5, 8, 9, 12, 10, 8, 7, 5, 2, 2, 3, 6, 1 };
      vet_t = vet_a;
      break;
    case 2:
      int[] vet_b = { 20, 18, 14, 13, 12, 10, 9, 8, 7, 4, 3, 2, 1 };
      vet_t = vet_b;
      break;
    case 3:
      int[] vet_c = { 1, 2, 3, 4, 7, 8, 9, 10, 12, 13, 15, 18, 20 };
      vet_t = vet_c;
      break;
    }

    int aux = 0;

    int comp = 0, troca = 0, i = 0;

    System.out.println("Vetor desordenado: ");
    for (i = 0; i < vet_t.length; i++) {
      System.out.println(vet_t[i]);
    }

    for (i = 0; i < vet_t.length - 1; i++) {
      if (vet_t[i] > vet_t[i + 1]) {
        teste_ordenacao++;
      }
    }

    if (teste_ordenacao != 0) {
      for (i = 1; i < vet_t.length; i++) {
        for (int j = 0; j < vet_t.length - 1; j++) {
          comp++;
          if (vet_t[j] > vet_t[j + 1]) {
            troca++;
            aux = vet_t[j];
            vet_t[j] = vet_t[j + 1];
            vet_t[j + 1] = aux;
          }
        }
      }
    } else {
      System.out.println("O vetor já está ordenado!!!");
    }

    System.out.println("");
    System.out.println("Vetor Ordenado: ");
    for (i = 0; i < vet_t.length; i++) {
      System.out.println("" + vet_t[i]);
    }
    System.out.println("Trocas: " + troca);
    System.out.println("Comparações: " + comp);
  }
}
import java.util.Scanner;

public class Atividade2Lista4 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int[] vetorA = new int[6];
    int[] vetorB = new int[6];
    int[] vetorC = new int[12];
    int i, j = 0;
    for (i = 0; i < vetorC.length; i++) {
      System.out.println("Digite um número: ");
      if (i < 6) {
        vetorA[i] = sc.nextInt();
        vetorC[i] = vetorA[i];
      } else {
        vetorB[j] = sc.nextInt();
        vetorC[i] = vetorB[j];
        j += 1;
      }

    }
    for (i = 0; i < vetorC.length; i++) {
      System.out.println(vetorC[i]);
    }
  }
}
/*
 * Ler dois vetores A e B com 6 elementos cada. Construir um vetor C, sendo este
 * a junção dos dois outros vetores. Os primeiros 6 elementos de C deverão
 * receber os elementos de A e os últimos elementos C deverão receber os
 * elementos de B. Desta forma, C deverá ter o dobro de elementos de A e B.
 */
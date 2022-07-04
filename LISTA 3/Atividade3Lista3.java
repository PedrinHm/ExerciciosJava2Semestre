import java.util.Scanner;

public class Atividade3Lista3 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    /*
     * Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo
     * tipo e tamanho, sendo que cada elemento do vetor B deverá ser o respectivo
     * elemento de A multiplicado por sua posição (ou índice).
     */
    int[] vetorA = new int[10];
    int[] vetorB = new int[10];
    int i;

    for (i = 0; i < 10; i++) {
      System.out.printf("\nDigite um número: ");
      vetorA[i] = sc.nextInt();
      vetorB[i] = vetorA[i] * i;
      System.out.printf("\n%d x %d = %d", vetorA[i], i, vetorB[i]);
    }

  }
}

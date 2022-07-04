import java.util.Scanner;

public class Atividade5Lista3 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    /*
     * Criar um vetor A com 10 elementos inteiros e escreva a quantidade de
     * elementos armazenados neste vetor que são pares.
     */
    int[] vetorA = new int[10];
    int i, nPares = 0;

    for (i = 0; i < 10; i++) {
      System.out.println("Digite um valor inteiro: ");
      vetorA[i] = sc.nextInt();
      if (vetorA[i] % 2 == 0) {
        nPares += 1;
      }
    }
    System.out.printf("Total de números pares digitados: %d", nPares);

  }
}
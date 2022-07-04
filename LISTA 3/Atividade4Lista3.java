import java.util.Scanner;

public class Atividade4Lista3 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    /*
     * Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um
     * vetor C com a subtração dos elementos de A e B.
     */
    int[] vetorA = new int[10];
    int[] vetorB = new int[10];
    int[] vetorC = new int[10];
    int i;
    for (i = 0; i < 10; i++) {
      System.out.println("Digite o primeiro valor da" + i + "° conta: ");
      vetorA[i] = sc.nextInt();
      System.out.println("Digite o segundo valor da" + i + "° conta: ");
      vetorB[i] = sc.nextInt();
      vetorC[i] = vetorA[i] - vetorB[i];
    }
    for (i = 0; i < 10; i++) {
      System.out.printf("\n%d - %d = %d", vetorA[i], vetorB[i], vetorC[i]);
    }

  }
}
import java.util.Scanner;

public class Atividade1Lista4 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int[] vetorA, vetorB;
    int i, j = 9;
    vetorA = new int[10];
    vetorB = new int[10];

    for (i = 0; i < 10; i++) {
      System.out.println("Digite um número: ");
      vetorA[i] = sc.nextInt();
      vetorB[j] = vetorA[i];
      j -= 1;
    }

    for (i = 0; i < 10; i++) {
      System.out.println(vetorB[i]);

    }

    /*
     * Ler um vetor A com 10 elementos e construir um vetor B de mesmo tipo e
     * tamanho e com os mesmos elementos de A, sendo que estes deverão estar
     * invertidos, ou seja, o primeiro elemento de A passa a ser o último de B, o
     * segundo elemento de A passa a ser o penúltimo de B e assim por diante.
     */
  }
}
import java.util.Scanner;

public class Atividade2Lista3 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int[] vetorA = new int[10];
    int[] vetorB = new int[10];
    int i;

    for (i = 0; i < 10; i++) {
      System.out.printf("Digite um valor: ");
      vetorA[i] = sc.nextInt();
    }

    for (i = 0; i < 10; i++) {
      vetorB[i] = (int) Math.pow(vetorA[i], 2);
      System.out.printf("\n%d elevado ao quadrado é: %d", vetorA[i], vetorB[i]);
    }

  }
}
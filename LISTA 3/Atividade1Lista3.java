
/*Criar um vetor A com 9 elementos inteiros e depois escrever os elementos do vetor A na ordem
invertida em que foram armazenados.*/
import java.util.Scanner;

public class Atividade1Lista3 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int[] vetorA = new int[9];
    int i;

    for (i = 0; i < 9; i++) {
      System.out.println("Digite um valor: ");
      vetorA[i] = sc.nextInt();
    }

    for (i = 8; i > -1; i--) {
      System.out.println(vetorA[i]);
    }
  }
}

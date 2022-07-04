import java.util.Scanner;

public class Atividade4Lista4 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int[] vetorN = new int[20];
    int[] vetorM = new int[20];
    int i, j = 19;

    for (i = 0; i < 20; i++) {
      System.out.println("Digite um número: ");
      vetorN[i] = sc.nextInt();
      vetorM[i] = vetorN[i];
    }

    for (i = 0; i < 20; i++) {
      vetorN[i] = vetorM[j];
      j++;
      System.out.println(vetorN[i]);

    }

  }
}
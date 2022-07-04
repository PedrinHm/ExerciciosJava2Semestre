import java.util.Scanner;

public class vetor8lista4 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int vetorA[];
    int vetorB[];
    int vetorC[];
    vetorA = new int[6];
    vetorB = new int[6];
    vetorC = new int[12];
    int i;

    System.out.println("Digite 6 valores para A: ");
    for (i = 0; i < 6; i++) {
      vetorA[i] = sc.nextInt();
    }
    System.out.println("Digite 6 valores para B: ");
    for (i = 0; i < 6; i++) {
      vetorB[i] = sc.nextInt();
      vetorC[i] = vetorA[i];
    }
    System.out.println("Os valores de A de 1 até 6 e os valores de B de 7 até 12 são: ");
    for (i = 6; i < 12; i++) {
      vetorC[i] = vetorA[i];
      System.out.println(vetorC);
    }
  }
}
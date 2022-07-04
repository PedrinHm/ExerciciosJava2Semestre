import java.util.Scanner;

public class ProvaN2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    char aux;
    int i, j, min, n;

    System.out.println("Digite a quantia de caracteres: ");
    n = sc.nextInt();
    char vetor[] = new char[n];

    for (i = 0; i < vetor.length; i++) {
      System.out.println("Digite caracteres: ");
      vetor[i] = sc.next().charAt(0);
    }

    System.out.println("Vetor desordenado: ");
    for (i = 0; i < vetor.length; i++) {
      System.out.print(vetor[i] + "  ");
    }
    System.out.println(" ");

    System.out.println("__________________________________________________________");
    for (i = 1; i < vetor.length; i++) {
      aux = vetor[i];
      j = i - 1;
      while (j >= 0 && aux < vetor[j]) {
        vetor[j + 1] = vetor[j];
        j--;
      }
      vetor[j + 1] = aux;

    }

    System.out.println(" ");
    System.out.println("Vetor ordenado em ordem crescente: ");

    for (i = 0; i < vetor.length; i++) {
      System.out.print(vetor[i] + "  ");
    }
  }
}
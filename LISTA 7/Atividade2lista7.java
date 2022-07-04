import java.util.Scanner;

public class Atividade2lista7 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int vector[] = { 9, 75, 77, 18, 48, 14, 2, 4, 91, 57, 56, 29, 22, 5, 8, 60, 62, 93, 97, 7, 49, 87, 81, 71, 38, 78,
        99, 19, 31, 67 };
    int aux, i, j;

    for (i = 1; i < vector.length; i++) {
      aux = vector[i];
      j = i - 1;
      while (j >= 0 && aux < vector[j]) {
        vector[j + 1] = vector[j];
        j--;
      }
      vector[j + 1] = aux;

    }

    System.out.println("Digite o número a ser procurado: ");
    int procurado = sc.nextInt();

    int inicio = 0;
    int fim = vector.length - 1;
    int meio = 0;
    int verificador = 0;

    while (inicio <= fim) {
      meio = (inicio + fim) / 2;

      if (vector[meio] == procurado) {
        System.out.printf("\nO número %d foi encontrado na posição %d", procurado, meio);
        verificador = 1;
        break;
      } else if (vector[meio] > procurado) {
        fim = meio - 1;
      } else {
        inicio = meio + 1;
      }
    }
    if (verificador == 0) {
      System.out.printf("\nO número %d não foi encontrado no vetor.", procurado);
    }
  }

}

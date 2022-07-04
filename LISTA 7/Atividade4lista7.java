import java.util.Scanner;

public class Atividade4lista7 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int i;

    System.out.print("Digite o tamanho do vetor: ");
    int tamanho = sc.nextInt();

    int vetor[] = new int[tamanho];

    for (i = 0; i < vetor.length; i++) {
      System.out.printf("Digite um valor para a posição %d: ", i);
      vetor[i] = sc.nextInt();
    }

    for (i = 1; i < vetor.length; i++) {
      int aux = vetor[i];
      int j = i - 1;
      while (j >= 0 && aux < vetor[j]) {
        vetor[j + 1] = vetor[j];
        j--;
      }
      vetor[j + 1] = aux;
    }

    System.out.println("Vetor Ordenado: ");
    for (i = 0; i < vetor.length; i++) {
      System.out.print(vetor[i] + " ");
    }

    System.out.println(" ");
    System.out.println("Digite o número a ser procurado: ");
    int procurado = sc.nextInt();

    int inicio = 0;
    int fim = vetor.length - 1;
    int meio = 0;
    int verificador = 0;
    int interacao = 0;
    while (inicio <= fim) {
      meio = (inicio + fim) / 2;
      interacao++;
      if (vetor[meio] == procurado) {
        System.out.printf("\nO número %d foi encontrado na posição %d", procurado, meio);
        verificador = 1;
        break;

      } else if (vetor[meio] > procurado) {
        System.out.printf("\nInteração %d", interacao);
        for (i = meio; i <= fim; i++) {
          System.out.printf("\nNúmero descartado: %d", vetor[i]);
        }
        fim = meio - 1;
      } else {
        int aux2 = inicio;
        inicio = meio + 1;
        System.out.printf("\nInteração %d", interacao);
        for (i = aux2; i < inicio; i++) {
          System.out.printf("\nNúmero descartado: %d", vetor[i]);
        }

      }

    }

    if (verificador == 0) {
      System.out.printf("\nO número %d foi encontrado na posição -1", procurado);
    }

  }
}
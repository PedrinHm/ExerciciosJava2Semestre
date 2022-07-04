import java.util.Scanner;

public class Atividade2lista8 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int matrix[][] = new int[15][5];
    int linha, coluna = 0, aux = 0;

    for (linha = 0; linha < 15; linha++) {
      for (coluna = 0; coluna < 5; coluna++) {
        System.out.printf("\nLinha %d | Coluna %d\nDigite um número: ", linha, coluna);
        matrix[linha][coluna] = sc.nextInt();
      }
    }
    int menor = matrix[0][0];

    for (linha = 0; linha < 15; linha++) {
      for (coluna = 0; coluna < 5; coluna++) {
        System.out.printf("\t%d", matrix[linha][coluna]);
        if (matrix[linha][coluna] < menor) {
          menor = matrix[linha][coluna];
          aux = linha;
        }
      }
      System.out.printf("\n");
    }

    int maior = menor;
    int colunaminmax = coluna;
    int linhaminmax = aux;

    for (coluna = 0; coluna < 5; coluna++) {
      if (matrix[aux][coluna] > maior) {
        maior = matrix[aux][coluna];

      }
    }

    System.out.printf("\nMinmax: %d \nMenor número da matriz: %d\nLinha do minmax: %d \nColuna do minmax: %d", maior,
        menor, linhaminmax, colunaminmax);

  }
}
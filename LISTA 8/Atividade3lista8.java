import java.util.Scanner;

public class Atividade3lista8 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int matrix[][] = new int[15][5];
    int repete[][] = new int[15][5];
    int linha, coluna, linha1, coluna1;

    for (linha = 0; linha < 15; linha++) {
      for (coluna = 0; coluna < 5; coluna++) {
        System.out.printf("\nLinha %d | Coluna %d\nDigite um número: ", linha, coluna);
        matrix[linha][coluna] = sc.nextInt();
      }
    }

    for (linha = 0; linha < 15; linha++) {
      for (coluna = 0; coluna < 5; coluna++) {
        System.out.printf("\t%d", matrix[linha][coluna]);
      }
      System.out.printf("\n");
    }

    for (linha = 0; linha < 15; linha++) {
      for (coluna = 0; coluna < 5; coluna++) {
        for (linha1 = 0; linha1 < 15; linha1++) {
          for (coluna1 = 0; coluna1 < 5; coluna1++) {
            if (matrix[linha][coluna] == matrix[linha1][coluna1]) {
              repete[linha][coluna] = repete[linha][coluna] + 1;
            }
          }
        }
      }
    }

    for (linha = 0; linha < 15; linha++) {
      for (coluna = 0; coluna < 5; coluna++) {
        for (linha1 = 0; linha1 < 15; linha1++) {
          for (coluna1 = 0; coluna1 < 5; coluna1++) {
            if (repete[linha][coluna] > 1) {
              System.out.printf("\nO número %d repete %d vezes", matrix[linha][coluna], repete[linha][coluna]);
              for (linha1 = 0; linha1 < 15; linha1++) {
                for (coluna1 = 0; coluna1 < 5; coluna1++) {
                  if (matrix[linha][coluna] == matrix[linha1][coluna1]) {
                    repete[linha1][coluna1] = 0;
                  }
                }
              }
            }
          }
        }
      }
    }

  }
}
import java.util.Scanner;

public class Atividade4lista8 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int matrix[][] = new int[8][8];
    int linha, coluna, contador = 0;

    for (linha = 0; linha < 8; linha++) {
      for (coluna = 0; coluna < 8; coluna++) {
        System.out.printf("\nLinha %d | Coluna %d\nDigite um número: ", linha, coluna);
        matrix[linha][coluna] = sc.nextInt();
      }
    }

    for (linha = 0; linha < 8; linha++) {
      for (coluna = 0; coluna < 8; coluna++) {
        System.out.printf("\t%d", matrix[linha][coluna]);
      }
      System.out.printf("\n");
    }

    for (linha = 0; linha < 8; linha++) {
      for (coluna = 0; coluna < 8; coluna++) {
        if (matrix[linha][coluna] != matrix[coluna][linha]) {
          contador++;
        }
      }
    }

    if (contador == 0) {
      System.out.printf("\nA matriz é simétrica.");
    } else {
      System.out.printf("\nA matriz não é simétrica.");
    }

  }
}
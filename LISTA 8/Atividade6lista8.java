public class Atividade6lista8 {
  public static void main(String args[]) {
    int matrix1[][] = new int[5][7];
    int matrix2[][] = new int[6][6];
    int linha, coluna;
    for (linha = 0; linha < 5; linha++) {
      for (coluna = 0; coluna < 7; coluna++) {
        if (linha == 0 || linha == 4 || coluna == 0 || coluna == 6) {
          matrix1[linha][coluna] = 1;
        } else {
          matrix1[linha][coluna] = 2;
        }
      }
    }

    System.out.printf("\n");
    for (linha = 0; linha < 5; linha++) {
      for (coluna = 0; coluna < 7; coluna++) {
        System.out.printf("\t%d", matrix1[linha][coluna]);
      }
      System.out.printf("\n");
    }

    for (linha = 0; linha < 6; linha++) {
      for (coluna = 0; coluna < 6; coluna++) {
        if (linha == coluna) {
          matrix2[linha][coluna] = 1;
        } else if ((linha + 1) + (coluna + 1) == 7) {
          matrix2[linha][coluna] = 2;
        } else {
          matrix2[linha][coluna] = 3;
        }
      }
    }

    System.out.printf("\n");
    for (linha = 0; linha < 6; linha++) {
      for (coluna = 0; coluna < 6; coluna++) {
        System.out.printf("\t%d", matrix2[linha][coluna]);
      }
      System.out.printf("\n");
    }

  }
}
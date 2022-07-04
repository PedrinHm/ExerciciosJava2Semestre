public class Atividade5lista8 {
  public static void main(String args[]) {
    int matrix[][] = new int[3][6];
    int vector[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18 };
    int linha, coluna, cont = 0;

    for (linha = 0; linha < 18; linha++) {
      System.out.printf(" %d", vector[linha]);
    }

    for (linha = 0; linha < 3; linha++) {
      for (coluna = 0; coluna < 6; coluna++) {
        matrix[linha][coluna] = vector[cont];
        cont++;
      }
    }

    System.out.printf("\n");
    for (linha = 0; linha < 3; linha++) {
      for (coluna = 0; coluna < 6; coluna++) {
        System.out.printf("\t%d", matrix[linha][coluna]);
      }
      System.out.printf("\n");
    }

  }
}
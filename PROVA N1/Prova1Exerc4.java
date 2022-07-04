import java.util.Scanner;

public class Prova1Exerc4 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int i, numero, nPar = 0;
    int[] lista = { 0, 11, 32, 34, 46, 58, 67, 732, 18, 92 }; /* lista */

    for (i = 0; i < lista.length; i++) {
      if (lista[i] % 2 == 0) {
        nPar += 1;
      }
    }
    System.out.printf("Quantidade de números pares na lista: %d.", nPar);

  }
}

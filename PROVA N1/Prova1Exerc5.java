import java.util.Scanner;

public class Prova1Exerc5 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int i, aux, j = 19;
    int[] lista = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 }; /* lista */

    for (i = 0; i < 10; i++) {
      aux = lista[i];
      lista[i] = lista[j];
      lista[j] = aux;
      j = j - 1;

    }

    for (i = 0; i < lista.length; i++) {
      System.out.println(lista[i]);
    }
  }
}
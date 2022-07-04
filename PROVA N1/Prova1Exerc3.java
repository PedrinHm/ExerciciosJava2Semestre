import java.util.Scanner;

public class Prova1Exerc3 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int i, numero, menor;
    int[] lista = { 0, 1, 2, 23, 41, 15, 18, 17, 85, 90, 14, 3, -16, 38, 9, 1, 23 }; /* lista */

    menor = lista[0];

    for (i = 1; i < lista.length; i++) {
      if (lista[i] < menor) {
        menor = lista[i];
      }
    }
    System.out.printf("O menor número da lista é %d.", menor);

  }
}
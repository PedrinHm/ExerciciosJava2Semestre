import java.util.Scanner;

public class Prova1Exerc2 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int i, numero, cont = 0;
    int[] lista = { 0, 1, 2, 23, 41, 15, 18, 17, 85, 90, 14, 3, 16, 38, 9, 1, 23 }; /* lista */

    System.out.println("Digite um número: ");
    numero = sc.nextInt();

    for (i = 0; i < lista.length; i++) {
      if (numero == lista[i]) {
        cont++;
      }
    }
    if (cont > 0) {
      System.out.printf("O número %d está na lista. Ele apareceu na lista %d vezes.", numero, cont);
    } else {
      System.out.printf("O número não aparece na lista.");
    }
  }
}
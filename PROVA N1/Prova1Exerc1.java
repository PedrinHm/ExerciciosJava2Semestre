import java.util.Scanner;

public class Prova1Exerc1 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int i, numero, aux = 0;
    int[] lista = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }; /* lista */

    System.out.println("Digite um número: ");
    numero = sc.nextInt();

    for (i = 0; i < lista.length; i++) {
      if (numero == lista[i]) {
        System.out.printf("O número %d está na lista. no indice: %d", lista[i], i);
      } else {
        aux += 1;
      }
    }
    if (aux != 9) {
      System.out.printf("O número %d não está na lista.", numero);
    }
  }
}
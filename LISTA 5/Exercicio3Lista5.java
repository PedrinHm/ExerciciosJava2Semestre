import java.util.Scanner;

public class Exercicio3Lista5 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int l[] = { 82, 50, 71, 63, 85, 43, 39, 97, 14 };
    int min, aux, i, k, aux2 = 0;

    System.out.println("Vetor desordenado: ");
    for (i = 0; i < l.length; i++) {

      System.out.print(" " + l[i]);
    }

    for (i = 0; i < l.length - 1; i++) {
      min = i;
      for (int j = i + 1; j < l.length; j++) {
        if (l[j] < l[min]) {
          min = j;
        }
      }
      aux = l[min];
      l[min] = l[i];
      l[i] = aux;
      System.out.printf("\n-----------------------------\n");
      aux2++;
      System.out.printf("\n%d\t", aux2);
      for (k = 0; k < l.length; k++) {
        System.out.print(" " + l[k]);
      }
    }
    System.out.printf("\n-----------------------------\n");
    System.out.println("Vetor ordenado: ");

    for (i = 0; i < l.length; i++) {
      System.out.print(" " + l[i]);
    }
  }
}
/*
 * Simule a execução do método selectionsort, conforme o exemplo da imagem para
 * ordenar o vetor L=〈82, 50, 71, 63, 85, 43, 39, 97, 14〉.
 */
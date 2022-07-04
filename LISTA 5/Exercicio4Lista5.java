import java.util.Scanner;

public class Exercicio4Lista5 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String caract[] = { "c", "d", "b", "a" };
    int min, i;
    String aux;

    System.out.println("Vetor de entrada: ");

    for (i = 0; i < caract.length; i++) {
      System.out.println(caract[i]);
    }

    for (i = 0; i < caract.length - 1; i++) {
      min = i;
      for (int j = i + 1; j < caract.length; j++) {
        if (caract[j].compareTo(caract[min]) < 0) {
          min = j;
        }
      }
      aux = caract[min];
      caract[min] = caract[i];
      caract[i] = aux;
    }

    System.out.println("\nVetor ordenado: ");

    for (i = 0; i < caract.length; i++) {
      System.out.println(caract[i]);
    }

  }
}
/* Adapte o método selectionsort para ordenar um vetor de caracteres. */
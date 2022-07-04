import java.util.Scanner;

public class Atividade5Lista7 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String A[] = new String[100];
    int i = 0, j, k, min;

    System.out.println("Para finalizar a entrada digite um valor igual a 0000.");
    System.out.println("Digite o codigo: ");
    A[i] = sc.next();
    String x = "0000";
    while (A[i].compareTo(x) != 0) {
      i++;
      A[i] = sc.next();
    }

    for (j = 0; j < i; j++) {
      min = j;
      for (k = j + 1; k < i; k++) {
        if (A[k].compareTo(A[min]) < 0)
          min = k;
      }
      String aux = A[min];
      A[min] = A[j];
      A[j] = aux;
    }

    System.out.println("Saída: ");
    for (j = 0; j < i; j++) {
      if (A[j].charAt(j) >= '0' && A[j].charAt(j) <= '9') {
        if (A[j].length() == 4) {
          System.out.println(" " + A[j]);
        }
      }
    }
  }
}
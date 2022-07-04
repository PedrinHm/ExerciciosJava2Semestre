//Modifique o código do método de ordenação BubbleSort para que ele se transforme no método
//de ordenação por pedra, ou seja, o elemento “desce” ao invés de “subir” no vetor ordenado.
public class Exerc1Lista6 {
  public static void main(String args[]) {

    int vetor[] = { 45, 56, 12, 43, 95, 19, 8, 67 };

    int aux = 0;

    int i = 0;

    System.out.println("Vetor desordenado: ");
    for (i = 0; i < vetor.length; i++) {

      System.out.println(vetor[i]);
    }

    for (i = 1; i < vetor.length; i++) {
      for (int j = 0; j < vetor.length - 1; j++) {
        if (vetor[j] < vetor[j + 1]) {
          aux = vetor[j];
          vetor[j] = vetor[j + 1];
          vetor[j + 1] = aux;
        }
      }
    }

    System.out.println("");
    System.out.println("Vetor Ordenado: ");
    for (i = 0; i < vetor.length; i++) {
      System.out.println("" + vetor[i]);
    }

  }
}

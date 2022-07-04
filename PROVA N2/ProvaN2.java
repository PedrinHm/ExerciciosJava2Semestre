public class ProvaN2 {
  public static void main(String[] args) {
    char vetA[] = { 'a', 'c', 'b', 'd', 'e', 'h', 'f', 'i', 'g' };
    char aux;
    int i, j, min;

    System.out.println("Vetor desordenado: ");
    for (i = 0; i < vetA.length; i++) {
      System.out.print(vetA[i] + " | ");
    }
    System.out.println(" ");

    System.out.println("===================================");
    for (i = 1; i < vetA.length; i++) {
      aux = vetA[i];
      j = i - 1;
      while (j >= 0 && aux < vetA[j]) {
        vetA[j + 1] = vetA[j];
        j--;
      }
      vetA[j + 1] = aux;

      for (int ij = 0; ij < vetA.length; ij++) {
        System.out.print(vetA[ij] + " | ");
      }
      System.out.println(" ");
      System.out.println("===================================");
    }

    System.out.println(" ");
    System.out.println("Vetor em ordem crescente: ");

    for (i = 0; i < vetA.length; i++) {
      System.out.print(vetA[i] + " | ");
    }
  }
}
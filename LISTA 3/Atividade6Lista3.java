import java.util.Scanner;

public class Atividade6Lista3 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int[] vetorA = new int[10];
    int i, somaInf = 0, quantIg = 0, mediaMaior = 0, media = 0;

    for (i = 0; i < 10; i++) {
      System.out.println("Digite um número inteiro: ");
      vetorA[i] = sc.nextInt();
      if (vetorA[i] < 15) {
        somaInf += vetorA[i];
      } else if (vetorA[i] > 15) {
        mediaMaior += vetorA[i];
        media += 1;
      } else {
        quantIg += 1;
      }
    }
    if (media > 0) {
      mediaMaior /= media;
    }
    System.out.printf(
        "\nSoma dos elementos inferiores a 15: %d \nQuantidade de elementos iguais a 15: %d \nA média dos elementos maiores que 15: %d",
        somaInf, quantIg, mediaMaior);

  }
}
import java.util.Scanner;

public class Atividade5Lista1 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int numero, soma = 1, i;

    System.out.printf("Digite um número: ");
    numero = sc.nextInt();

    for (i = 2; i < numero / 2 + 1; i++) {
      if (numero % i == 0) {
        soma += i;
      }
    }
    if (soma == numero) {
      System.out.printf("O Número %d é perfeito.", numero);
    } else {
      System.out.printf("O Número %d não é perfeito.", numero);
    }
  }
}

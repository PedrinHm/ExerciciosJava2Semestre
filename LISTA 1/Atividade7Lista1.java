import java.util.Scanner;

public class Atividade7Lista1 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int maior = 0, menor = 0;

    System.out.println("Digite valores inteiros positivos: ");
    int valor = sc.nextInt();
    if (valor > 0) {
      maior = valor;
      menor = valor;
    } else if (valor < 0) {
      while (valor < 0) {
        System.out.printf("\nValor negativo invalido.");
        System.out.println("Digite valores inteiros positivos: ");
        valor = sc.nextInt();
        menor = valor;
        maior = valor;
      }
    }

    while (valor != 0) {
      System.out.println("Digite valores inteiros positivos: ");
      valor = sc.nextInt();
      if (valor > 0) {
        if (valor > maior) {
          maior = valor;
        }
        if (valor < menor) {
          menor = valor;
        }
      } else if (valor < 0) {
        System.out.printf("\nValor negativo invalido.");
      }

    }
    System.out.printf("\nO maior valor é: %d \nO menor valor é: %d", maior, menor);

  }
}
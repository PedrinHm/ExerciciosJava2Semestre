import java.util.Scanner;

public class Atividade4Lista1 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int numero = 1;
    while (numero >= 0) {
      System.out.printf("\n Digite um número: ");
      numero = sc.nextInt();
      if (numero < 0) {
        System.out.printf("%d é negativo. \nFim de execução", numero);
      } else if (numero < 26) {
        System.out.printf("O número %d está entre 0 e 25.", numero);
      } else if (numero < 51) {
        System.out.printf("O número %d está entre 26 e 50.", numero);
      } else if (numero < 76) {
        System.out.printf("O número %d está entre 51 e 75.", numero);
      } else if (numero < 101) {
        System.out.printf("O número %d está entre 76 e 100.", numero);
      } else {
        System.out.printf("O número %d está acima de 100.", numero);
      }

    }

  }
}
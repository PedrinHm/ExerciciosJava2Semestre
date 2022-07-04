import java.util.Scanner;

public class Atividade2Lista1 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int contador = 0;

    while (contador < 1) {
      System.out.printf("\nDigite 3 valores: \nPara finalizar o programa digite os valores fora da ordem crescente.");
      int valor1 = sc.nextInt();
      int valor2 = sc.nextInt();
      int valor3 = sc.nextInt();

      if ((valor2 <= valor3) && (valor1 <= valor2)) {
        int soma = valor1 + valor2 + valor3;
        int media = soma / 3;
        int produto = valor1 * valor2 * valor3;
        System.out.printf("\nSoma: %d \nMédia: %d \nProduto: %d", soma, media, produto);
      } else {
        contador = 1;
        System.out.printf("\nFim de execução");
      }

    }
  }
}

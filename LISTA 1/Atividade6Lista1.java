import java.util.Scanner;

public class Atividade6Lista1 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.printf("Digite o valor da dívida: ");
    int divida = sc.nextInt();
    double dividaFim, vParcela = 0, vjuros, acumulador = 1.1;
    int parcelas = 0;
    for (int i = 3; i <= 12; i += 3) {

      parcelas += 3;

      dividaFim = divida * acumulador;
      vParcela = dividaFim / parcelas;
      vjuros = dividaFim - divida;
      acumulador += 0.05;
      System.out.printf(
          "\nValor da divida: %d  \nValor dos juros: %2f \nQuantidade de parcelas: %d \nValor da parcela: %2f \n------------------------------",
          divida, vjuros, parcelas, vParcela);

    }
  }
}

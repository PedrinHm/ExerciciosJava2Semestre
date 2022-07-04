import java.util.Scanner;

public class Atividade5Lista4 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int i;
    String[] nome = new String[5];
    int[] salario = new int[5];
    int[] tempoServico = new int[5];
    double[] aumento = new double[5];
    for (i = 0; i < tempoServico.length; i++) {
      System.out.println("Digite o nome do funcionário: ");
      nome[i] = sc.next();

      System.out.println("Digite o salário do funcionário " + nome[i] + ": ");
      salario[i] = sc.nextInt();

      System.out.println("Digite o tempo de serviço do funcionário (Em anos): ");
      tempoServico[i] = sc.nextInt();

    }
    System.out
        .printf("\n------------------------------------------\nLista dos funcionários que não receberam aumento\n");
    for (i = 0; i < nome.length; i++) {

      if (tempoServico[i] > 5 && salario[i] < 800) {
        aumento[i] = salario[i] * 1.35;
      } else if (tempoServico[i] > 5) {
        aumento[i] = salario[i] * 1.25;
      } else if (salario[i] < 800) {
        aumento[i] = salario[i] * 1.15;
      }

      if (aumento[i] == 0) {
        System.out.println("O funcionário " + nome[i] + " não recebeu aumento.");
      }
    }

    System.out.printf("\n------------------------------------------\nLista dos funcionários que receberam aumento");

    for (i = 0; i < nome.length; i++) {
      if (aumento[i] != 0) {
        System.out.printf("\nO funcionário " + nome[i] + " vai receber: %2f", aumento[i]);
      }
    }

  }

}
import java.util.Scanner;

public class Atividade3Lista1 {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int i = 0;

    System.out.printf("\nDigite o primeiro elemento da progressão aritmética: ");
    int elemento1 = sc.nextInt();
    System.out.printf("\nDigite a razão da progressão aritmética: ");
    int razao = sc.nextInt();
    System.out.printf("\nDigite o número de termos: ");
    int nelementos = sc.nextInt();
    System.out.println("PA: " + elemento1);

    for (i = 1; i <= nelementos; i++) {
      elemento1 += razao;
      System.out.println("PA: " + elemento1);
    }

    System.out.println("Digite um novo elemento para a progressão geométrica: ");
    elemento1 = sc.nextInt();

    System.out.println("Digite uma nova razão: ");
    razao = sc.nextInt();

    for (i = 0; i < nelementos; i++) {
      System.out.println("PG: " + elemento1);

      if (elemento1 > 0) {
        elemento1 *= razao;
      }
    }
  }
}
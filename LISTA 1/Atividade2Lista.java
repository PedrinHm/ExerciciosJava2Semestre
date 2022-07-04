
/*Faça um programa que leia vários conjuntos de três valores inteiros e mostre para cada conjunto:
sua soma, seu produto e sua média. O programa para quando um conjunto não entrar com seus
valores em ordem crescente.*/
import java.util.Scanner;

public class Atividade2Lista1 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int contador = 0;
    while (contador < 1) {
      System.out.println("Digite 3 valores: ");
      int valor1 = sc.nextInt();
      int valor2 = sc.nextInt();
      int valor3 = sc.nextInt();

      if ((valor3 <= valor2) | (valor2 <= valor1)) {
        int soma = valor1 + valor2 + valor3;
        int media = soma / 3;
        System.out.printf("\nSoma: %d \nMédia: %d \nProduto: ", soma, media);
      } else {
        contador = 1;
      }

    }
  }
}

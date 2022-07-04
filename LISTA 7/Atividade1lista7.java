import java.util.Scanner;

public class Atividade1lista7 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int vector[] = { 9, 75, 77, 18, 48, 14, 2, 4, 91, 57, 56, 29, 22, 5, 8, 60, 62, 93, 97, 7, 49, 87, 81, 71, 38, 78,
        99, 19, 31, 67 };
    int acum = 0;
    System.out.print("Digite o número a ser procurado: ");
    int procurado = sc.nextInt();

    for (int i = 0; i < vector.length; i++) {
      if (procurado == vector[i]) {
        System.out.printf("O número %d foi encontrado na posição %d", procurado, i);

      } else {
        acum++;
        if (acum == 30) {
          System.out.printf("O número %d não foi encontrado no vetor.", procurado);
        }
      }

    }
  }
}
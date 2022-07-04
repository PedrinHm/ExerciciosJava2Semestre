import java.util.Scanner;

public class Atividade1lista8 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int matrix[][] = new int[10][3];
    int menor[] = { 11, 11, 11, 11, 11, 11, 11, 11, 11, 11 };
    int menorT[] = { 11, 11, 11 };
    int cont[] = { 0, 0, 0 };
    int i, j;

    for (i = 0; i < 3; i++) {
      for (j = 0; j < 10; j++) {
        System.out.printf("\na nota %d° do aluno %d: ", i + 1, j + 1);
        matrix[j][i] = sc.nextInt();
      }
      System.out.printf("\n--------------------------------\n");
    }

    for (i = 0; i < 3; i++) {
      for (j = 0; j < 10; j++) {
        if (matrix[j][i] < menor[j]) {
          menor[j] = matrix[j][i];
        }
        if (matrix[j][i] < menorT[i]) {
          menorT[i] = matrix[j][i];

        }

      }
    }

    for (i = 0; i < menor.length; i++) {
      System.out.printf("\nAluno %d \tMenor nota: %d", i + 1, menor[i]);
    }

    for (j = 0; j < 10; j++) {
      for (i = 0; i < 3; i++) {
        if (matrix[j][i] == menorT[i]) {
          cont[i]++;
        }
      }
    }

    System.out.printf("\n--------------------------------\n");
    for (i = 0; i < menorT.length; i++) {
      System.out.printf("\nProva %d \tN° de alunos com a menor nota: %d", i + 1, cont[i]);
    }

  }
}
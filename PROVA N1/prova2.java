import java.util.Scanner;

public class prova2 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int cont[] = new int[15];
    int k = 0, alunos = 0;
    char gabarito[] = new char[15];
    char resposta[] = new char[15];

    System.out.print("Digite o nº de alunos: ");
    alunos = sc.nextInt();

    System.out.println("Gabarito da prova: ");

    for (int i = 0; i < 15; i++) {
      System.out.printf("Resposta da questão %d: ", i + 1);
      gabarito[i] = sc.next().charAt(0);
    }
    for (int i = 0; i < alunos; i++) {

      System.out.printf("\nO aluno %d:", i + 1);

      for (int j = 0; j < 15; j++) {

        System.out.printf("\nDigite a resposta da questão %d:", j + 1);
        resposta[j] = sc.next().charAt(0);

        if (resposta[j] == gabarito[i]) {
          cont[k]++;

        }

      }
      k++;
    }

    for (int i = 0; i < alunos; i++) {
      System.out.printf("\nAluno %d acertou %d questões.", i + 1, cont[i]);
    }
  }
}
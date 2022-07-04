public class Atividade1Lista1 {
  public static void main(String args[]) {
    int divisao = 0;
    int contador = -1;
    int result = 0;
    for (int i = 1; i <= 99; i++) {
      if (i % 2 != 0) {

        contador += 2;
        divisao = contador / i;
        result += divisao;
        System.out.println(contador);
        System.out.println("result" + result);
      }

    }
    System.out.println("resultado: " + result);

  }
}
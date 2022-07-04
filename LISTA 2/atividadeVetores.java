public class atividadeVetores {

  public static void main(String args[]) {

    int x;
    double soma = 0;
    double[] fractions = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    System.out.println(fractions[4]);

    fractions[9] = 1.667;
    fractions[6] = 3.333;

    for (x = 0; x < fractions.length; x++) {
      soma += fractions[x];
    }
    System.out.println(soma);
  }
}

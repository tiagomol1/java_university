import java.util.Scanner;

public class setimaQuestao {
  public static void main(String[] args) {
    Scanner ent = new Scanner(System.in);
    int a = 12, b = 12, total = 0;
    Double media;

    while(a --> 0){
      System.out.println("Digite um valor Inteiro: ");

      int c = ent.nextInt();

      total += c;
    }

    media = (double)total / (double)b;

    System.out.printf("\nA media dos numeros digitados e: %.2f\n", media);

  }
}

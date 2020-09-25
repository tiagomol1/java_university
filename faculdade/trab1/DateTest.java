import java.util.Scanner;

public class DateTest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Date date = new Date(0, 0, 0);

    System.out.println("Informe o dia: ");
    date.setDay(input.nextInt());
    System.out.println("Informe o mes: ");
    date.setMonth(input.nextInt());
    System.out.println("Informe o ano: ");
    date.setYear(input.nextInt());
    
    System.out.println(date.displayDate());

  }
}

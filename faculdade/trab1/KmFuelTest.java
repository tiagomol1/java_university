import java.util.Scanner;

public class KmFuelTest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String execute = "S";

    while(execute == "S" || execute == "s"){
      System.out.println("Deseja registrar uma nova viagem? [S]-Sim || [N]-Não");
      execute = input.nextLine();
      System.out.println()
    }

  }
}

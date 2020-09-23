import java.util.Scanner;

public class EmployeeTest{

  public static void main (String[] args){
    Employee e = new Employee("", "", 0.0);
    Scanner input = new Scanner(System.in);

    String name, lastName;
    System.out.println("Informe seu nome: ");
    name = input.nextLine();
    e.setName(name);

    System.out.println("Nome: "+ e.getName());

  }

}
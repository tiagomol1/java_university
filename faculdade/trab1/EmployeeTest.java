import java.util.Scanner;

public class EmployeeTest{

  public static void main (String[] args){
    
    Employee a = new Employee("", "", 0.0);
    Employee b = new Employee("", "", 0.0);
    Scanner input = new Scanner(System.in);

    System.out.println("A - Informe seu nome: ");
    a.setName(input.nextLine());
    System.out.println("A - Informe seu sobrenome: ");
    a.setLastName(input.nextLine());
    System.out.println("A - Informe seu salario: ");
    a.setSalary(input.nextDouble());

    System.out.println("B - Informe seu nome: ");
    b.setName(input.nextLine());
    System.out.println("B - Informe seu sobrenome: ");
    b.setLastName(input.nextLine());
    System.out.println("B - Informe seu salario: ");
    b.setSalary(input.nextDouble());

    System.out.println(".");
    System.out.println(".");
    System.out.println(".");
    System.out.println("-----------------------");
    System.out.println("A - Nome: "+ a.getName()); 
    System.out.println("A - Sobrenome: "+ a.getLastName());
    System.out.println("A - Salario: "+ a.getSalary());
    System.out.println("A - Salario Anual: " + a.yearlySalary(a.getSalary()));
    System.out.println("A - Salario Anual + 10%: "+ a.yearlySalaryMoreTenPorcent(a.getSalary()));
    System.out.println("-----------------------");
    System.out.println("B - Nome: "+ b.getName()); 
    System.out.println("B - Sobrenome: "+ b.getLastName());
    System.out.println("B - Salario: "+ b.getSalary());
    System.out.println("B - Salario Anual: " + b.yearlySalary(b.getSalary()));
    System.out.println("A - Salario Anual + 10%: " + b.yearlySalaryMoreTenPorcent(b.getSalary()));

  }

}
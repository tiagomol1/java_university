public class Employee{
  
  private String name;
  private String lastName;
  private Double salary;

  public Employee(String name, String lastName, Double salary){
    this.name = name;
    this.lastName = lastName;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public String getLastName() {
    return lastName;
  }

  public Double getSalary() {
    return salary;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

}
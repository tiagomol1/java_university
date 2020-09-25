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
    if(salary >= 0){
      this.salary = salary;
    }
  }

  public Double yearlySalary(Double salary){
    return salary * 12;
  }

  public Double yearlySalaryMoreTenPorcent(Double salary){
    return (salary + (salary * 0.10)) * 12;
  }


}
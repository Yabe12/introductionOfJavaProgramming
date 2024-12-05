
class employ{
  int id;
  String name;
  double salary;
  public void displayDetails() {
    System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
}
}
public class secondClass {
  public static void main(String[] args) {
      employ emp = new employ();
      emp.id = 1;
      emp.name = "John Doe";
      emp.salary = 50000.0;
     emp.displayDetails ();
  }
}

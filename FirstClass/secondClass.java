
class employ{
  int id;
  String name;
  double salary;
  public employ(int id, String name, double salary){
    this.id = id;
    this.name = name;
    this.salary = salary;
  }
  public String getName(){
    return name;
  }
  public int getid(){
    return id;
  }


  public void displayDetails() {
    System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
}
}
public class secondClass {
  public static void main(String[] args) {
      employ emp = new employ(1,"John",5000);
 emp.displayDetails ();
     employ emp1=new employ(2,"haile",5050);
     System.out.println(emp1.getid());

     emp1.displayDetails();

  }
}
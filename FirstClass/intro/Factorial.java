class factorial{
  int x;
  int factor;
  public factorial(int x){
    this.x = x;
    this.factor = 1;  
    for(int i = 1; i <x; i++){
    factor=i*factor;
    };
   
    public void displayDetails() {
      System.out.println("Factorial of " + x + " is: " + factor);
  }
  }
}
public class Factorial {
  public static void main(String[] args) {
    factorial num = new factorial(3);
  }
  
}

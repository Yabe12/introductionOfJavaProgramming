// write the programm that  read two intger from the keybord and display the value before swapping them using without variabble ?
import java.util.Scanner;

public class swapWithOutVar{
  public static void main(String[] args) {
      Scanner number = new Scanner(System.in);
      System.out.print("Enter the first number: ");
      int A = number.nextInt();
      System.out.print("Enter the second number from the");
      int B = number.nextInt(); 
      A = A + B; 
      B = A - B;  
      A = A - B; 
    
      System.out.println("A number is: " + A + " B number is: " + B );
      number.close();
  }
}
 

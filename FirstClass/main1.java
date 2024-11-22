// write the programm that  read two intger from the keybord and display the value before swapping them using the third variabble ?
import java.util.Scanner;

public class main1{
  public static void main(String[] args) {
      Scanner number = new Scanner(System.in);
      System.out.print("Enter the first number: ");
      int A = number.nextInt();
      System.out.print("Enter the second number from the");
      int B = number.nextInt(); 
      int Temp = A;
       A = B;
       B = Temp;
      System.out.println("A number is: " + A + " B number is: " + B );
      number.close();
  }
}
 

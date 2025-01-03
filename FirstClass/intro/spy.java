

public class spy {

   public static void main(String[] args) {
  
    int A = 200;
    int sum=0;
    int time=1;
   int num=A ;
   while (num > A) {
     num=A%10;
      sum+=num;
      time*=time;
    }
     if (time==sum){
        System.out.println("Spy");
      }else{
        System.out.println("Not Spy");
      }
}
}
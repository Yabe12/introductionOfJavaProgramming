class animal {
    public void makeSound() {
        System.out.println("Can make sound");
    }
}

class cat extends animal {
  
    public void makeSound() {
        System.out.println("miaw miaw");
    }
}

public class Animals {
    public static void main(String[] args) {
       
      cat a = new cat();
      a.makeSound();
   
     
    }
}

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
       
      animal a = new cat();
      a.makeSound();
   
     
    }
}

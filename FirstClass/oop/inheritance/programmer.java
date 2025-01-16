class animal {
    public void makeSound() {
        System.out.println("Can make sound");
    }
}
class Manager extends animal {
  
    public void makeSound() {
        System.out.println("miaw miaw");
    }
}
class Developer extends animal {
  
    public void makeSound() {
        System.out.println("miaw miaw");
    }
}
class programmer extends animal {
  
    public void makeSound() {
        System.out.println("miaw miaw");
    }
}

public class programmer {
    public static void main(String[] args) {
       
      cat a = new cat();
      a.makeSound();
   
     
    }
}

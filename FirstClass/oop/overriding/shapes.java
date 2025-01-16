class shapes {
    float Perimater;
    float Area;
    public void getPerimater(float length,float weight) {
     Perimater = 2 * (length + weight);
     System.out.println("Perimeter of shape is calculated"+ Perimater);
    }
    public void getArea(float length,float weight) {
    Area = length * weight;
    System.out.println("Area of circle is calculated" +Area);
       
    }

}

class circle extends shapes {
public double getPerimater(float radius) {
   return 2*Math.PI*radius
    ;}
public double getArea(float radius) {
return 2*Math.PI*radius
    ;}

}
public class shapes {
    public static void main(String[] args) {
       
      circle a = new circle();
      a.getPerimater(12);
      a.getArea(12);
   
     
    }
}

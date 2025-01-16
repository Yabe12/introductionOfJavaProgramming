class Shapes {
    float perimeter;
    float area;

    // Method to calculate perimeter for a rectangle
    public void getPerimeter(float length, float weight) {
        perimeter = 2 * (length + weight);
        System.out.println("Perimeter of shape is: " + perimeter);
    }

    // Method to calculate area for a rectangle
    public void getArea(float length, float weight) {
        area = length * weight;
        System.out.println("Area of shape is: " + area);
    }
}

class Circle extends Shapes {
    // Method to calculate perimeter (circumference) for a circle
    public void getPerimeter(float radius) {
        perimeter = 2 * 3.14f * radius;
        System.out.println("Perimeter of circle is: " + perimeter);
    }

    // Method to calculate area for a circle
    public void getArea(float radius) {
        area = 3.14f * radius * radius;
        System.out.println("Area of circle is: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.getPerimeter(12); // Call method for circle perimeter
        circle.getArea(12);     // Call method for circle area

        Shapes rectangle = new Shapes();
        rectangle.getPerimeter(10, 5); // Call method for rectangle perimeter
        rectangle.getArea(10, 5);     // Call method for rectangle area
    }
}

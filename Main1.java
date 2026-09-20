interface Shape 
{ 
    double calculatePerimeter(); 
} 
class Circle implements Shape 
{ 
    double radius; 
    Circle() 
    { 
    } 
    Circle(double radius) 
    { 
        this.radius = radius; 
    } 
    public double calculatePerimeter() 
    { 
        return 2 * Math.PI * radius; 
    } 
}
class Rectangle implements Shape 
{ 
    double length; 
    double width; 
    public Rectangle(double length, double width) 
    { 
        this.length = length; 
        this.width = width; 
    } 
    public double calculatePerimeter() 
    { 
        return 2 * (length + width); 
    } 
}
public class Main1 
{ 
    public static void main(String[] args) 
    { 
        Circle c = new Circle(5); 
        Rectangle re= new Rectangle(4, 6); 
        System.out.println("Perimeter of Circle: " + c.calculatePerimeter()); 
        System.out.println("Perimeter of Rectangle: " + re.calculatePerimeter()); 
    } 
} 
 
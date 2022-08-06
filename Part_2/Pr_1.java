/*
    Design a class named Circle containing following attributes and behavior.
    • One double data field named radius. The default value is 1.
    • A no-argument constructor that creates a default circle.
    • A Single argument constructor that creates a Circle with the specified radius.
    • A method named getArea() that returns area of the Circle.
    • A method named getPerimeter() that returns perimeter of it.
*/

// Neel Goyani - 21CE036

public class Pr_1 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Area is " + c1.getarea() + "Perimeter is " + c1.getperimeter());
        Circle c2 = new Circle(5);
        System.out.println("Area is " + c2.getarea() + "Perimeter is " + c2.getperimeter());
    }
}

class Circle {
    private double radius;

    // private double area;
    // public final double pi = 3.14;
    Circle() {
        radius = 1.0;
    }

    Circle(double r) {
        radius = r;
    }

    public double getperimeter() {
        return Math.PI * 2 * radius;
    }

    public double getarea() {
        return radius * radius * Math.PI;
    }
}
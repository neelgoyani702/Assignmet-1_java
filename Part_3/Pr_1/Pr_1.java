// import java.util.*;

public class Pr_1 {
    public static void main(String[] args) {
        Circle c = new Circle(10);
        System.out.println(c.getArea());
        Rectangle r = new Rectangle(10,20);
        r.getArea();
        System.out.println(r.getArea());
        if(c.getArea() > r.getArea())
        {
            System.out.println("Circle Area is Big");
        }
        else
        {
            System.out.println("Rectangle Area is Big");
        }
    }
}

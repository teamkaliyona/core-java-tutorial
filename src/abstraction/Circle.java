package abstraction;

public class Circle extends Shape {

    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    void calculateArea(){
        double area = 3.14 * radius * radius;
        System.out.println("Area of the circle is " + area);
    }

    public static void main(String[] args) {
        Shape rect = new Rectangle(10,20);
        rect.drawShape("Rectangle");
        rect.calculateArea();

        Shape circle = new Circle(20);
        circle.drawShape("Circle");
        circle.calculateArea();
    }
}

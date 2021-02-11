package interfaceExamples;

public class Circle implements Drawable{

    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    public void draw(){
        System.out.println("Drawing a circle");
    }

    public void calculateArea(){
        double area = 3.14 * radius * radius;
        System.out.println("Area of circle is " + area);
    }

    public static void main(String[] args) {
        Drawable rect = new Rectangle(10,20);
        rect.draw();
        rect.calculateArea();

        Drawable circle = new Circle(30);
        circle.draw();
        circle.calculateArea();
    }
}

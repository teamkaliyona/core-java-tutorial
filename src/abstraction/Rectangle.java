package abstraction;

public class Rectangle extends Shape {

    double length;
    double width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    void calculateArea(){
        double area = length * width;
        System.out.println("Area of a Rectangle is " + area);
    }

}

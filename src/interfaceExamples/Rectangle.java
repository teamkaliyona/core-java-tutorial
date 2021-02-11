package interfaceExamples;

public class Rectangle implements Drawable {

    double length;
    double width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public void draw(){
        System.out.println("Drawing a rectangle");
    }

    public void calculateArea(){
        double area = length * width;
        System.out.println("Area of rectangle is " + area);
    }
}

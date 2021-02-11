package codingChallenges.inheritance;

public class Rectangle extends Shapes {

    double width;

    void calculateArea(){
        double area = super.length * this.width;
        System.out.println("Area of rectangle is " + area);
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.name = "Rect1";
        rect.length = 10;
        rect.width = 20;
        rect.printName();
        rect.calculateArea();
    }
}

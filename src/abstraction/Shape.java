package abstraction;

public abstract class Shape {

    //non-abstract method
    void drawShape(String shapeName){
        System.out.println("Drawing a " + shapeName);
    }

    //abstract method
    abstract void calculateArea();
}

package Polymorphism;

public class Marketing extends Company {

    void getInformation(){
        System.out.println("Printing Marketing team details");
        System.out.println("No. of employees in marketing team is 30");
    }

    public static void main(String[] args) {
        Marketing obj = new Marketing();
        obj.getInformation();
    }
}

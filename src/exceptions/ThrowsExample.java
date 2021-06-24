package exceptions;

public class ThrowsExample {

    int calculateRemainder(int num1, int num2) throws ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException {
        return num1/num2;
    }

    public static void main(String[] args) {
        try {
            ThrowsExample obj = new ThrowsExample();
            obj.calculateRemainder(30, 0);
        } catch(ArithmeticException exp){
            System.out.println(exp.getMessage());
            System.out.println("Please provide valid inputs");
        }
    }
}

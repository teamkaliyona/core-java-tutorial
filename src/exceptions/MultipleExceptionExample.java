package exceptions;

public class MultipleExceptionExample {
    public static void main(String[] args) {
//        try{
//            int num[] = {0,1,2,3,4};
//            int ans = num[7] / num[0];
//        } catch(ArithmeticException exp){
//            System.out.println("Caused ArithmeticException");
//        } catch (ArrayIndexOutOfBoundsException exp1){
//            System.out.println("Caused ArrayIndexOutOfBoundsException");
//        } catch(Exception exp2){
//            System.out.println("Some other exception" + exp2.getMessage());
//        }

        try{
            int num[] = {0,1,2,3,4};
            int ans = num[7] / num[0];
        } catch(ArithmeticException | ArrayIndexOutOfBoundsException exp){
            System.out.println("Exception caused " + exp.getMessage());
        }
    }
}

package exceptions;

public class FinallyBlockExample {
    public static void main(String[] args) {
        try{
            String name = "Ankita";
            System.out.println(name.concat(": Hello"));
        }catch (NullPointerException exp){
            System.out.println("Name cannot be null");
        } finally {
            System.out.println("Thank you for choosing Kaliyona");
        }
    }
}

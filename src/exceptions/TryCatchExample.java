package exceptions;

public class TryCatchExample {

    public static void main(String[] args) {

        try{
            int num[] = {1,2,3,4,5};

            for(int i=0; i< 10; i++){
                System.out.println(num[i]);
            }

        }catch (ArrayIndexOutOfBoundsException exp){
            System.out.println("Exception caused due to array elements not present");
            System.out.println(exp.getMessage());
        }
        System.out.println("Thank you");

    }
}

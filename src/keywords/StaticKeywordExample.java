package keywords;

public class StaticKeywordExample {

    static int count = 0;

    static void counter(){
        count ++;
    }

    static {
        count ++ ;
    }

    public static void main(String[] args) {
        //StaticKeywordExample.count = 2;
//        StaticKeywordExample.counter();
//        StaticKeywordExample.counter();
//        StaticKeywordExample.counter();

        System.out.println("Count value is " + StaticKeywordExample.count);
    }

}

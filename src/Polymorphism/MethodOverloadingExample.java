package Polymorphism;

public class MethodOverloadingExample {

    int add(int a, int b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }

    long add(long a, long b){
        return a + b;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        MethodOverloadingExample obj = new MethodOverloadingExample();

        obj.add(a, b);

        obj.add(a, b, c);

        long x = 80;
        long y = 90;
        obj.add(x,y);
    }
}

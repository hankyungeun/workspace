package day01;

public class Typecast1 {
    public static void main(String[] args) {
        byte b = 25;
        short s = b;
        int i = s;
        long l = i;
        float f = i;
        double d = f;
        int b_1 = 256;
        System.out.println("b = " + b);
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("b_1 = " + b_1);
    }
}

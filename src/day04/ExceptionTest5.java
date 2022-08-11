package day04;

public class ExceptionTest5 {
    public static void m1() throws RuntimeException{
        System.out.println("예외처리가 필요해요");
    }

    public static void main(String[] args) {
        m1();
    }
}

package day04;

public class ExceptionTest1 {
    public static void main(String[] args) {
        System.out.println("프로그램 시작!!");
        int i = 6;

        try {
            // 예외가 실행될 것 같은 코드를 try에 넣어준다
            System.out.println(100 / i);
            int[] iarr = { 1, 2, 3, 4, 5, 6 };
            System.out.println(iarr[i]);
            // 예외가 발생한 시점에서 try블럭 안의 코드는 실행되지 않는다

        } catch (ArithmeticException e) {
            System.out.println("예외처리 코드 실행");
            System.out.println(e);
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("예외처리 코드 실행");
        } catch (Exception e) { // exception과 그 자손들 모두 들어올 수 있다
            System.out.println("예외처리 코드 실행");
        } finally { // 반드시 실행되어야 하는 부분
            System.out.println("반드시 수행할 코드!!");
        }
        System.out.println("프로그램 종료");
    }
}

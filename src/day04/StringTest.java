package day04;

public class StringTest {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = new String("hello");

        System.out.println(str1 == str2);       //str1과 str2는 주소 값이 같다
        System.out.println(str1 == str3);
        System.out.println(str4 == str3);

        str1 = str1.concat(" carami");     //concat 문자열 결합 함수
        System.out.println(str2);
        System.out.println(str1);
    }
}

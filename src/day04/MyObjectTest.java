package day04;

public class MyObjectTest {
    public static void main(String[] args) {
        MyObject myobj = new MyObject();

        System.out.println(myobj);
        System.out.println(myobj.toString());

        String str = "Kang";
        System.out.println(str);
        System.out.println(str.toString());

        Person person = new Person();
        person.setAge(20);
    }
}

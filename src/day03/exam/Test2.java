package day03.exam;

class Parent2 {
	int i = 5;

	public int get() {
		return i;
	}
}

class Child2 extends Parent2{
	int i = 10;
}

public class Test2 {
	public static void main(String[] args) {

		Parent2 p1 = new Parent2();
		System.out.println(p1.i);
		System.out.println(p1.get());

		Child2 c1 = new Child2();
		System.out.println(c1.i);
		System.out.println(c1.get());
	}
}

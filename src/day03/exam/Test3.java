package day03.exam;

class Parent3{
	int i = 5;
	public int get(){
		return i;
	}
}

class Child3 extends Parent3{
	int i = 10;
	public int get(){
		return i;
	}
}


public class Test3 {

	public static void main(String[] args) {

		Parent3 p1 = new Parent3();
		System.out.println(p1.i);
		System.out.println(p1.get());

		Child3 c1 = new Child3();
		System.out.println(c1.i);
		System.out.println(c1.get());
	}
}

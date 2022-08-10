package day03.exam;

class Parent1 {
	int i = 5;
	public int get(){
		return i;
	}
}

class Child1 extends Parent1{
	
}

public class Test1{
	public static void main(String [] args){
		Parent1 p1 = new Parent1();
		System.out.println(p1.i);
		System.out.println(p1.get());
		
		
		Child1 c1 = new Child1();
		System.out.println(c1.i);
		System.out.println(c1.get());
	}
}
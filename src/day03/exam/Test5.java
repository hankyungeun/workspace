package day03.exam;


class Parent5{
	int i = 5;
	public int get(){
		return i;
	}
}

class Child5 extends Parent5{
	int i = 10;
	public int get(){
		return i;
	}
	
	public void print(){
		System.out.println(i);
	}
}
public class Test5 {
	public void print(Parent5 p){
		System.out.println(p.i);
		System.out.println(p.get());
	}
	public static void main(String[] args) {
		Parent5 pc5 = new Child5();
		Parent5 pp5 = new Parent5();
		Child5 cc5 = new Child5();
		
		Test5 t5 = new Test5();
		t5.print(pc5);
		System.out.println("-----------parent--------");
		t5.print(pp5);
		
		System.out.println("-----------Child--------");
		t5.print(cc5);
	}

}

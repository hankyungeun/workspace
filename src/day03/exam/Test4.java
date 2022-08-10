package day03.exam;

class Parent4{
	int i = 5;
	public int get(){
		return i;
	}
}

class Child4 extends Parent4{
	int i = 10;
	public int get(){
		return i;
	}
	
	public void print(){
		System.out.println(i);
	}
}

public class Test4 {
	public static void main(String[] args){
		Parent4 c4 = new Child4();
		System.out.println(c4.i);
		System.out.println(c4.get());
	//	c4.print();
	}
}

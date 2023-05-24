package day10.constructors;

public class NonStaticVariable {

	int age=25;
	void display(int age) {
		System.out.println("age: "+age);
//		NonStaticVariable2 x1=new NonStaticVariable2();
//      System.out.println("NSGV age: "+x1.age);
		System.out.println("NSGV age: "+this.age);
	}
	public static void main(String[] args) {
		
		NonStaticVariable n1=new NonStaticVariable ();
		n1.display(50);

	}

}

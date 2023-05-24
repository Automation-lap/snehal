package day11.inheritances;
class Testing{
	void callme(int num) {
		System.out.println(num+" Calling......");
	}
	final void display() {
		System.out.println("I am display of Testing class");
	}
}
public class Inheritance11Final extends Testing{
	// final method can't be overridden
	// void display() {
	// System.out.println("I am display of inheritance11Final class");
	// }
	void callme(int xyz) {
		System.out.println("Calling..."+xyz);
		super.callme(456);
	}
public static void main(String[] args) {
		//TODO Auto-generated method stub
	Inheritance11Final t1=new Inheritance11Final();
	t1.callme(123);
	t1.display();

	}

}

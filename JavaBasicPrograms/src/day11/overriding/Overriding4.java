package day11.overriding;
class ABC {
	void myMethod() {
		System.out.println("method of ABC class");
	}
}
class Overriding4 extends ABC {
	public void myMethod() {
		//this will call the myMethod()of parent class
		super.myMethod();
		System.out.println("Overriding method of class Overriding4");
	}
public static void main(String[] args) {
		Overriding4 obj = new Overriding4();
		obj.myMethod();

	}

}

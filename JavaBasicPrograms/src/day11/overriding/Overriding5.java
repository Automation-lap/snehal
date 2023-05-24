package day11.overriding;
//Base class or parent class or super class
class Parent {
	void show() {
		System.out.println("Parent's show()");
	}
}
//Inherited class or child class or sub class 
class Child extends Parent {
	//This method overrides show() of parent
	void show() {
		System.out.println("Child's show()");
	}
}
// Driver class
 class Overriding5 {

	public static void main(String[] args) {
		//If a parent type reference refers to a Parent object, then Parent's show is called
		  Parent obj1 = new Parent();
		  obj1.show();//Parent's show()//If a Parent type reference refers to a Child object Child's show() is called. This is called. this is called RUN TIME
		  // POLYMORPHISM
		  Parent obj2 = new Child();
		  obj2.show();//Child's show
}
}

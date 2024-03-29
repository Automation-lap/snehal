package day16.typecasting;
class GrandParent101{
	void myHome() {
		System.out.println("home belongs to GrandParent");
	}
}
class Parent101 extends GrandParent101{
	//Function
	void show() {
		// Print message for this class
		System.out.println("Parent show method is called");
	}
	void callme() {
		System.out.println("Parent callme method is called");
	}
}
class Child101 extends Parent101 {
	// Main driver method
	public static void main(String[] args) {
		System.out.println("**********Ref and Object both of child**************");
		//Object of child class and reference of child class
		Child101 c1=new Child101();
		c1.callme();
		c1.show();
		c1.myHome();
		System.out.println("**********Access only Parent member************");
		Parent101 p1=c1;//Auto upcasting --->Parent p1=c1=new Child();
		p1.myHome();
		p1.callme();
		p1.show();
		System.out.println("********Access only GrandParent member************");
		GrandParent101 g1=(GrandParent101)c1;//explicit upcasting
		g1.myHome();

	}

}

package day11.inheritances;
//super class/ parent class/ base class 
class Grandfather {
	Grandfather() {
		System.out.println("I am class Granderfather constrctor...");
	}
	void myHome() {
		System.out.println("I am home of Grandfather");
	}
}
//subclass / child class / derived class
class Father extends Grandfather {
	Father(double d) {
		//super();// if we don't write this then java compiler will write by default super()
		System.out.println("I am Class Father constructor....");
	}
	void myCar() {
		System.out.println("I am car of Father");
	}
}
class Child1 extends Father {
	Child1(int i) {
		super(12.34);
		System.out.println("I am Class Child constructor...");
	}
	void myBike() {
		System.out.println("I am bike of child");
	}
}
public class Inheritance6 {
              public static void main(String[] args) {
		         System.out.println("***************************************************");
		         Child1 c1 = new Child1(21); // home, car & bike
		         c1.myHome();
		         c1.myCar();
		         c1.myBike();
		        System.out.println("*****************************************************");
		        // creating an object or instance of child most class and referred by its parent
		        // Father f2=new Child1(25);
		        // Father f1=new Father(254.1);
		        
		        
                 Father f1 = c1;//Father f1 = c1=new Child1(21); home, car but bike will not be 
                 //visible/accessible to father;
                 f1.myHome();
                 f1.myCar();
                 //f1.myBik(); //error as its a property of child
                 System.out.println("****************************************");
                 // creating an object or instance of child most class and referred by its parent
                 Grandfather g1 = c1; //Grandfather g1=c1=new Child1(21); home but car & bike will not be visible/accessible to Grandfather
                 g1.myHome();
      //         g1.myCar();
      //           g1.myBike();
                 System.out.println("****************************************");
	}

}

/*
 *  statements are two type
 *  1. Homogeneous: LHS = RHS
 *  2. Heterogeneous: LHS != RHS
 *   int age=20; //
 *   Homogeneous
 *          double salary=25000;
 *          //Heterogeneous
 *          
 *          A a1 = new A();
 *          A a1 = new B();
 */


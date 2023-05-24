package day10.constructors;

 class C {
	 double i;
	 C(double j) {
		 System.out.println("Running Class C constructor...");
		 i = j;
	 }
 }
 public class Cons6 {
	 public static void main(String[] args) {
		 System.out.println("main() of Class Cons5 is started....");
		 C b1 = new C(25.34);
		 System.out.println("Class C global variable i = " + b1.i);
		 b1.i=14.65;
		 System.out.println("Class C global variable i = " + b1.i);
		 System.out.println("===================================");
		 C b2 = new C(55.32);
		 System.out.println("Class C global variable i = " + b2.i);
		 System.out.println("Main() of Class Cons5 is ends here.....");
	}

}

 /**
  * What is the use for parameterized constructor?
  * with the help of parameterized constructor, for every instance we can initialize different value of non-static variables. 
  */

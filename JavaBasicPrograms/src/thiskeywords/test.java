package thiskeywords;

 class test {
	 void m() {
		 System.out.println("hello m");
		 }
	 void n() {
		 System.out.println("hello n");
		 //m();//same as this.m()
		 this.m();
		}
 }
 class ThisKeyword31 {
	 void methodOne() {
		 System.out.println("Inside Method ONE");
	 }
	 void methodTwo() {
		 System.out.println("Inside method TWO");
		 this.methodOne();// same as calling methodOne()
		 //methodOne();
	 }
  public static void main(String[] args) {
	  ThisKeyword31 obj = new ThisKeyword31();
	  obj.methodTwo();
	  test a = new test();
	  a.n();
	}

}

 /**
  * This keyword is a predefined keyword
  * its a current class instance 
  * use to access non static members
  * should be used only inside non-static member
  * ideally used to diff. non static global variable and local variable when they have same name.
  */

package day7.staticMethods;

public class MethodSyntaxExamples {
	// static global variables
	static int age;
	static double salary;
	/**
	 * This is a static method with return type as int and no parameter in it 
	 * method type: static 
	 * Access Modifier: public
	 * non-access Modifier: static
	 * return type: int
	 * method name: test1
	 * argument: no
	 * return value: 201201
	 */
	public static int test1() {
		System.out.println("I am test1 method.");
		//logic
	//int pin=20201;
	//	return pin;
		return 201201;
	}
	/**
	 *This is a static method with return type as void and having no parameter
	 * Method type: static
	 * Access modifier: default
	 * non-access Modifier: static
	 * return type: void
	 * method name: test2
	 * argument: no  
	 * return value: no 
	 */
      static void test2() {
    	  System.out.println("I am test2 method");
    	  //return; this will be written by java compiler at compile
      }
      /**
       * Method type: static
       * Access Modifier: public 
       * non-access Modifier: static
       * return type: double
       * method name: test3
       * argument: boolean
       * return value: d
       */
      static public double test3(boolean b1) {
    	  System.out.println("");
    	  double d=15.36;
    	  return d;
      }
      /**
       * this is a static private method with return type as void and having parameter as float
       * Method type: static
       * Access Modifier: private
       * non-access Modifier: static
       * return type: void
       * method name: test4
       * argument: float
       * return value: no
       */
      static private void test4(float f) {
    	  System.out.println("");
      }
      /**
       * Method type: static
       * Access Modifier: public
       * non-access Modifier: static
       * method name: main
       * argument name: String[]
       * return value: no
       */
	public static void main(String[] args) {
		

	}

}












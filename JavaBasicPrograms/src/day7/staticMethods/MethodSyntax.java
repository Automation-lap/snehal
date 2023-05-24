package day7.staticMethods;

		/**
		 * This class contains method examples
		 * @author Asus
		 */
    public class MethodSyntax {
    	
    	/**
    	 * Method type: static
    	 * Access Modifier: default
    	 * non-access Modifier: static
    	 * return type: void
    	 * method name: testMyCode
    	 * argument: no
    	 * return value: no
    	 * */
    	
    	static void testMyCode() {
    		
    		//return;// its completely optional, if you don't write it then java compiler will write on behalf of you
    	}
    	/**
    	 * Method type: non-static
    	 * Access Modifier: private
    	 * non-access Modifier: non-static
    	 * return type: double
    	 * method name:getSalary
    	 * argument: no
    	 * return value: 15.356
    	 * 
    	 */
    	private double getSalary() {
    		System.out.println("");
    		return 15.356;
    	}
    	/**
    	 * Method Type: non-static
    	 * Access Modifier: protected
    	 * non-access Modifier: non-static
    	 * return type: int
    	 * method name: empId
    	 * argument: no
    	 * return value:x
    	 */
    	 protected int empId() {
    		 int x=101;
    		 return x;
        }
    	 /**
    	  * Method type: static
    	  * Access Modifier: default
    	  * non-access Modifier: static
    	  * return type: boolean
    	  * method name: deptNum3
    	  * argument: int 
    	  * return value: res
    	  */
    	 static boolean deptNum3(int num) {
    		 boolean res=(num==15);
    		  return res;
    	 }
    	 /**
    	  * Method type: non-static
    	  * Access Modifier: private
    	  * non-access Modifier: non-static
    	  * return type: char
    	  * method name: deptnum4
    	  * argument:boolean
    	  * return value: A
    	  */
    	 private char deptnum4(boolean b1) {
    		 return 'A';
    	 }
    	 /**
    	  * Method type: non-static 
    	  * Access Modifier: public
    	  * non-access Modifier: non-static
    	  * return type: void
    	  * method name: main
    	  * argument:String[]
    	  * return value: no
    	  */
    	 public static void main(String[] args) {
       }
    }
	

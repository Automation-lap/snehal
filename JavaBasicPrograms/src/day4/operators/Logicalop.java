package day4.operators;

public class Logicalop {
	
	public static void main(String[] args) {
		// variables Definition and Initialization
		boolean bool1 = true, bool2 = false;
		
		//Logical AND
		System.out.println("bool1 && bool2 = " +(bool1 && bool2));//
		
		// Logical OR
		System.out.println("bool1 || bool2 = " + (bool1 || bool2));//
		
		// Logical Not
		System.out.println("bool1 && bool2 = "+ (bool1 && bool2 ));//

	}


}

/**
 * LHS & RHS result should be in boolean format
     && ---> and
 * LHS && RHS ---> if both side are having result as true then its will return true else false
 * true && true --->true
 * false && false-----> false
 * true && false -----> false
 
     
  * ||---> or 
  * LHS || RHS ---> if any one side return true then the result will be true else false
  * true || true---> true
  * false || true--> true
  * true || false ---> true
  * false || false----> false
  
  
  ! ---> not
 */


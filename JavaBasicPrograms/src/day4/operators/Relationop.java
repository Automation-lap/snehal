package day4.operators;

public class Relationop {

	public static void main(String[] args) {
		//Variables Definition and Initialization
		int num1 = 5, num2 = 55;
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		// is equal to 
		boolean res = (num1 == num2);
		System.out.println("num1 == num2 = " +  res);//
		        //or
		System.out.println("num1 == num2 = " + (num1 == num2));//
		// is not equal to 
		System.out.println("num1 != num2 = " + (num1 != num2));//
		// Greater than
		System.out.println("num1 > num2 = " +  (num1 > num2));//  
        // Less than
		System.out.println("num1 < num2 = "+ (num1 < num2));//
		// Greater than or equal to
		System.out.println("num1 >= num2 = "+ (num1>=num2));//
		// Less than or equal to
		System.out.println("num1 <= num2 = "+ (num1 <= num2));//
	
  }

}

package day19.exceptionhandling;

import java.util.Scanner;

public class ExceptionalHandling1 {
	public static void main(String[] args) {
		System.out.println("program starts from here...");
		//1. abnormal statements
		int i,j,k;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter first num1: ");
		i=scn.nextInt();
		System.out.println("Enter first num2: ");
		j=scn.nextInt();
		try{
			System.out.println("******You are inside try block **********");
			k= i/j;//ArithmeticException
			System.out.println("res: "+k);
			System.out.println("*********No Exceptuin found***********");
		}catch(ArithmeticException obj) {
			System.out.println("*********You are in catch()*********");
			System.out.println("Exception handled, exception msg "+obj.getMessage());// / by zero
			System.out.println("Exception handled, exception name and msg "+obj);//java.lang.ArithmeticException: / by zero
			//obj.printStackTrace();//complete exception detail
			System.out.println("******Exception Handled*******");
		}		
		System.out.println("Programs ends here...");
	}
}
/**
 * Exception aahe exceptional nahi by mistake save zal tya mul error yenar
1. try ---> throws some exeception -----> catch() has to catch it
2. try ---> throws some exeception -----> catch() donesn't that type of declaration dn jvm will terminate the program execution
3. try ---> doesn't have any exception -----> dn catch block will not be executed
*/
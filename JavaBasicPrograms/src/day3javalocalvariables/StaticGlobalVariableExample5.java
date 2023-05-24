package day3javalocalvariables;

public class StaticGlobalVariableExample5 {
	//static global variables
	static int num1,num2=25,res;
public static void main(String[] args) {
	System.out.println("Program Starts");
	  //we can access static global variables using classname from here as main() is also static
	System.out.println("Number1 is :"+num1);
	System.out.println("Number2 is : "+num2);
	res=num1+num2;
	System.out.println("Result is :"+res);
	System.out.println("****************************");
	num1=75;
	System.out.println(" updated Number1 is : "+num1);
	System.out.println("Number2 is : "+num2);
	res=num1+num2;
	System.out.println("updated result is :"+res);
	System.out.println("******************************");
	num1=85;
	num2=65;
	System.out.println("updated Number1 is : "+num1);
	System.out.println("updated Number2 is : "+num2);
	res=num1-num2;
	System.out.println("updated Result is : "+res);
	System.out.println("Program ends");
		

	}

}

package day3javalocalvariables;

public class StaticGlobalVariableExample2 {
	//static global variables
	static int age;
	static boolean res;
	static char grade;
	static float roi;

	public static void main(String[] args) {
		System.out.println("Program Starts");
		//we can access static global variables directly from here as main() is also static
		System.out.println("default value of age is: "+age);
		System.out.println("default value of res is: "+res);
		System.out.println("default value of grade is: "+grade);
		System.out.println("default value of roi is: "+roi);
		System.out.println("Program ends");
         	  

	}

}

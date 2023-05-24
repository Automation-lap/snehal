package day7.staticMethods;

public class Example1 {

	public static void display() {
			System.out.println("Hi, I am snehal");
			System.out.println("I learning core-java");
			System.out.println("My contact no. is 7447691805");
	}
	static void showDetails(String name,char grade,int num) {
		System.out.println("Hi, I am "+name);
		System.out.println("Your grade is "+grade);
		System.out.println("My contact number is "+num);
	}
	static void addNumber() {
		int num1=20, num2=30,res;
		res=num1+num2;
		System.out.println("Number1 is : "+num1);
		System.out.println("Number2 is : "+num2);
		System.out.println("Result is : "+res);
	}
	public static void main(String[] args) {
		display();//we can run this method multiple times, but you will get same result for each run
		
	//System.out.println(display());// as this won;t return any value hence we can;t write it inside println()
		  showDetails("Pune", 'A', 986656);
		  showDetails("Mumbai", 'B', 123456);
		  showDetails("Delhi", 'C', 98562);
		  System.out.println("*******************************");
		  addNumber();
		  addNumber();
	
		}

	}



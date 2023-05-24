package day10.constructors;

public class StaticVariable {
        
	static int age=25, salary;
	public static void main(String[] args) {
		System.out.println("Static global Age: "+age);//25
		int age=10;//Local variable
		System.out.println("Age: "+age);//10
		System.out.println("Static global varaible: "+StaticVariable.age);//25
		display();
	}
	static void display() {
		System.out.println("Salary: "+salary);//0
		int salary=25000;//Local variable
		System.out.println("Salary: "+salary);//25000
		System.out.println("Static global Salary: "+StaticVariable.salary);//0

	}

}

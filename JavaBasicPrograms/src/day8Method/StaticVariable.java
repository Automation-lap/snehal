package day8Method;

public class StaticVariable {
	static int age=25,salary;
	public static void main(String[] args) {
		System.out.println("Static global Age: "+age);//25
		int age=10;
		System.out.println("Age: "+age);//10
        System.out.println("Static global variable: "+StaticVariable.age);//25
        display();
	}
	static void display() {
		System.out.println(" salary: "+salary);//0
		int salary=25000;
		System.out.println("Salary: "+salary);//25000
		System.out.println("Static global Salary: "+StaticVariable.salary);
		}
	}



/**
 * This keyword is an instance of current class
 * This keyword is used to differentiate non-static global variable and local variable when they have same name.
 */

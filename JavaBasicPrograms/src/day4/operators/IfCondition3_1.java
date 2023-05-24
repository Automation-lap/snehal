package day4.operators;

public class IfCondition3_1 {

	public static void main(String[] args) {
		// Creating two variables for age and weight
		int age = 18;
		int weight = 50;
		// applying condition on age and weight
		if (age>= 18) {
			System.out.println("condidate age is: "+age);
			if (weight > 50) {
				System.out.println("You are eligible to donate blood");
			}else {
				System.out.println("You are not eligible to donote blood, as your weight is less");
			}
		} else {
			System.out.println("Age must be greater than 18");
				
		}

	}

}

package day4.operators;

public class IfCondition3 {

	public static void main(String[] args) {
		// Creating two variables for age and weight
		int age = 19;
		int weight = 58;
		char grp = '0';
		// applying condition on age and weight
		if (age >= 18) {
			if (weight > 50) {
				if (grp == 'A') {
					System.out.println("You are eligible to donate blood");
				} else {
					System.out.println("you are not eligible to donate blood, as your blood group is not matching");
				}
				} else {
					System.out.println("You are not eligible to donate blood, your weight is below 55");
				}
		} else {
			System.out.println("You are not eligible to donate blood, as your are is below 18");
			
		}

	}

}

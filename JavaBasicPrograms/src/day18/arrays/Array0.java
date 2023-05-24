package day18.arrays;

public class Array0 {

	public static void main(String[] args) {
//    String[] cars;
//    cars=new String[4];
		//or
		String[] cars=new String[4];
		
//   cars[0]="Volvo";
//	 cars[0]="BMW";	
//   cars[2]="Ford";
//   cars[3]="Mazda";
		//or
		String[] Cars = {"Volvo", "BMW", "Ford", "Mazda"};
		// Accesss the Elements of an Array
		System.out.println(cars[0]);//Volvo
		// Change an Array Element
		cars[0] = "Opel";
		System.out.println(cars[0]);//Opel
		// array element count
		System.out.println("*******Normal for-loop**********");
		// iterate array elements using for loop
		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		System.out.println("*********for-each loop*************");
		// iterate array elements using for loop
		for(String i : cars) {
			System.out.println(i);
		}
		}
	}



package day5.loops;

public class ForLoop4 {

	public static void main(String[] args) {
		
		// for (int i = 0; i< 3; ++i) {
		// System.out.println("*********************************** Hello i: " + i);
	//}
	 
	for (int i = 0; i < 3; ++i) {
		System.out.println("Hello i: " + i);
		for (int j = 0; j < 2; j++) {
			System.out.println("\thi j: " + j);
		}
		}
        System.out.println("******************************");
        for (int i = 0; i < 3; ++i) {
        	System.out.println("Hello i: " + i);
        	for (int j = 0; i < 3; ++i) {
        		System.out.println("\thi j: " + j);
        		for (int k = 0; k < 2; k++) {
        			System.out.println("\t\tbye k: " + k);
        		}
        	}	
        }
        System.out.println("**********Infinite loop*************");
        for (int i = 1; i>= 0; i++) {
        	if ((i % 2 == 0)) {
        		  System.out.println(i);
        	}
        }
	}
}

package day5.loops;

public class DoWhileloop {

	public static void main(String[] args) {
	  
		int c = 10;
	  System.out.println("Printing al the numbers from 10 till 1");
	  do {
		    // printing all the numbers till 10
		    System.out.println(c);
		    --c;
		    } while (c > 0);
	   
	}
}


/*
 *  do-while execution order:
 *  1. body 
 *  2. condition
 */
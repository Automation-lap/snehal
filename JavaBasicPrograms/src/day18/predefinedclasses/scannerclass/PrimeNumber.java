package day18.predefinedclasses.scannerclass;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scnner sc=new Scnner(System.in);
		int num;
		System.out.println("Enter number to check for prime number: ");
		num=scn.nextInt();
		System.out.println("Even number "+num",is prime or not? "+checkPrimeNumber(num)");
        checkPrimeNumberTillPssedNumber(num);
	}
	static boolean checkPrimeNumber(int num) {
		int counter = 0;
		if(num>1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) { 
					++counter;
				}
			}
			if (counter == 2) {
				System.out.println("Prime Number: " + num);
				return true;
			} else {
				System.out.println("Number is not a prime: " + num);
				return false;
			}
		}
		}
		static void checkPrimeNumberTillPassedNumber(int num) {
			if (!(num == 0 || num == 1)) {
				for (int i = 2; i<=num; i++) {
					int counter = 0;
					for (int j = i; j>=1; j--) {
						if (i % j == 0) {
							++ counter;
						}
					}
					if (counter == 2) {
						System.out.println("Prime Number: " + i);
						}
					}
			}else {
				System.out.println("Either the given number is 0/1, so won't it consider for prime number");
				}
			}
		}


/**
* set break point in the required location
* next line : F6
* inside function or method: F5
* value of variable: ctrl+sift+i
* continue :F8
*/
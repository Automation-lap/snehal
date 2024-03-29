package day18.arrays;
 import java.util.Arrays;
 
 class M_Array3 {
	private Object copyTo;

	public static void main(String[] args) {
		// declaring a source array
		char[] copyFrom = {'d','e','c','a','f','f','e','i','n','a','t','e','d'};
		System.out.println("Elements count in copyFrom array: "+copyTo.length);
		// declaring a destination array
		char[] copyTo=Arrays.copyOf(copyFrom, copyFrom.length);
		System.out.println("Elements count in copyTo array: "+copyTo.length);
		for(int i=0;i<copyTo.length;i++) {
			System.out.print(copyTo[i]+ " ");
		}
		System.out.println("\n******************copy using range*************************");
		char[] copyWithRange=Arrays.copyOfRange(copyFrom, 3, copyFrom.length);
		for(int i=0;i<copyWithRange.length;i++) {
			System.out.print(copyWithRange[i]+" ");
		}
		System.out.println("\n**********After Sorting************");
		Arrays.sort(copyWithRange);
		for(char c: copyWithRange) {
			System.out.print(c +" ");
		}

	}

}
 
 /*
  * Arrays is a predefined class belongs to java.util package
  * it has so many useful function that can make developer life easier
  */

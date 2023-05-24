package day18.arrays;
import java.util.Arrays;
public class CheckArrayEements {

	public static void main(String[] args) {
		int[] empIds= {1,2,3,4,5,6,7,8,9};
		
		int[] cloneArr=empIds.clone();
		int[] cloneArr1=Arrays.copyOf(empIds, 2);
		int[] cloneArray2=Arrays.copyOfRange(empIds, 0,empIds.length);
		
		Arrays.sort(cloneArr);
		
		for(int a: empIds) {
			System.out.println(a+",");
		}
		System.out.println();
			for(int a:cloneArr) {
			System.out.println(a+",");
		}
	System.out.println();
	System.out.println(Arrays.equals(empIds, cloneArr));
}
	}

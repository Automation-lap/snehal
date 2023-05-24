package day18.predefinedclasses.objectclass;
class Demo{
	void display() {
		System.out.println("I am display()...");
	}
}
public class Example1 extends Demo{
	static int last_roll = 100;
	int roll_no;
	// Constructor
	Example1()
	{
		roll_no = last_roll;
		last_roll++;
}
   // Driver code
	public static void main(String[] args) {
		Demo d1=new Demo();
		System.out.println(d1);//d1.toString();-----
>day18.predefinedclasses.objectclass.Demo@234567DFHJK
		System.out.println("***************************************");
Example1 s = new Example1();
// Below two statements are equivalent
         System.out.println(s);//java complier writes--->s.toString() --->string representation of an object --> FQCN@HexadecimalAdress
         System.out.println(s.toString());//string representation of an object
         System.out.println("****************************************");
         Demo d2=new Example1();
         System.out.println(d2);
         System.out.println("****************************************");
         System.out.println(new Example1());
         

	}

}

/**
 * string representation ---> fullyqualifiedclassname@hexadecimaladress
 *                                        packagename.classname@hexadecimaladdress
 */

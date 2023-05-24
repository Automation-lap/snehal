package day18.predefineclasses;

public class SingleObject {
	/**
	 * 1. constructor should be private
	 * 2. create static ref variable of the class
	 * 3. create static method which return current class object
	 */
	private SingleObject(){
		System.out.println("SingleObject class constructor");
	}
	private static SingleObject s1=new SingleObject();
	
	public static SingleObject getSingleObjectInstance() {
		return s1;
	}
	int empId=105;
	void calling()
	{
		System.out.println("I am calling method of SingleObject class");
	}
}
class Demo{
	
	public static void main(String[] args) {
		//SingleObject s1=new SingleObject();
	
		SingleObject ref=SingleObject.getSingleObjectInstance();
		System.out.println(ref.empId);
		ref.calling();
		ref.empId=1001;
		System.out.println("with ref, Updated empId:"+ref.empId);
		
		SingleObject ref2=SingleObject.getSingleObjectInstance();
		System.out.println("with ref2, empId:"+ref2.empId);
		ref2.calling();
	}
}

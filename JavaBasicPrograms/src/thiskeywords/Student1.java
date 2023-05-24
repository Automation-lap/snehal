package thiskeywords;

class Student1 {
	//Global Variable
	int rollno;
	float fee;
	Student1(int rollno,float fee) {
		System.out.println("local rollno : "+rollno);
		System.out.println("local fee : "+fee);
		System.out.println("initial global rollno "+this.rollno);
		System.out.println("initialglobal fee : "+this.fee);
		// Global Variable = Local Variable;
		   this.rollno = rollno;
		   this.fee = fee;
		   System.out.println("after update, global rollno : "+this.rollno);
		   System.out.println("after update, intialglobal fee: "+this.fee);
	}
	void display() {
		System.out.println(rollno+ ""+ fee);
	   }
	}
class ThisKeyword11 {
	public static void main(String[] args) {
		System.out.println("***********with s1 refernce**************");
		Student1 s1 = new Student1(111, 5000f);
		s1.display();
		System.out.println("*********with s2 refernce****************");
		Student1 s2 = new Student1(112, 6000f);
		s2.display();

	}

}

/**
 * this()
 * this-> is an instance of current class which use to access non-static members of the class and it will be used only.
 * inside non-static member.
 * mainly used to diff when non-static global variable and local variable names are same.
*/

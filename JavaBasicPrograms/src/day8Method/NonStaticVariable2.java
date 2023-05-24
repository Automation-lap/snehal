package day8Method;

public class NonStaticVariable2 {
	int age=25;
	void display(int age) {
		System.out.println("age: "+age);
//      NonStaticVariable2 x1=new NonStaticVariable2();
//      System.out.println("NSGV age: "+x1.age);
		System.out.println("NSGV age: "+this.age);
		}
        public static void main(String[] args) {
        	NonStaticVariable2 n1=new NonStaticVariable2();
        	n1.display(50);
     }

}

/**
 * This keyword is an instance of current class
 * this keyword is used to differentiate non-static global variable and local variable when they have same name.
 * This keyword should used only inside non-static method/constructor.
 */

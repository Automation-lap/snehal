package day12.Abstractions;
//Interface
interface Animal10 {
	int age=20;//by default public static final
	public void animalSoud(); // interface method(does not have a body)
	public void sleep();//interface method(does not have a body)
}
//pig "implements" the Animal interface
class Pig7 implements Animal0 {
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}
	public void sleep() {
		// the body of sleep() is provided here
		System.out.println("Zzzz");
	}
}
class Interface6 {
public static void main(String[] args) {
	Pig7 myPig = new Pig7(); //Create a Pig object
	myPig.animalSound();
	myPig.sleep();
	myPig.sleep();
	System.out.println(Animal0.age);
	//Animal0.age=200;
	}
}

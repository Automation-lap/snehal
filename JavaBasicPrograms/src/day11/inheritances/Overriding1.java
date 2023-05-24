package day11.inheritances;
class Animal1 {
	Animal1(){
}
public void move() {
	System.out.println("Animals can move");
  }
}
class Dog extends Animal1 {
	Dog(){
		super();
	}
	public void move() {
		System.out.println("Dogs can walk and run");
	}
	public void bark() {
		System.out.println("Dogs can bark");
	}
}
public class Overriding1 {

	public static void main(String[] args) {
		Animal1 a = new Animal1(); // Animal reference and object
		a.move();
		Dog b = new Dog(); // Animal reference but Dog object
		b.move(); //
		b.bark(); //
		System.out.println("********************************");
		Animal1 a1=new Dog();// you will get dog class move(), bark()
		a1.move();//
		//a1.bark();// a1 compile time error since b's reference type Animal doesn't
		}
  }

/*
 * when we declare a method in child class which is already present in parent class then that method will be known as overrided method
 * 
 * Overriding :
         Happens between two class which will be involved inheritance
         Only non-static method can be overrided
            final or private method can;t be overrided
            static method can't be overried
            constructor can't be overried
     while overriding we can increase method visibility but can't decrease it
     - if we have declared a method with access modifier as-
          default ----> default or protected or public
          protected-----> protected or public
          public-----> public       
 */

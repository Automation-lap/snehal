package day7.staticMethods;

public class Example3 {
	
	public void display() {
		System.out.println("Hi, I am Sneha");
		System.out.println("You are learning core-java");
		System.out.println("My contact number is 8554843203");
	}
	void showDetails(String name,String subject,int num) {
		System.out.println("Hi, I am "+name);
		System.out.println("You are learning "+subject);
		System.out.println("My contact number is "+num);
	}
    void addNumber() {
    	int num1=20, num2=30,res;
    	res=num1+num2;
    	System.out.println("Number1 is : "+num1);
    	System.out.println("Number1 is : "+num2);
    	System.out.println("Number1 is : "+res);
    	}
    void addNumber(int num1,int num2) {
    	int res;
    	res=num1+num2;
    	System.out.println("Number1 is : "+num1);
    	System.out.println("Number1 is : "+num2);
    	System.out.println("Number1 is : "+res);
    }
     public static void main(String[] args) {
    	 //as all the above method are having return type as void, hence they won;t return any value
    	 
    	 Example3 e1=new Example3();
    	 e1.display();
    	 e1.showDetails("Sneh", "Net", 87775);
    	 e1.addNumber();
    	 e1.addNumber(25, 30);
    }
		

	}

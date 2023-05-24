package day12.Abstractions;
interface Bank {
	float rateOfInterest();//by default ---> public abstract
}
class SBI implements Bank {
	public float rateOfIntrest() {
		return 9.15f;
	}
}
class PNB1 implements Bank {
	public flaot rateOfIntrest() {
		return 9.7f;
	}
}

class Interface2 {
   public static void main(String[] args) {
		SBI1 s1=new SBI1();
		System.out.println("SBI ROI: " + s1.rateOfIntrest());
		PNB1 p1=new PNB1();
		System.out.println("PNB ROI: " + p1.rateOfIntrest());
		Bank b = new SBI1();
		System.out.println("ROI: " + b.rateOfIntrest());

	}

}

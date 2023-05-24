package day12.Abstractions;
abstract class RBIBank102 {
	final abstract double getRateOfIntrestForHomeLoan();
	//abstract mean must be overridden
	//final means can't be override
}
class SBI102 extends RBIBank {
	double getRateOfIntrestForHomeLoan() {
		return 6.45;
	}
}
public class abstractClass4 {

	public static void main(String[] args) {	

	}

}

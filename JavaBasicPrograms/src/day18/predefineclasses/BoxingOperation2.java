package day18.predefineclasses;

public class BoxingOperation2 {

	public static void main(String[] args) {
		
		char c1='A';
		Character charObj1=new Character(c1);//
		System.out.println(c1==charObj1);//
		Character charObj2=new Character('Z');//
		
		Character charObj3='H';//
		
		System.out.println("c1: "+c1);//
		System.out.println("charObj1: "+charObj1);
		System.out.println("charObje3: "+charObj3);
		
		boolean b=true;//
		Boolean bObj=new Boolean(b);//
		System.out.println(bObj==b);

	}

}

package day13.pack2;

import day13.pack1.PrivateMembers;

public class AccessPrivateMembers {

	public static void main(String[] args) {
		
		PrivateMembers p1=new PrivateMembers();
		System.out.println(p1.accNum);
		p1.displayAccNum();
   }
}
/*
 * if you try to access one package class to another package then you have to use import statement
 */
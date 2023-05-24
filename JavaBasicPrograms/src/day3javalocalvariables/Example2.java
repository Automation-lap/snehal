package day3javalocalvariables;
class VariableExample2
{

	public static void main(String[] args) {
		System.out.println("Program Starts");
		//syntax to declare a variable: datatype variablename;
	/*
	 datatype------> tells us what type of value this variable is going to hold
	 byte, short, int, long --> positive or negative number
	 float, double          --> decimal numbers
	 char                   --> character/alphabet
	 boolean                -->true/false
        */
		
	byte byteVariable;
	short shortVariable;
	int intVariable;
	long longVariable;
	float floatVariable;
	double doubleVariable;
	char charVariable;
	boolean booleanVariable;
	//Syntax to initlize a variable: variable name = value;
	byteVariable = 25;//-10 | -89
	shortVariable = 50;//-10 | -89
	intVariable = 150;//-10 | -89 | 
	longVariable = 2530l;//-10 | -89 | 25
	floatVariable = 25.36f;//25 |-69|5454 | 0.25f
	doubleVariable = 36.56d;//25 | -69 | 54.54| 0.256
	charVariable = 'A';//'a' | 'Z'
	booleanVariable = true;//true | false
	//print all the variable value in the console
	System.out.println("byteVariable");
	System.out.println(byteVariable);
	System.out.println(shortVariable);
	System.out.println(intVariable);
	System.out.println(longVariable);
	System.out.println(floatVariable);
	System.out.println(doubleVariable);
	System.out.println(charVariable);
	System.out.println(booleanVariable);
	System.out.println("Program ends");
 		
	}

}
/*
 * + -----> Addition
   LHS + RHS ------> if both sides are number then its will perform addition operation.
   number + number=result based on addition
   20 +30=50
   
   + ------> Concatenation
     LHS + RHS----> If anyone side its String then it will perform concatenation operation.
     "string value" + 25=string(result based on concatenation)
     
     "Demo"+25=demo25
     25 + "Demo"=25Demo
     
     "Demo"+25 + 35=Demo25+35=Demo2535
     
     "Testing"+45+10+55= Testing451055
     
     "Testing"+(47+10+55)="Testing"+110=Testing110
     
     10+20+30+"ABC"=60ABC
    
 */




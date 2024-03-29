package day18.predefinedclasses.objectclass;

public class Example0 {

	public static void main(String[] args) {
		Example0 e1=new Example0();
		System.out.println(e1);//java compiler will call toString() of object class to print the string form
		   System.out.println(e1.toString());
	}
}

/*
 * FQCN : day18.predefinedclasses.objectclass.Exampe0@jgjgt765767jhgj
 
 * Object:
           * predefined class belongs to java.long package
           * java.long package by default available in each class so no need to write explicitly
           * also known as parent most class or super most class in java
           * every java class directly or indirectly inherits this class
           * Object is have some useful methods like 
           * toString(), hashCode(), equals(), clone...
           * toString() gives string representation of an object in the form of
           * fullyQualifiedClassName@hexadecimalAdress packagename.classname@hexadecimalAddress
 */

//import java.lang.*; // implicit import

//import java.lang.Math;// explicit import

//import static java.lang.Math.sqrt; // static import
//import static java.lang.Math.random;
//import static java.lang.Math.max;

import java.lang.Math.*;
import static java.lang.System.out;
//import static java.lang.Byte.*;
import static java.lang.Integer.*;



public class StaticImport {

	static 
	{
		System.out.println("Hi hello namaste ::-:::");
	}
	public static void main(String[] args) 
	{
		System.out.println(Math.sqrt(45));
		System.out.println(Math.max(45,43));
		System.out.println(Math.random());
		System.out.println(Math.incrementExact(8));
		out.println("hello");
		out.println("hi");
		out.println("namaste");
		out.println(MIN_VALUE);
		out.println(MAX_VALUE);
	}

}

//create separate package MethodOverLoading
package MethodOverLoading;

//create class MyClass
public class MyClass {

	//Main method
	public static void main(String[] args){
		System.out.println(Add(5,30));
		System.out.println(Add(8.5,3.0));
		System.out.println(Add("Muthu","Kumar"));
	}
	//declare integer
	public static int Add (int a,int b) {
		return (a+b);
	}
	//declare double
	public static double Add (double a,double b) {
		return (a+b);
	}
	//declare String
	public static String Add (String a,String b) {
		return (a+b);
	}
}

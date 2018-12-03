//Create separate Package Abstraction
package Abstraction;

	//Create Abstract Class Abstraction
abstract class Abstraction
{
	/*
	 * Create Abstract Method
	 * No implementation in Abstract Method. Only can pass Arguments like int a, int b
	 */
	abstract void run();
	
	//Create Non-Abstract Method
	void print()
	{
		System.out.println("Hello");
	}
}
	//Create Child Class Abstraction1
	//Extends Abstraction1 Class into Abstraction Class
class Abstraction1 extends Abstraction
{
	//Overwrite the run method
	void run()
	{
		System.out.println("Hai i am running");
	}
	//Main method
	public static void main(String[] args) 
	{
		//Create Object for Child Class
		Abstraction1 obj=new Abstraction1();
		obj.run();
		obj.print();
	}
}
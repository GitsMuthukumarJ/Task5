//Create separate Package Inheritance
package Inheritance;

//Create Class Parent
class Parent
{
	//Create public function
public void display()
{
	System.out.println("\n This is parent class");
}
}
	//inheritance method using extends keyword 
class child extends Parent {
	//Create public function
public void display1()
{
	System.out.println("\n This is child class");
}
}
//create a main_fun class
class main_fun
{
		//main function
	public static void main(String[] args)
	{
		//create object for display function
		child o1=new child ();
		o1.display();
		o1.display1();
		}
}
//Create separate package ExceptionHandling
package ExceptionHandling;

//create class Exception
public class Exception
{
	//main method
	public static void main(String[] args)
	{
		//create try block
	try
	{
		int data = 50 / 0;
		//integer array c has length of 1
		int c[]= {1};
		c[42]=99;
	}
	//create catch block for ArithmeticException
	catch (ArithmeticException f)
	{
		System.out.println("divide by 0:" + f);
		
	}
	//create catch block for ArithmeticException
	catch (ArrayIndexOutOfBoundsException k)
	{
		System.out.println("array index oob" + k);
	}
	//Create finally keyword
	finally
	{
		System.out.println("i always executed");
	}
	System.out.println("rest of the code");
	}
}
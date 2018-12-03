//Create separate Package DimentionalArray
package DimentionalArray;

//Create class JavaOneDimArray
public class JavaOneDimArray
{
	//Main method
	public static void main(String[] args)
	{
		/* int a0=50;
		 * int a1=20;
		 * int a2=35;
		 * int a3=40;
		 * int a4=60;
		 * int a5=80;
		 * int a6=70;
		 * int a7=100
		 * 
		 * assign values like separate lines or follow below;
		 */
 //assign integer values
int[]a= {50,20,35,40,60,80,70,100};

//Print values of a[2],a[6] only assigned
System.out.println(a[2]+" "+a[6]);

	//Print the empty line with -------------
System.out.println("------------------");
	//enhanced for create some temporary variable
for(int temp : a)
{
	System.out.println(temp);
}
	//Print the empty line with -------------
System.out.println("------------------");

	//assign integer values
int[] x=new int[4];
x[2]=15;
x[0]=30;
	//enhanced for create temporary variable
for(int temp2 : x)
{
	
	System.out.println(temp2);
}
}
}

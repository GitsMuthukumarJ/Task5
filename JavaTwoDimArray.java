//Create separate Package DimentionalArray
package DimentionalArray;

//Create class JavaTwoDimArray
public class JavaTwoDimArray 
{
	//Main method
	public static void main(String[] args) 
	{
		
		int [][] TwoDim = new int[4][3];
		//assign temporary variable
		int temp = 10;
		//enhanced for int i
		for(int i=0; i<4; i++) 
{
			//enhanced for int j
	for(int j=0; j<3; j++) 
	{
		TwoDim[i][j]=temp;
		//increase temp variable value ++
		temp+= 10;
	}
}
		//enhanced for
for(int i=0; i<4; i++) 
{
	//enhanced for 
	for(int j=0; j<3; j++) 
	{
		System.out.print(TwoDim[i][j]+" ");
		

	}
	//create empty line
	System.out.println();
	}
}
}

//Java program to accept height of a person in centimeter and categorize the
//person according to their height.

import java.util.*;

class height9th12
{
	public static void main(String[] args)
	{
		float height;
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter the height of the person in centimeter: ");
		height = scan.nextFloat();
		if(height<=145)
			System.out.println("The person is having a short height.");
		else if(height>145 && height<=170)
				System.out.println("The person is having average height.");
		     else if(height>170 && height<=195)
			    	System.out.println("The person is tall in height.");
			   	  else
	     			System.out.println("The person is having an abnormal height.");
	    System.out.println();
	}
}
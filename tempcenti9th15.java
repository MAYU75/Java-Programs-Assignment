//Java program to read temperature in centigrade and display a suitable message

import java.util.*;

class tempcenti9th15
{
	public static void main(String[] args)
	{
		int centi;
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter the temperature in centigrade: ");
		centi = scan.nextInt();
		if(centi<0)
			System.out.println("Weather is freezing.");
		else if(centi>=0 && centi<10)
				System.out.println("Weather is very cold.");
		     else if(centi>=10 && centi<20)
			    	System.out.println("Weather is cold.");
			   	  else if(centi>=20 && centi<30)
				  		 System.out.println("Weather is normal.");
					   else if(centi>=30 && centi<40)
				       		  System.out.println("Weather is hot.");
				     		else
		       				  System.out.println("Weather is very hot.");
		System.out.println();
	}
}
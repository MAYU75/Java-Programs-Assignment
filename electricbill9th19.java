//Java program to calculate and print the Electricity bill of a given
//customer. The customer id., name and unit consumed by the user should be taken
//from the keyboard and display the total amount to pay to the customer.
//The charge are as follow :
//Unit charge/unit
//upto 199 @1.20
//200 and above but less than 400 @1.50
//400 and above but less than 600 @1.80
//600 and above @2.00
//If bill exceeds Rs. 400 then a surcharge of 15% will be charged
//and the minimum bill should be of Rs. 100/-

import java.util.*;

class bill
{
	int custid;
	String custname;
	int unitconsumed;
	double billamount;
}

class electricbill9th19
{
	public static void main(String[] args)
	{
		bill b = new bill();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the id of the customer: ");
		b.custid = scan.nextInt();
		System.out.println("Enter the name of the customer: ");
		b.custname = scan.next();
		System.out.println("Enter the number of units consumed by the customer: ");
		b.unitconsumed = scan.nextInt();
		if(b.unitconsumed <= 199)
		{
			b.billamount = b.unitconsumed*1.20f;
		}
		else if(b.unitconsumed >= 200 && b.unitconsumed < 400)
			 {
				b.billamount = b.unitconsumed*1.50f;
			 }
			 else if(b.unitconsumed >= 400 && b.unitconsumed < 600)
			 {
				b.billamount = b.unitconsumed*1.80f;
			 }
			 	  else
			 	  {
					  b.billamount = b.unitconsumed*2.00f;
				  }
		if(b.billamount > 400)
		{
			b.billamount = b.billamount + (0.15*b.billamount);
		}
		if(b.billamount < 100)
		{
			b.billamount = 100;
		}
		System.out.println("Electricity bill of the customer is " + b.billamount);
	}
}

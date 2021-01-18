//Java program to calculate profit and loss on a transaction.

import java.util.*;

class profitloss9th18
{
	public static void main(String[] args)
	{
		 int cp,sp,loss,profit;
		 Scanner scan = new Scanner(System.in);
		 System.out.println("\nEnter the Cost price: ");
		 cp = scan.nextInt();
		 System.out.println("Enter the selling price: ");
		 sp = scan.nextInt();
		 if(sp>cp)
		 {
		    profit=sp-cp;
		    System.out.println("Profit on the transaction is "+ profit);
		 }
		 else
		 {
		    loss=cp-sp;
		    System.out.println("Loss on the transaction is "+ loss);
   		 }
   		 System.out.println();
	}
}
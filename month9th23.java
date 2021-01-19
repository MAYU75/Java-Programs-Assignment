//Java program to read any month number in integer and display month name in word.

import java.util.*;

class month9th23
{
	public static void main(String[] args)
	{
		 int mon;
		 Scanner scan = new Scanner(System.in);
		 System.out.println("\n Enter the month number: ");
		 mon = scan.nextInt();
		 switch(mon)
		 {
		  case 1: System.out.println("\n Month is January.");
			  	  break;
		  case 2: System.out.println("\n Month is February.");
			      break;
		  case 3: System.out.println("\n Month is March.");
			      break;
		  case 4: System.out.println("\n Month is April.");
			      break;
		  case 5: System.out.println("\n Month is May.");
			      break;
		  case 6: System.out.println("\n Month is June.");
			      break;
		  case 7: System.out.println("\n Month is July.");
			 	  break;
		  case 8: System.out.println("\n Month is August.");
			  	  break;
		  case 9: System.out.println("\n Month is September.");
			  	  break;
		  case 10: System.out.println("\n Month is October.");
			  	   break;
		  case 11: System.out.println("\n Month is November.");
			 	   break;
		  case 12: System.out.println("\n Month is December.");
			  	   break;
		  default: System.out.println("\n Wrong choice.");
 		}
 		System.out.println();
	}
}
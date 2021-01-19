//Java program to read any Month Number in integer and display the number of days for this month.

import java.util.*;

class monthdays9th24
{
	public static void main(String[] args)
	{
		 int mon;
		 Scanner scan = new Scanner(System.in);
		 System.out.println("\nEnter the month number: ");
		 mon = scan.nextInt();
		 switch(mon)
		 {
		  case 1: System.out.println("\nMonth is January. It has 31 days.");
			  	  break;
		  case 2: System.out.println("\nMonth is February. It has 28/29 days.");
			  	  break;
		  case 3: System.out.println("\nMonth is March. It has 31 days.");
			  	  break;
		  case 4: System.out.println("\nMonth is April. It has 30 days.");
			      break;
		  case 5: System.out.println("\nMonth is May. It has 31 days.");
			  	  break;
		  case 6: System.out.println("\nMonth is June. It has 30 days.");
			  	  break;
		  case 7: System.out.println("\nMonth is July. It has 31 days.");
			  	  break;
		  case 8: System.out.println("\nMonth is August. It has 31 days.");
			  	  break;
		  case 9: System.out.println("\nMonth is September. It has 30 days.");
			  	  break;
		  case 10: System.out.println("\nMonth is October. It has 31 days.");
			  	   break;
		  case 11: System.out.println("\nMonth is November. It has 30 days.");
			  	   break;
		  case 12: System.out.println("\nMonth is December. It has 31 days.");
			  	   break;
		  default: System.out.println("\nInvalid month.");
 		}
	}
}

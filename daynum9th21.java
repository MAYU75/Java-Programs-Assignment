//Java program to read any day number in integer and display day name in word.

import java.util.*;

class daynum9th21
{
	public static void main(String[] args)
	{
		 int num;
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter a number from 1 to 7: ");
		 num = scan.nextInt();
		 switch(num)
		 {
		  case 1: System.out.println("Monday");
			  	  break;
		  case 2: System.out.println("Tuesday");
			      break;
		  case 3: System.out.println("Wednesday");
			      break;
		  case 4: System.out.println("Thursday");
			      break;
		  case 5: System.out.println("Friday");
			      break;
		  case 6: System.out.println("Saturday");
			      break;
		  case 7: System.out.println("Sunday");
			      break;
		  default: System.out.println("Wrong choice.");
 		}
	}
}
//Java program to read any digit, display in the word

import java.util.*;

class digit9th22
{
	public static void main(String[] args)
	{
		int digit;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter digit(0-9) : ");
   		digit = scan.nextInt();
   		switch(digit)
   		{
	 		case 0: System.out.println("Zero");
	       			break;
	       	case 1: System.out.println("one");
	       			break;
			case 2: System.out.println("Two");
	       			break;
			case 3: System.out.println("Three");
	       			break;
			case 4: System.out.println("Four");
	       			break;
			case 5: System.out.println("Five");
	       			break;
			case 6: System.out.println("Six");
	       			break;
			case 7: System.out.println("Seven");
	       			break;
			case 8: System.out.println("Eight");
	       			break;
			case 9: System.out.println("Nine");
	       			break;
			default:System.out.println("Invalid digit.");
	       break;
       }
	}
}
